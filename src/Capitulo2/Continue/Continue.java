package Capitulo2.Continue;

public class Continue
{
    public static void main(String[] args)
    {
        //continue interrompe a iteração atual e vai para a proxima
        for (int i = 0; i < 10; i++)
        {
            if(i%2 == 1)
                continue;

            System.out.println(i);
        }

        for (int i = 0; i < 10; i++)
        {
            if(i == 5)
                continue;

            System.out.println(i);
        }
    }
}
