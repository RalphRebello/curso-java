package Capitulo1.Exercicios;

import java.util.Scanner;

public class FahrenheitToCelcius
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura °F -> ");
        double temp_F = entrada.nextDouble();

        double temp_C = ((temp_F - 32) * (5.0/9)); //na divisão colocar .0 para
        //não tratar como int

        System.out.printf("\nTemperatura °F %.2f", temp_F);
        System.out.printf("\nTemperatura °C %.2f", temp_C);

        entrada.close();
    }
}
