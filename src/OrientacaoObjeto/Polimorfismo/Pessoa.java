package OrientacaoObjeto.Polimorfismo;

public class Pessoa 
{
	//atributo
		private double peso;

		//const
		public Pessoa(double peso)
		{
			setPeso(peso);
		}
		
		//metodos
		public void Comer(Comida comida)
		{
			this.peso += comida.getPeso();
		}
		
		public double getPeso() 
		{
			return peso;
		}

		public void setPeso(double peso) 
		{
			if(peso >= 0)
				this.peso = peso;
		}
}
