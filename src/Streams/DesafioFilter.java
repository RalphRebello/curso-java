package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter 
{
	public static void main(String[] args) 
	{
		AlunoAcademia aluno1 = new AlunoAcademia("Ralph", 30, false);
		AlunoAcademia aluno2 = new AlunoAcademia("Hina", 29, true);
		AlunoAcademia aluno3 = new AlunoAcademia("Otavio", 15, false);
		AlunoAcademia aluno4 = new AlunoAcademia("Rita", 45, false);
		AlunoAcademia aluno5 = new AlunoAcademia("Olavo", 22, true);
		AlunoAcademia aluno6 = new AlunoAcademia("Henrique", 26, true);
		AlunoAcademia aluno7 = new AlunoAcademia("Carlos", 44, false);
		AlunoAcademia aluno8 = new AlunoAcademia("Creuza", 18, true);
		AlunoAcademia aluno9 = new AlunoAcademia("Antonio", 56, true);
		AlunoAcademia aluno10 = new AlunoAcademia("Bete", 58, false);
		
		List<AlunoAcademia> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, 
												   aluno6, aluno7, aluno8, aluno9, aluno10);
		
		Predicate<AlunoAcademia> verificaIdade = a -> a.idade >= 26;
		Predicate<AlunoAcademia> devedor = a -> !a.adimplente;
		Function<AlunoAcademia, String> listaVelhosDevedores = a -> "Velho(a) " + a.nome +
																	" voce nos deve, Pague!";
				
		alunos.stream()
			.filter(verificaIdade)
			.filter(devedor)
			.map(listaVelhosDevedores)
			.forEach(System.out::println);	
	}
}
