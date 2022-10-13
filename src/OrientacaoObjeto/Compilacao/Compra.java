package OrientacaoObjeto.Compilacao;

import java.util.ArrayList;

public class Compra 
{
	//atributos
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	//construtores
	
	//metodos
	double obterValorTotal()
	{
		double total = 0;
		
		for(Item item: itens)
		{
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}