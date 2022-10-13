package Capitulo4.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha 
{
	public static void main(String[] args) 
	{
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Don quixote");
		livros.push("O Hobbit");
		
		for(String livro : livros)
		{
			System.out.println(livro);
		}
		
		System.out.println("\n");
		
//		System.out.println(livros.peek());
//		System.out.println(livros.element());
		
		System.out.println(livros.pop()); //lança exceção no caso de pilha vazia
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//fila.clear();
		//fila.size();
		//fila.is Empty();
		//fila.contains(...);
	}

}
