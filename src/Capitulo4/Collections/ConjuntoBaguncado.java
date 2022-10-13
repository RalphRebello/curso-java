package Capitulo4.Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado
{
    @SuppressWarnings({ "rawtypes", "unchecked" }) //impede os warnings
	public static void main(String[] args)
    {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //converte do tipo primitivo para o Wrapper
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é -> " + conjunto.size());

        conjunto.add("teste");
        System.out.println("Tamanho é -> " + conjunto.size());

        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é -> " + conjunto.size());
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();  //a principio colocar 'Set' eh ok

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(conjunto);
        System.out.println(nums);

        conjunto.addAll(nums); //uniao de dois conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums); //interceçao do conjunto (oq tem em comum)
        System.out.println(conjunto);

        conjunto.clear(); //limpa o conjunto
        System.out.println(conjunto);
    }
}
