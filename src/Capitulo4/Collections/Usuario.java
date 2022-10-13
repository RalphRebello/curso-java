package Capitulo4.Collections;

import java.util.Objects;

public class Usuario
{
//############ ATRIBUTOS ###################
    String nome;

//############ CONSTRUTORES ###################
    Usuario(String nome)
    {
        this.nome = nome;
    }


//############ METODOS ###################
    public String toString()
    {
        return "Meu nome é " + this.nome + ".";
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(nome);
    }
}
