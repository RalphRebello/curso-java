package OrientacaoObjeto.Compilacao;

import java.util.ArrayList;

public class Aluno 
{
	//atributos
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	//construtores
	Aluno(String nome)
	{
		this.nome = nome;
	}
	
	//metodos
	void adicionarCurso(Curso curso)
	{
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome)
	{
		for(Curso curso: this.cursos)
		{
			if(curso.nome.equalsIgnoreCase(nome))
			{
				return curso;
			}
		}
		return null;
	}
	
	public String toString()
	{
		return nome;
	}

}
