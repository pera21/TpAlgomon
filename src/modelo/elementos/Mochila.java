package modelo.elementos;

import java.util.ArrayList;

import modelo.algomon.Algomon;

public class Mochila {
	
	private Pocion pocion;
	private SuperPocion superPocion;
	private Vitamina vitamina;
	private Restaurador restaurador;
	
	public Mochila(){
		pocion = new Pocion();
		superPocion = new SuperPocion();
		vitamina = new Vitamina();
		restaurador = new Restaurador();
	}

	public void utilizarPocion(Algomon algomon) {
		this.pocion.aplicarEfecto(algomon);
	}
	
	public void utilizarSuperPocion(Algomon algomon) {
		this.superPocion.aplicarEfecto(algomon);
	}
	
	public void utilizarVitamina(Algomon algomon) {
		this.vitamina.aplicarEfecto(algomon);
	}
	
	public void utilizarRestaurador(Algomon algomon) {
		this.restaurador.aplicarEfecto(algomon);
	}
	
	public int getCantidadRestantePocion(){
		return this.pocion.usosRestantes();
	}
	
	public int getCantidadRestanteSuperpocion(){
		return this.superPocion.usosRestantes();
	}
	
	public int getCantidadRestanteVitamina(){
		return this.vitamina.usosRestantes();
	}
	
	public int getCantidadRestanteRestaurador(){
		return this.restaurador.usosRestantes();
	}

}
