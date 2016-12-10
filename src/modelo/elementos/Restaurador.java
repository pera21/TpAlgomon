package modelo.elementos;

import modelo.algomon.Algomon;

public class Restaurador implements Elemento {
	
	private int usos;
	
	public Restaurador(){
		this.usos = 3;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) {
		if(this.usos > 0){
			algomon.estadoNormalEfimero();
			algomon.estadoNormalPersistente();
			this.usos -= 1;
		}
	}
	
	public int usosRestantes(){
		return this.usos;
	}

}
