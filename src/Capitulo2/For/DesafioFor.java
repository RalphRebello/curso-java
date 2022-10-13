package Capitulo2.For;

public class DesafioFor
{
    public static void main(String[] args)
    {
        //não usar valor numerico pra controlar o for
        for(String valor = "#"; valor.equals("######") != true; valor += "#" )
        {
            System.out.println(valor);
        }
    }
}
