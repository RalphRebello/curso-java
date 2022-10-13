package Capitulo4.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila 
{
	public static void main(String[] args) 
	{
		Queue<String> fila = new LinkedList<>();
		
		//offer e add adicionam elementos na fila
		//diferença é o comportamento quando a fila está cheia e tenta add +1 elemento
		fila.add("Ana"); //retorna falso -> fila cheia
		fila.offer("Bia"); // lança uma exceção -> fila cheia
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		//diferença entre peek e element é quando a fila ta vazia
		System.out.println(fila.peek()); //retorna falso
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lança uma exceção
		System.out.println(fila.element());
		
		//diferença entre remove e poll é quando a fila ta vazia
		//remove mostra o proximo e remove
		//peek mostra o proximo sem remover
		System.out.println(fila.remove()); //lança uma exceção
		System.out.println(fila.remove());
		System.out.println(fila.poll()); //retorna falso
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//fila.clear();
		//fila.size();
		//fila.is Empty();
		//fila.contains(...);
		
	}

}
