package Capitulo2.Continue;

public class ContinueRotulado
{
    public static void main(String[] args)
    {
        externo:for (int i = 0; i < 3; i++) //rotulo
        {
            for (int j = 0; j < 3; j++)
            {
                if(i==1)
                    //continue; //continue normal
                    continue externo; //usando continue rotulado

                System.out.printf("[%d %d] ", i, j);
            }
            System.out.println();
        }
    }
}
