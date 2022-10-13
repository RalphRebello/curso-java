package Capitulo4.Array;

import java.util.Arrays;

public class ExercicioForEach
{
    public static void main(String[] args)
    {
        double notasAlunoA[] = new double[4];

        //System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;

        for(double nota: notasAlunoA)
        {
            total += nota;
        }

        System.out.println(total/notasAlunoA.length);

        double notasAlunoB[] = {6.9, 8.9, 5.5, 10};

        System.out.println(Arrays.toString(notasAlunoB));

        for(double nota: notasAlunoB)
        {
            total += nota;
        }

        System.out.println(total/notasAlunoA.length);
    }
}
