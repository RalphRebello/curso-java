package Capitulo4.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lista
{
    public static void main(String[] args)
    {
        List<Usuario> lista = new ArrayList<>();
        //ArrayList<Usuario> lista = new ArrayList<>(); mesmo que o de cima

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3).nome);

        //lista.remove(1);
        //lista.remove(new Usuario("Manu"));
        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));

        for (Usuario u : lista)
        {
            System.out.println(u.nome);
            //chamando apenas 'u' ele aciona o metodo toString
        }	//dentro do objeto 'Usuário' e se usar 'u.nome' ele imprime apenas o nome
    }
}
