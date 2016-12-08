package vista;

import controlador.ControladorJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FogonazoBotonHandler implements EventHandler<ActionEvent>{
	
	public ControladorJuego controlador;
	
	public FogonazoBotonHandler(ControladorJuego controlador){
		this.controlador = controlador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.controlador.atacarConFogonazo();
		// preguntar al jugador inactivo si el algomon esta vivo porque atacar termina el turno
	}

}