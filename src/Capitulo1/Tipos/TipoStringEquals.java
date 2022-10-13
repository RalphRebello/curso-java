package Capitulo1.Tipos;

import java.util.Scanner;

public class TipoStringEquals
{
    public static void main(String[] args)
    {
        System.out.println("2" == "2");

        String s = new String("2");

        System.out.println("2" == s);
        System.out.println("2".equals(s)); // .equals() compara o conteudo

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next(); // .next() e .nextLine()
        // .next() tira espaços em branco .nextLine() não tira

        System.out.println("2" == s2.trim());
        // .trim() retira os espaços em branco
        System.out.println("2".equals(s2.trim()));

        entrada.close();
    }
}
