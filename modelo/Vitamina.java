package modelo;

import java.util.Collection;
import java.util.EnumMap;

public class Vitamina implements Elemento {
	
	private int usos;
	private int cantidadAtaquesRegenerados;
	
	public Vitamina(){
		this.usos = 5;
		this.cantidadAtaquesRegenerados = 2;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) {
		Collection<Poder> poderes = algomon.getPoderes().values();
		for (Poder cadaPoder : poderes){
			cadaPoder.modificarCantidadAtaques(this.cantidadAtaquesRegenerados);
		}
		this.usos -= 1;
	}
	
	public int usosRestantes(){
		return this.usos;
	}

}
