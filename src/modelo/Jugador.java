package modelo;

import java.util.ArrayList;

public class Jugador {
	
	private ArrayList<Algomon> algomones;
	private String nombreJugador;
	
	public Jugador(ArrayList<Algomon> algomones, String nombre){
		this.algomones = new ArrayList<Algomon>();
		this.nombreJugador = nombre;
	}
	
	public void agregarAlgomon(Algomon algomon){
		algomones.add(algomon);
	}
	
	public String mostrarNombreJugador(){
		return this.nombreJugador;
	}
}
