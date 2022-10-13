package Capitulo3.Classe;

public class ProdutoTeste
{
    public static void main(String[] args)
    {
        //tipo | nome | atribuição | construtor
        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto(); //igual ao de cima, cria instancias

        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        double precoFinal1 = p1.precoComDesconto(); //faz o mesmo
        double precoFinal2 = p2.precoComDesconto(); //faz o mesmo

        System.out.printf("Produto %s: Valor -> %.2f", p1.nome, precoFinal1);
        System.out.printf("\nProduto %s: Valor -> %.2f", p2.nome, precoFinal2);

        Produto.desconto = 0.35; //update desconto

        precoFinal1 = p1.precoComDesconto();
        precoFinal2 = p2.precoComDesconto();

        System.out.println();
        System.out.printf("\nProduto %s: Valor -> %.2f", p1.nome, precoFinal1);
        System.out.printf("\nProduto %s: Valor -> %.2f", p2.nome, precoFinal2);

        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("\n\nMedia de valor do carrinho %.2f", mediaCarrinho);
    }
}
