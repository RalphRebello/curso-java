package Capitulo3.Classe;

public class Data
{
//############ ATRIBUTOS ###################
    int dia;
    int mes;
    int ano;

//############ CONSTRUTORES ###################
    Data()
    {
        this(1, 1, 1970); //chama o outro construtor e passa os parametros
    }

    Data(int dia, int mes, int ano)
    {
        this.dia = dia; //caso queria chamar o mesmo nome para evitar o conflito
        this.mes = mes; //usa-se o this. .
        this.ano = ano;
    }

//############ METODOS ###################
    String obterDataFormatada()
    {
        final String formato = "Data -> %d/%d/%d ";
        return String.format(formato, dia, mes, ano);
        //return dia.toString().concat("/").concat(mes).concat("/").
        //	   concat(ano.toString());
    }
}
