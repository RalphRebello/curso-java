package Capitulo1.Conversoes;

public class TiposNumericos
{
    public static void main(String[] args)
    {
        double a = 1; //conversão implicita int to double
        System.out.println(a);

        //cast -> conversão de tipo primitivo <- (tipo)
        float b = (float) 1.123456789; //conversao explicita (cast)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; //conversao explicita (cast)
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e; //conversao explicita (cast)
        System.out.println(f);
    }
}
