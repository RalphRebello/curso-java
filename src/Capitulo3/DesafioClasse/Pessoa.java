package Capitulo3.DesafioClasse;

public class Pessoa
{
//############ ATRIBUTOS ###################
    String nomePessoa;
    double pesoPessoa;

//############ CONSTRUTORES ###################
    Pessoa()
    {
        this("Desconhecido", 0.0);
    }

    Pessoa(String nomePessoa, double pesoPessoa)
    {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }

//############ METODOS ###################

    int comer(Comida comida)
    {
        if(comida != null)
        {
            this.pesoPessoa += comida.pesoComida;
        }

        return 1;
    }
}
