package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Juego {
	
	private Jugador [] jugadores;
	private Jugador ganador;
	private int jugadorActivo;
	
	public Juego(){
		this.ganador = null;
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
		jugador.elegirAlgomonActivo(algomones.get(0));
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
	
	public Jugador getJugadorActivo(){
		return this.jugadores[this.jugadorActivo];
	}
	
	public Jugador getJugadorInactivo(){
		return this.jugadores[siguienteJugador()];
	}
	
	public void atacar(FabricaAtaque ataque){
		this.getJugadorActivo().atacar(this.getJugadorInactivo().getAlgomonActivo(), ataque);
		terminarTurno();
	}
	
	public void utilizarPocion(Algomon algomon){
		this.getJugadorActivo().utilizarPocion(algomon);
		terminarTurno();
	}
	
	public void utilizarSuperPocion(Algomon algomon){
		this.getJugadorActivo().utilizarSuperPocion(algomon);
		terminarTurno();
	}
	
	public void utilizarVitamina(Algomon algomon){
		this.getJugadorActivo().utilizarVitamina(algomon);
		terminarTurno();
	}
	
	public void utilizarRestaurador(Algomon algomon){
		this.getJugadorActivo().utilizarRestaurador(algomon);
		terminarTurno();
	}
	
	public void cambiarAlgomonActivo(Algomon algomon){
		this.getJugadorActivo().cambiarAlgomonActivo(algomon);
		terminarTurno();
	}
	
	public void cambiarAlgomonMuerto(Algomon algomon){
		this.getJugadorInactivo().cambiarAlgomonMuerto(algomon);
	}
	
	public void terminarTurno(){
		verificarVidaAlgomonesPeleando();
		this.getJugadorActivo().setEstado(new EstadoInactivo());
		this.jugadorActivo = siguienteJugador();
		this.jugadores[this.jugadorActivo].setEstado(new EstadoActivo());
	}

	private void verificarVidaAlgomonesPeleando() {
		for(Jugador jugador : this.jugadores){
			if(jugador.getAlgomonActivo().estaMuerto()){
				jugador.agregarAlgomonMuerto(jugador.getAlgomonActivo());
			}
		}
	}
	
	public boolean hayGanador(){
		return ganador != null;
	}
	
	public Jugador getJugadorGanador(){
		return ganador;
	}
	
	public void chequearGanador(){
		for(int i = 0; i<2 ;i++){
			if (jugadores[i].getListaAlgomonesMuertos().size() == 3){
				this.ganador = jugadores[(i+1)% jugadores.length];
			}
		}
	}
	
	
	

}
