package Capitulo1.Operadores;

public class Ternarios
{
    public static void main(String[] args)
    {
        double media = 7.6;

        //teste ? resultado_a : resultado_b
        String resultadoRecuperacao =
                media >= 5.0 ? "em Recuperaçao" : "Reprovado";
        String resultado =
                media >= 7.0 ? "Aprovado" : resultadoRecuperacao;

        System.out.println("O aluno está " + resultado);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String status = temDesconto ? "Sim" : "Não";

        System.out.println("tem desconto? " + status);
    }
}
