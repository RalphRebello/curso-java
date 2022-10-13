package Capitulo3.DesafioClasse;

public class Comida
{
//############ ATRIBUTOS ###################
    String nomeComida;
    double pesoComida;

//############ CONSTRUTORES ###################
    Comida()
    {
        this("pudim", 0.100);
    }

    Comida(String nomeComida, double pesoComida)
    {
        this.nomeComida = nomeComida;
        this.pesoComida = pesoComida;
    }

//############ METODOS ###################
}
