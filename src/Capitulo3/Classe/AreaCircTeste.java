package Capitulo3.Classe;

public class AreaCircTeste
{
    public static void main(String[] args)
    {
        AreaCirc a1 = new AreaCirc(10);
        //a1.pi = 10;

        //AreaCirc.pi = 3.1415;

        System.out.println(a1.area()); //pertence a instancia (objeto)
        System.out.println(AreaCirc.area(100)); //metodo que pertence a classe
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
