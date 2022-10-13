package OrientacaoObjeto.Compilacao.Desafio;

public class Teste_compra 
{
	public static void main(String[] args) 
	{
		Produto p1 = new Produto("caneta", 2.00);
		Produto p2 = new Produto("lapis", 1.50);
		Produto p3 = new Produto("regua", 3.00);
		Produto p4 = new Produto("apontador", 0.50);
		Produto p5 = new Produto("borracha", 1.30);
		Produto p6 = new Produto("corretivo", 4.00);
		
		Item i0 = new Item(20, p1);
		Item i1 = new Item(12, p2);
		Item i2 = new Item(5, p3);
		Item i3 = new Item(24, p4);
		Item i4 = new Item(45, p5);
		Item i5 = new Item(3, p6);
		Item i6 = new Item(67, p1);
		Item i7 = new Item(22, p2);
		Item i8 = new Item(13, p3);
		Item i9 = new Item(8, p4);
		
		
		Compra c1 = new Compra(i0);
		c1.itens_compra.add(i5);
		c1.itens_compra.add(i9);
		c1.itens_compra.add(i4);
		
		
		Compra c2 = new Compra(i1);
		c2.itens_compra.add(i0);
		c2.itens_compra.add(i3);
		c2.itens_compra.add(i7);
		c2.itens_compra.add(i2);
		
		Compra c3 = new Compra(i1);
		c3.itens_compra.add(i6);
		c3.itens_compra.add(i3);
		c3.itens_compra.add(i8);
		c3.itens_compra.add(i2);
		
		
		Cliente cl1 = new Cliente("Ralph", c1);
		cl1.compras.add(c2);
		cl1.compras.add(c3);
		
		Cliente cl2 = new Cliente("Hina", new Compra(i9));
		
		System.out.println(cl2.nome + cl2.compras.get(0).toString());
		
		System.out.println("primeiro produto " + cl1.nome
				           + " e o total da compra é " 
				           + cl1.obterValorTotal());
	}
}
