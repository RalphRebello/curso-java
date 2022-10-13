package OrientacaoObjeto.Heranca.programaPrincipal;

import OrientacaoObjeto.Heranca.Direcao;
import OrientacaoObjeto.Heranca.Heroi;
import OrientacaoObjeto.Heranca.Monstro;

public class Jogo 
{
	public static void main(String[] args) 
	{
		Monstro monstro = new Monstro(10, 10);
		//Monstro monstro = new Monstro(10, 10);
		//monstro.x = 10;
		//monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);	
		//heroi.x = 10;
		//heroi.y = 11;
		
		System.out.println("Posição monstro " + monstro.x + "|" + monstro.y);
		System.out.println("Vida monstro " + monstro.vida);
		
		System.out.println("Posição heroi " + heroi.x + "|" + heroi.y);
		System.out.println("Vida heroi " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.SUL);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Posição monstro " + monstro.x + "|" + monstro.y);
		System.out.println("Vida monstro " + monstro.vida);
		
		System.out.println("Posição herio " + heroi.x + "|" + heroi.y);
		System.out.println("Vida herio " + heroi.vida);
		
		/*
		 * System.out.println(j1.x + "|" + j1.y);
		 * 
		 * j1.andar(Direcao.NORTE); System.out.println(j1.x + "|" + j1.y);
		 * j1.andar(Direcao.LESTE); System.out.println(j1.x + "|" + j1.y);
		 * j1.andar(Direcao.OESTE); System.out.println(j1.x + "|" + j1.y);
		 * j1.andar(Direcao.SUL); System.out.println(j1.x + "|" + j1.y);
		 */
	}
}
