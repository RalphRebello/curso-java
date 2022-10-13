package Capitulo3.Classe;

public class DataTeste
{
    public static void main(String[] args)
    {
        Data data1 = new Data(13, 2, 1992);
        var data2 = new Data();

		/*data1.dia = 13;
		data1.mes = 02;
		data1.ano = 1992;

		data2.dia = 23;
		data2.mes = 02;
		data2.ano = 1993;*/

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());
    }
}
