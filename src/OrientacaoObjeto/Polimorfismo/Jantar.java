package OrientacaoObjeto.Polimorfismo;

public class Jantar 
{
	public static void main(String[] args) 
	{
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.25);
		Feijao ingrediente2 = new Feijao(0.180);
		//classe abstrata COMIDA
		Comida ingrediente3 = new Sorvete(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.Comer(ingrediente1);
		convidado.Comer(ingrediente2);
		convidado.Comer(ingrediente3);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		convidado.Comer(sobremesa);
		System.out.println(convidado.getPeso());
	}
}
