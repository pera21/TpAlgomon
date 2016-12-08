package vista;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import modelo.Algomon;
import controlador.ControladorJuego;

public class SquirtleBotonHandler implements EventHandler<ActionEvent>{

	public ArrayList<Algomon> lista;
	public ControladorJuego controlador;
	public SeleccionarAlgomonScene escena;
	public Button algomon;
	public TextArea consola;
	
	public SquirtleBotonHandler(SeleccionarAlgomonScene escena, Button squirtle, ArrayList<Algomon> listaAlgomones, ControladorJuego controlador, TextArea consola){
		this.lista = listaAlgomones;
		this.escena = escena;
		this.controlador = controlador;
		this.algomon = squirtle;
		this.consola = consola;
	}
	
	@Override
	public void handle(ActionEvent event){
		if(this.escena.getCantidadAlgomonesElegidos() < 6){
			this.lista.add(this.controlador.crearSquirtle());
			this.escena.aumentarCantidadAlgomonesElegidos();
			this.consola.appendText("-> Squirtle añadido a tu mochila!\n");
			this.algomon.setDisable(true);
			if(this.escena.getCantidadAlgomonesElegidos() == 3){
				this.escena.resetearBotonesAlgomones();
				this.escena.crearJugador();
			}else if(this.escena.getCantidadAlgomonesElegidos() == 6){
				this.escena.crearJugador();
				this.escena.cambiarAEscenaPelea();
			}
		}
	}
	
}
