package vista;

import controlador.ControladorJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BurbujaBotonHandler implements EventHandler<ActionEvent>{
	
	public ControladorJuego controlador;
	
	public BurbujaBotonHandler(ControladorJuego controlador){
		this.controlador = controlador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.controlador.atacarConBurbuja();
	}

}