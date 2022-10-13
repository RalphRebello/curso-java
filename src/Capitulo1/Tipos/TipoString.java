package Capitulo1.Tipos;

public class TipoString
{
    public static void main(String[] args)
    {
        System.out.println("Ola pessoal".charAt(7));//charAt pega a posição str

        String s = "Boa tarde";

        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toUpperCase().startsWith("BOA"));
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Ralph";
        var sobrenome = "Rebello";
        var idade = 29;
        var salario = 12345.987F;

        System.out.println("\n\nNome: " + nome + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade + "\nSalario: " + salario);

        System.out.printf("\n\nNome: %s %s tem %d \ne ganha %.2f",
                nome, sobrenome, idade, salario);

        String frase = String.format("\n\nNome: %s %s tem %d \ne ganha %.2f",
                nome, sobrenome, idade, salario);

        System.out.println(frase);
    }
}
