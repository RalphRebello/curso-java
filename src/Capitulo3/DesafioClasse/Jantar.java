package Capitulo3.DesafioClasse;

public class Jantar
{
    public static void main(String[] args)
    {
        Pessoa pessoa1 = new Pessoa("José", 99.8);

        Comida comida1 = new Comida("Carne", 0.500);
        Comida comida2 = new Comida();

        int contComer = 0;

        System.out.printf("%s %.2fkg -> refeição %d", pessoa1.nomePessoa,
                           pessoa1.pesoPessoa, contComer);
        contComer += pessoa1.comer(comida1);

        System.out.printf("\n%s %.2fkg -> refeição %d",
                           pessoa1.nomePessoa, pessoa1.pesoPessoa, contComer);
        contComer += pessoa1.comer(comida2);

        System.out.printf("\n%s %.2fkg -> refeição %d",
                     pessoa1.nomePessoa, pessoa1.pesoPessoa, contComer);
    }
}
