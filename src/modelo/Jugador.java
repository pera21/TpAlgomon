package modelo;

import java.util.ArrayList;

import modelo.algomon.Algomon;
import modelo.elementos.Mochila;
import modelo.estados.Estado;
import modelo.estados.EstadoActivo;
import modelo.fabricas.FabricaAtaque;

public class Jugador {
	
	private ArrayList<Algomon> algomones;
	private ArrayList<Algomon> algomonesMuertos;
	private String nombreJugador;
	private Mochila mochila;
	private Estado estado;
	private Algomon algomonActivo;
	
	public Jugador(ArrayList<Algomon> algomones, String nombre){
		this.algomones = algomones;
		this.algomonesMuertos = new ArrayList<Algomon>();
		this.nombreJugador = nombre;
		this.mochila = new Mochila();
		this.estado = new EstadoActivo();
	}
	
	public String getNombreJugador(){
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
	
	public Algomon getAlgomonActivo(){
		return this.algomonActivo;
	}
	
	public void agregarAlgomonMuerto(Algomon algomon){
		this.algomonesMuertos.add(algomon);
	}
	
	public ArrayList<Algomon> getListaAlgomones(){
		return this.algomones;
	}
	
	public ArrayList<Algomon> getListaAlgomonesMuertos(){
		return this.algomonesMuertos;
	}
	
	public Mochila getMochila(){
		return this.mochila;
	}

	public void cambiarAlgomonMuerto(Algomon algomon) {
		this.elegirAlgomonActivo(algomon);
	}
}
