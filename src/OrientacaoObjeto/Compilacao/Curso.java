package OrientacaoObjeto.Compilacao;

import java.util.ArrayList;
import java.util.List;

public class Curso 
{
	//atributos
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	//construtores
	Curso(String nome)
	{
		this.nome = nome;
	}
	
	//metodos
	void adicionarAluno(Aluno aluno)
	{
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
