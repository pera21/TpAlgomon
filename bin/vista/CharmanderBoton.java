package vista;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import modelo.Algomon;
import controlador.ControladorJuego;

public class CharmanderBoton implements EventHandler<ActionEvent>{
	
	public Button charmander;
	public ArrayList<Algomon> lista;
	
	public CharmanderBoton(ArrayList<Algomon> listaAlgomones){
		this.charmander = new Button();
		this.lista = listaAlgomones;
	}
	
	@Override
	public void handle(ActionEvent event){
		this.lista.add(ControladorJuego.crearCharmander());
	}
}
