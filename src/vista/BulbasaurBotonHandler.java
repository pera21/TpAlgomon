package vista;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import modelo.Algomon;
import controlador.ControladorJuego;

public class BulbasaurBotonHandler implements EventHandler<ActionEvent>{

	public ArrayList<Algomon> lista;
	public ControladorJuego controlador;
	public SeleccionarAlgomonScene escena;
	public Button algomon;
	public TextArea consola;
	
	public BulbasaurBotonHandler(SeleccionarAlgomonScene escena, Button bulbasaur, ArrayList<Algomon> listaAlgomones, ControladorJuego controlador, TextArea consola){
		this.lista = listaAlgomones;
		this.escena = escena;
		this.controlador = controlador;
		this.algomon = bulbasaur;
		this.consola = consola;
	}
	
	@Override
	public void handle(ActionEvent event){
		if(this.escena.getCantidadAlgomonesElegidos() < 3){
			this.lista.add(this.controlador.crearBulbasaur());
			this.escena.aumentarCantidadAlgomonesElegidos();
			this.consola.appendText("-> Bulbasaur añadido a tu mochila!\n");
			this.algomon.setDisable(true);
		}else if(this.escena.getCantidadAlgomonesElegidos() >= 3 && this.escena.getCantidadAlgomonesElegidos() < 6){
			this.escena.resetearBotonesAlgomones();
		}else{
			//Siguiente escena (la de batalla)
		}
	}
	
}