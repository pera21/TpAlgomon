package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Juego {
	
	private Jugador [] jugadores;
	private Jugador ganador;
	private int jugadorActivo;
	
	public Juego(){
		
	}
	
	public Algomon crearCharmander(){
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		return charmander;
	}
	
	public Algomon crearSquirtle(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		return squirtle;
	}
	
	public Algomon crearBulbasaur(){
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		return bulbasaur;
	}
	
	public Algomon crearRattata(){
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		return rattata;
	}
	
	public Algomon crearChansey(){
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		return chansey;
	}
	
	public Algomon crearJigglypuff(){
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		return jigglypuff;
	}
	
	public void crearJugador(String nombreJugador, ArrayList<Algomon> algomones){
		Jugador jugador = new Jugador(algomones, nombreJugador);
		this.jugadores[this.jugadores.length] = jugador;
	}
	
	public void inicializarJugadores(){
		this.jugadorActivo = new Random().nextInt(2);
		this.jugadores[this.jugadorActivo].setEstado(new EstadoActivo());
		this.jugadores[siguienteJugador()].setEstado(new EstadoInactivo());
	}

	private int siguienteJugador(){
		return (this.jugadorActivo + 1) % this.jugadores.length;
	}
	
	
	
	

}
