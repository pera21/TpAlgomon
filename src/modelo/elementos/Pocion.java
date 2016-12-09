package modelo.elementos;

import modelo.algomon.Algomon;

public class Pocion implements Elemento{
	
	private int usos;
	private int vidaRegenerada;
	
	public Pocion(){
		this.usos = 4;
		this.vidaRegenerada = 20;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) {
		algomon.getVida().aumentarVida(vidaRegenerada);
		this.usos -= 1;
	}
	
	public int usosRestantes(){
		return this.usos;
	}

}
