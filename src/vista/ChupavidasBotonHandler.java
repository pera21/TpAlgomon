package vista;

import controlador.ControladorJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import modelo.algomon.Algomon;

public class ChupavidasBotonHandler implements EventHandler<ActionEvent>{
	
	public ControladorJuego controlador;
	public PeleaAlgomonesScene escena;
	public TextArea consola;
	public Algomon algomonActivo, algomonInactivo;
	
	public ChupavidasBotonHandler(PeleaAlgomonesScene escena, ControladorJuego controlador, TextArea consola, Algomon activo, Algomon inactivo){
		this.controlador = controlador;
		this.escena = escena;
		this.consola = consola;
		this.algomonActivo = activo;
		this.algomonInactivo = inactivo;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.controlador.atacarConChupavidas();
		this.consola.appendText("-> " + this.algomonActivo.getNombreAlgomon() + " ataco a " + this.algomonInactivo.getNombreAlgomon() + " con chupavidas y se cura a si mismo!.\n");
		if(this.controlador.getJugadorInactivo().getAlgomonActivo().estaMuerto()){
			if(this.controlador.getJugadorInactivo().getListaAlgomonesMuertos().size() == 3){
				this.escena.cambiarAEscenaGanador(this.controlador.getJugadorActivo().getNombreJugador());
				return;
			}else{
				this.controlador.terminarTurno();
				this.consola.appendText("-> El algomon " + this.algomonActivo.getNombreAlgomon() + " ha muerto.\n");
				this.escena.resetearPaneles();
				this.escena.cambiarEscenarioPorJugador();
				this.escena.desactivarOpcionesMenu();
			}
		}else if(this.controlador.getJugadorActivo().getAlgomonActivo().estaMuerto()){
			if(this.controlador.getJugadorActivo().getListaAlgomonesMuertos().size() == 3){
				this.escena.cambiarAEscenaGanador(this.controlador.getJugadorInactivo().getNombreJugador());
			}else{
				this.escena.resetearPaneles();
				this.consola.appendText("-> El algomon " + this.algomonInactivo.getNombreAlgomon() + " ha muerto.\n");
				this.escena.cambiarEscenarioPorJugador();
				this.escena.desactivarOpcionesMenu();
			}
		}else{
			this.escena.resetearPaneles();
			this.escena.cambiarEscenarioPorJugador();
		}
	}

}