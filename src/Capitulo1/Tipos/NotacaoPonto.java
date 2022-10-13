package Capitulo1.Tipos;

public class NotacaoPonto
{
    public static void main(String[] args)
    {
        double a = 2.3;
        String s = "Bom dia X";
        s = s.replace("X", "Senhora").toUpperCase().concat("!!!");

        System.out.println(s + a);
    }
}
//tipos primitivos não tem o operador '.' para usar atributos