package vista;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import modelo.Algomon;
import controlador.ControladorJuego;

public class IniciarJuegoBoton implements EventHandler<ActionEvent>{
	
	public Button juego;
	public ControladorJuego controlador;
	
	public IniciarJuegoBoton(ControladorJuego controladorJuego){
		this.controlador = controladorJuego;
	}

	@Override
	public void handle(ActionEvent event) {
		this.controlador.getJugadores();
	}
	

}
