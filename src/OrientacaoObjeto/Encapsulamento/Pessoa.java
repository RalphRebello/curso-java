package OrientacaoObjeto.Encapsulamento;

public class Pessoa 
{
	//atributo
	private int idade;
	private String nome;
	private String sobrenome;
	
	//contrutor
	public Pessoa(String nome, String sobrenome, int idade)
	{
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
		//this.idade = idade;
	}
	
	//metodos
	//metodo Getter
	public int getIdade()
	{
		return idade;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public String getSobrenome() 
	{
		return sobrenome;
	}
	
	public String getNomeCompleto()
	{
		return(getNome() + " " + getSobrenome());
	}

	//Metodo Setter
	public void setIdade(int novaIdade)
	{
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120)
			this.idade = novaIdade;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) 
	{
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String toString() {
		return "Ola eu sou o " + getNome()
				+ " e tenho " + getIdade();
	}	
}
