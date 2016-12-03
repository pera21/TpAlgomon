package controlador;

import modelo.Algomon;
import modelo.FabricaEspecie;
import modelo.Juego;
import modelo.Jugador;

public class ControladorJuego {
	
	public Juego juego;
	
	public ControladorJuego(){
		this.juego = new Juego();
	}

	public static Algomon crearCharmander(){
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
	
	public Jugador[] getJugadores(){
		return this.juego.getJugadores();
	}
	
}
