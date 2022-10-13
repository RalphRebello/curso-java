package Capitulo2.For;

public class For3
{
    public static void main(String[] args)
    {
        /*int i = 0;

		for(; i < 10; i++)
		{
			System.out.println(i);
		}
		System.out.println("i fora do for -> " + i); */

        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.println("i -> " + i + " | j -> " + j);
            }
        }
    }
}
