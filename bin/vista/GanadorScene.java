package vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class GanadorScene extends Scene{
	
	public Button botonSalir;
	public GridPane escenario;
	public String ganador;
	
	public GanadorScene(GridPane escenario, String nombreGanador){
		super(escenario, 1920, 1080);
		this.escenario = escenario;
		this.ganador = nombreGanador;
		this.crearGanador();
		this.crearBotonesGanadores();
	}
	
	public void crearGanador(){
		this.escenario.setId("ganadores");
		this.escenario.setAlignment(Pos.BOTTOM_CENTER);
		Label nombreGanador = new Label(this.ganador);
		this.escenario.add(nombreGanador, 0, 1);
	}
	
	public void crearBotonesGanadores(){
		this.botonSalir = new Button("Salir");
	    BotonSalirEventHandler botonSalirHandler = new BotonSalirEventHandler();
	    this.botonSalir.setOnAction(botonSalirHandler);    
	}
	
	public void agregarBotonesAGanadores(){
		this.escenario.add(botonSalir, 0, 2);
	}

}
