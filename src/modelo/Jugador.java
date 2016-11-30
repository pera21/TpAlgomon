package modelo;

import java.util.ArrayList;

public class Jugador {
	
	private ArrayList<Algomon> algomones;
	private String nombreJugador;
	private Mochila mochila;
	private Estado estado;
	private Algomon algomonActivo;
	
	public Jugador(ArrayList<Algomon> algomones, String nombre){
		this.algomones = algomones;
		this.nombreJugador = nombre;
		this.mochila = new Mochila();
		this.estado = new EstadoActivo();
	}
	
	public String mostrarNombreJugador(){
		return this.nombreJugador;
	}
	
	public void utilizarPocion(Algomon algomon){
		this.mochila.utilizarPocion(algomon);
	}
	
	public void utilizarSuperPocion(Algomon algomon){
		this.mochila.utilizarSuperPocion(algomon);
	}
	
	public void utilizarVitamina(Algomon algomon){
		this.mochila.utilizarVitamina(algomon);
	}
	
	public void utilizarRestaurador(Algomon algomon){
		this.mochila.utilizarRestaurador(algomon);
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void atacar(Algomon oponente, FabricaAtaque ataque){
		this.estado.atacar(this.algomonActivo, oponente, ataque);
	}
	
	public void elegirAlgomonActivo(Algomon elegido){
		elegido.cambiarAEstadoActivo();
		this.algomonActivo = elegido;
	}
	
	public void cambiarAlgomonActivo(Algomon elegido){
		this.algomonActivo.cambiarAEstadoInactivo();
		elegido.cambiarAEstadoActivo();
		this.algomonActivo = elegido;
	}
	
}
