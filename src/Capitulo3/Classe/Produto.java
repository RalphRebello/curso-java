package Capitulo3.Classe;

public class Produto
{
//############ ATRIBUTOS ###################
    String nome;
    double preco;
    static double desconto = 0.25;

//############ CONSTRUTORES ###################
    Produto()
    {

    }

    Produto(String nomeInicial, double precoInicial)
    {
        nome = nomeInicial;
        preco = precoInicial;
    }

//############ METODOS ###################
    double precoComDesconto()
    {
        return preco * (1-desconto);
    }
	/*double precoComDesconto(double novoDesconto)
	{
		return preco * (1-(desconto+novoDesconto));
	}*/
}
