package OrientacaoObjeto.Compilacao.Desafio;

import java.util.ArrayList;

public class Compra 
{
	//atributos
	ArrayList<Item> itens_compra = new ArrayList<>();
	
	//construtor
	Compra()
	{
		
	}
	
	Compra(Item item)
	{
		this.itens_compra.add(item);
	}
	
	//metodo
	double obterValorItens()
	{
		double ValorTotalItens = 0;
		
		for(Item item: itens_compra)
		{
			ValorTotalItens += item.quantidade * item.produto.preco;
		}
		
		return ValorTotalItens;
	}
}
