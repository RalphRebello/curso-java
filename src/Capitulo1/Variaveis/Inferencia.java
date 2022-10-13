package Capitulo1.Variaveis;

public class Inferencia
{
    public static void main(String[] args)
    {
        double a = 4.5;
        System.out.println(a);

        //uasndo var o java infere que b é do tipo double por causa do valor
        //adicionado à variavel
        var b = 4.5;
        System.out.println(b);

        //infere que é string pq o valor é um texto
        var c = "Coisera";
        System.out.println(c);
    }
}
