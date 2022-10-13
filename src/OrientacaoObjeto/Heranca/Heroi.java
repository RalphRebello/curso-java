package OrientacaoObjeto.Heranca;

public class Heroi extends Jogador 
{
	
	public Heroi(int x, int y)
	{
		super(x, y);
	}
	
	public boolean atacar(Jogador oponente)
	{
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
	
	
	
	  //boolean atacar(Jogador oponente) 
	  //{ 
	//	  int difX = Math.abs(x - oponente.x); int
	//	  difY = Math.abs(y - oponente.y);
	// 
	//	  if(difX == 0 && difY == 1) 
	//	  { 
	//		  oponente.vida -= 20; return true; 
	//	  } 
	//	  else if(difX == 1 && difY == 0) 
	//	  { 
	//		  oponente.vida -= 20; 
	//		  return true; 
	//	  } 
	//	  else return false; 
	//	  }
	 
}
