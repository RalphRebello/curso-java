package Capitulo4.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado
{
    public static void main(String[] args)
    {
        //Set <String> e HashSet<String> -> define o tipo da lista
        //Set<String> lista = new HashSet<String>();
        SortedSet<String> lista = new TreeSet<>(); //no segundo da pra usar apenas '<>'
        
        //SortedSet e TreeSet ordena o conjunto

        lista.add("Ralph"); //é possivel adicionar apenas strings por causa da 
        lista.add("Hina");  //pré definição em Set<String> ou SortedSet<String>
        lista.add("Nala");
        lista.add("Nick");

        for(String candidato : lista)
        {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>(); //no segundo da pra usar apenas '<>'

        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n : nums)
        {
            System.out.println(n);
        }
    }
}
