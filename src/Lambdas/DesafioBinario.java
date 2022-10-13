package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBinario 
{
	public static void main(String[] args) 
	{				
		Function<Produto, Double> precoFinal = 
			produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> impostoMunicipal = 
			preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete = 
			perco -> perco >= 3000 ? perco + 100 : perco + 50;
		
//		UnaryOperator<Double> arredondar =
//			preco -> Double.parseDouble(String.format("%.2f", preco.floatValue()));
//
//		Function<Double, String> formatar =
//				valor_final -> ("R$" + valor_final).replace(".", ",");

		Function<Double, String> arredondar =
				preco -> {
					String prc = "" + preco.floatValue();;
					String final_prc = "";
					int cont = 0;
					char[] chars = prc.toCharArray();

					for(char ch: chars)
					{
						if(cont < prc.length() - 2)
							final_prc += ch;
						cont++;
					}

					return final_prc;
				};

		UnaryOperator<String> formatar =
				preco -> ("R$" + preco).replace(".", ",");
		
		
		Produto p = new Produto("Ipad", 3235.89, 0.25);		
		String preco = precoFinal
					   .andThen(impostoMunicipal)
					   .andThen(frete)
					   .andThen(arredondar)
					   .andThen(formatar)
					   .apply(p);
		
		System.out.println("O preço final é " + preco);
	}
}
