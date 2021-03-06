package vista;

import controlador.ControladorJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import modelo.Jugador;
import modelo.algomon.Algomon;

public class RestauradorBotonHandler implements EventHandler<ActionEvent>{
	
	public ControladorJuego controlador;
	public PeleaAlgomonesScene escena;
	public TextArea consola;
	public Jugador jugadorActivo;
	public Algomon algomonActivo;
	
	public RestauradorBotonHandler(PeleaAlgomonesScene escena, ControladorJuego controlador, TextArea consola, Jugador jugadorActivo, Algomon algomonActivo){
		this.controlador = controlador;
		this.escena = escena;
		this.consola = consola;
		this.jugadorActivo = jugadorActivo;
		this.algomonActivo = algomonActivo;
	}

	@Override
	public void handle(ActionEvent event) {
		this.controlador.utilizarRestaurador(this.algomonActivo);
		this.consola.appendText("-> " + this.jugadorActivo.getNombreJugador() + " utilizó un restaurador en " + this.algomonActivo.getNombreAlgomon() + "!.\n");
		this.escena.resetearPaneles();
		this.escena.cambiarEscenarioPorJugador();
	}

}
