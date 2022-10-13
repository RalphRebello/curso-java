package Capitulo1.Variaveis;

public class AreaCircunferencia
{
    public static void main(String[] args)
    {
        double raio = 3.4;
        //usar palavra reservada 'final' bloqueia variavel e torna em constante
        final double PI = 3.14159;
        double area = PI * raio * raio;

        System.out.println("Area 1 " + area);

        raio = 10;

        area = PI * raio * raio;

        System.out.println("Area 2 " + area);
    }
}
