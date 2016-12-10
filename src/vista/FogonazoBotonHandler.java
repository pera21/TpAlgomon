package vista;

import controlador.ControladorJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import modelo.algomon.Algomon;

public class FogonazoBotonHandler implements EventHandler<ActionEvent>{
	
	public ControladorJuego controlador;
	public PeleaAlgomonesScene escena;
	public TextArea consola;
	public Algomon algomonActivo, algomonInactivo;
	
	public FogonazoBotonHandler(PeleaAlgomonesScene escena, ControladorJuego controlador, TextArea consola, Algomon activo, Algomon inactivo){
		this.controlador = controlador;
		this.escena = escena;
		this.consola = consola;
		this.algomonActivo = activo;
		this.algomonInactivo = inactivo;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.controlador.atacarConFogonazo();
		this.consola.appendText("-> " + this.algomonActivo.getNombreAlgomon() + " ataco a " + this.algomonInactivo.getNombreAlgomon() + " con fogonazo y lo deja quemado!.\n");
		this.escena.resetearPaneles();
		this.escena.establecerAlgomonesPelea();
		this.escena.asignarAtaquesAlgomonActivo();
		// preguntar al jugador inactivo si el algomon esta vivo porque atacar termina el turno
	}

}