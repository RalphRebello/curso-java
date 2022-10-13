package Capitulo2.IF;

public class DesafioIF
{
    public static void main(String[] args)
    {
        double nota = 9.5;

        if(nota >= 9.0)// ;//o ponto e virgula é o problema indica o fim de uma
        //sentença de código, e faz os prints ficarem fora do
        //bloco do IF.
        {
            System.out.println("Quadro de Honra!");
            System.out.println("Você é FERA!!!");
        }
    }
}
