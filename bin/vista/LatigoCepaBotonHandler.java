package vista;

import controlador.ControladorJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class LatigoCepaBotonHandler implements EventHandler<ActionEvent>{
	
	public ControladorJuego controlador;
	
	public LatigoCepaBotonHandler(ControladorJuego controlador){
		this.controlador = controlador;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.controlador.atacarConLatigoCepa();
	}

}