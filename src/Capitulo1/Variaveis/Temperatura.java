package Capitulo1.Variaveis;

public class Temperatura
{
    public static void main(String[] args)
    {
        float f = 67;
        final int const_a = 32;
        final double const_b = 5.0/9;

        double c = (f - const_a) * const_b;

        System.out.println(f + " °F | " + c + " °C");
    }
}
