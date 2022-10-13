package Capitulo1.Operadores;

public class DesafioAritimeticos
{
    public static void main(String[] args)
    {
        double a = Math.pow(6*(3+2), 2);
        double b = 3*2;
        double fracao1 = a/b;

        double fracao2 = Math.pow(((1-5)*(2-7))/2.0, 2);

        double c = Math.pow(fracao1 - fracao2, 3);
        double d = Math.pow(10, 3);
        double fracao3 = c/d;

        System.out.println("Resultado -> " + fracao3);
    }
}
