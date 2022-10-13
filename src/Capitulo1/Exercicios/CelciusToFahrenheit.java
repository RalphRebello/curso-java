package Capitulo1.Exercicios;

import java.util.Scanner;

public class CelciusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura em °C -> ");
        double temp_C = entrada.nextDouble();

        double temp_F = ((temp_C * (5.0/9)) + 32);

        System.out.printf("Temperatura em °C %.2f", temp_C);
        System.out.printf("\nTemperatura em °F %.2f", temp_F);

        entrada.close();
    }
}
