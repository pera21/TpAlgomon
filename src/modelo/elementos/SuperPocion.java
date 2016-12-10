package modelo.elementos;

import modelo.algomon.Algomon;

public class SuperPocion implements Elemento {
	
	private int usos;
	private int vidaRegenerada;
	
	public SuperPocion(){
		this.usos = 2;
		this.vidaRegenerada = 40;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) {
		if(this.usos > 0){
			algomon.getVida().aumentarVida(vidaRegenerada);
			this.usos -= 1;
		}
	}
	
	public int usosRestantes(){
		return this.usos;
	}

}
