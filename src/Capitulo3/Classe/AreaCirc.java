package Capitulo3.Classe;

public class AreaCirc
{
//############ ATRIBUTOS ###################
    double raio;
    static final double PI = 3.1415; //pertence a classe

//############ CONSTRUTOR ###################
    AreaCirc(double raioInicial)
    {
        raio = raioInicial;
    }

//############ METODOS ###################
    double area()
    {
        return PI * Math.pow(raio, 2);
    }

    static double area(double raioInicial) //pertence a classe
    {
        return PI * Math.pow(raioInicial, 2);
    }
}
