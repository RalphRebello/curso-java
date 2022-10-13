package Capitulo2.Break;

public class BreakRotulado
{
    public static void main(String[] args)
    {
        externo:for (int i = 0; i < 3; i++) //rotulo
        {
            for (int j = 0; j < 3; j++)
            {
                if(i==1)
                    //break; //break normal
                    break externo; //usando break rotulado

                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();
        }
    }
}
