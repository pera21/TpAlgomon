package vista;

import controlador.ControladorJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import modelo.algomon.Algomon;

public class CambiarAlgomonActivoHandler implements EventHandler<ActionEvent>{
	
	public ControladorJuego controlador;
	public PeleaAlgomonesScene escena;
	public TextArea consola;
	public Algomon algomonACambiar;
	
	public CambiarAlgomonActivoHandler(PeleaAlgomonesScene escena, ControladorJuego controlador, TextArea consola, Algomon algomon){
		this.controlador = controlador;
		this.escena = escena;
		this.consola = consola;
		this.algomonACambiar = algomon;
	}

	@Override
	public void handle(ActionEvent event) {
		this.controlador.cambiarAlgomonActivo(this.algomonACambiar);
		this.consola.appendText("-> Cambio su algomon en el campo por " + this.algomonACambiar.getNombreAlgomon() + ".\n");
		this.escena.resetearPaneles();
		this.escena.cambiarEscenarioPorJugador();
	}

}
