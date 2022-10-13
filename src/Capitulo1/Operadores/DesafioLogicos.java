package Capitulo1.Operadores;

public class DesafioLogicos
{
    public static void main(String[] args)
    {
        //trabalho terca
        //trabalho quinta
        //dois ok = TV 50 pol no final de semana
        //um ok = tv de 32
        //ou 50 ou 32 = sorvete
        //dois #fon = casa sem sorvete

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean tv50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;

        System.out.println("Ficar em casa -> " + (!tv50 && !tv32));
        System.out.println("Comprar TV -> " + (tv50 || tv32));
        System.out.println("TV 50 -> " + (tv50 == true));
        System.out.println("TV 32 -> " + (tv32 == true));
        System.out.println("Tomar sorvete -> " + (tv50 || tv32));
    }
}
