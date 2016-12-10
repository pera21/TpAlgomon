package controlador;

import java.util.ArrayList;
import java.util.Random;

import modelo.algomon.Algomon;
import modelo.estados.EstadoActivo;
import modelo.estados.EstadoInactivo;
import modelo.fabricas.FabricaAtaque;
import modelo.fabricas.FabricaEspecie;
import modelo.Juego;
import modelo.Jugador;

public class ControladorJuego {
	
	public Juego juego;
	
	public ControladorJuego(){
		this.juego = new Juego();
	}

	// CREACION DE ALGOMONES
	
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
	
	public void inicializarJugadores(){
		this.juego.inicializarJugadores();
	}
	
	// ATAQUES ALGOMONES
	
	public void atacarConAtaqueRapido(){
		this.juego.atacarConAtaqueRapido();
	}
	
	public void atacarConCanto(){
		this.juego.atacarConCanto();
	}
	
	public void atacarConBurbuja(){
		this.juego.atacarConBurbuja();
	}
	
	public void atacarConCanionAgua(){
		this.juego.atacarConCanionAgua();
	}
	
	public void atacarConChupavidas(){
		this.juego.atacarConChupavidas();
	}
	
	public void atacarConLatigoCepa(){
		this.juego.atacarConLatigoCepa();
	}
	
	public void atacarConBrasas(){
		this.juego.atacarConBrasas();
	}
	
	public void atacarConFogonazo(){
		this.juego.atacarConFogonazo();
	}
	
	// POCIONES Y RESTAURADORES
	
	public void utilizarPocion(Algomon algomon){
		this.juego.utilizarPocion(algomon);
	}
	
	public void utilizarSuperPocion(Algomon algomon){
		this.juego.utilizarSuperPocion(algomon);
	}
	
	public void utilizarVitamina(Algomon algomon){
		this.juego.utilizarVitamina(algomon);
	}
	
	public void utilizarRestaurador(Algomon algomon){
		this.juego.utilizarRestaurador(algomon);
	}
	
	// ESTADOS ALGOMON
	
	public void cambiarAlgomonActivo(Algomon algomon){
		this.juego.cambiarAlgomonActivo(algomon);
	}
	
	public void cambiarAlgomonMuerto(Algomon algomon){
		this.juego.cambiarAlgomonMuerto(algomon);
	}
	
	// PARTIDA
	
	public void terminarTurno(){
		this.juego.terminarTurno();
	}
	
	// JUGADORES
	
	public Jugador getJugadorActivo(){
		return this.juego.getJugadorActivo();
	}
	
	public Jugador getJugadorInactivo(){
		return this.juego.getJugadorInactivo();
	}
	
	// CHEQUEO Y REVISION DE GANADOR
	
	public boolean hayGanador(){
		return this.juego.hayGanador();
	}
	
	public Jugador getJugadorGanador(){
		return this.juego.getJugadorGanador();
	}
	
	public void chequearGanador(){
		this.juego.chequearGanador();
	}
	
	public Jugador[] getJugadores(){
		return this.juego.getJugadores();
	}
	
	public void crearJugador(String nombreJugador, ArrayList<Algomon> algomones){
		this.juego.crearJugador(nombreJugador, algomones);
	}
}
