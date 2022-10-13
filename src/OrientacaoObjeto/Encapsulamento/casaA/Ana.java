package OrientacaoObjeto.Encapsulamento.casaA;

public class Ana 
{
	//atributos
	@SuppressWarnings("unused")
	private String segredo = "..."; //pode ver apenas dentro da classe
	String facoDentroDeCasa = "..."; //atributo default (classe)
	protected String formaDeFalar = "..."; //protected (apenas por herança)
	public String todosSabem = "...";	//todos pode ver
}
