package Capitulo1.Tipos;

public class TiposPrimitivos
{
    public static void main(String[] args)
    {
        //tipos numericos inteiros
        byte anosdeempresa = 23;
        short numerodevoos = 542;
        int id = 56789;
        long pontosacumulados = 3_134_845_223L; //separa casas decimais com _ (UL)

        //tipos numericos reais
        //pra usar float coloca 'F' no final do numero para indicar que não
        //é um double

        float salario = 11_445.44F;
        double vendasacumuladas = 2_991_797_103.01;

        //tipo booleano
        boolean estadeferias = false;
        //boolean estadeferias = true;

        //tipo caracter
        char status = 'a';

        System.out.println(anosdeempresa * 365);
        System.out.println(numerodevoos / 2);
        System.out.println(pontosacumulados / vendasacumuladas);
        System.out.println(id +" ganha -> " + salario);
        System.out.println("Ferias -> " + estadeferias);
        System.out.println("Status -> " + status);
    }
}
