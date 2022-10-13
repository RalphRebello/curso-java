package Capitulo1.Operadores;

public class Unarios
{
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;

        //Posfix
        a++; // mesmo que a = a + 1;
        a--; // mesmo que a = a - 1;

        //Prefix
        ++b; //mesmo que b = b + 1;
        --b; //mesmo que b = b - 1;

        System.out.println(a);
        System.out.println(b);

        System.out.println(++a == b--);

        System.out.println(a);
        System.out.println(b);
    }
}
