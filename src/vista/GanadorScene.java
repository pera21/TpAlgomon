package vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class GanadorScene extends Scene{
	
	public Button botonSalir;
	public BorderPane escenario;
	public String ganador;
	
	public GanadorScene(BorderPane escenario, String nombreGanador){
		super(escenario, 1920, 1080);
		this.escenario = escenario;
		this.ganador = nombreGanador;
		this.crearGanador();
		this.crearBotonesGanadores();
		this.agregarBotonesAGanadores();
	}
	
	public void crearGanador(){
		Label nombreGanador = new Label(this.ganador);
		nombreGanador.setId("nombreGanador");
		this.escenario.setCenter(nombreGanador);
		this.escenario.setId("ganador");
	}
	
	public void crearBotonesGanadores(){
		this.botonSalir = new Button("Salir");
	    SalirBotonHandler botonSalirHandler = new SalirBotonHandler();
	    this.botonSalir.setOnAction(botonSalirHandler);    
	}
	
	public void agregarBotonesAGanadores(){
		this.escenario.setBottom(this.botonSalir);
	}

}
