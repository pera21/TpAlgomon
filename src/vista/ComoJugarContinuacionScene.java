package vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComoJugarContinuacionScene extends Scene{
	
	public Stage stage;
	public ComoJugarScene escenaAnterior;
	public HBox bloqueComoJugar;
	public Button botonAtras;
	
	public ComoJugarContinuacionScene(Stage stage, ComoJugarScene escena, HBox bloque){
		super(bloque, 1920, 1080);
		this.stage = stage;
		this.escenaAnterior = escena;
		this.bloqueComoJugar = bloque;
		this.crearCreditos();
		this.crearBotones();
		this.agregarBotonABloque();
	}
	
	public void crearCreditos(){
		this.bloqueComoJugar.setId("comoJugarContinuacion");
		this.bloqueComoJugar.setAlignment(Pos.BOTTOM_CENTER);
	}
	
	public void crearBotones(){
		this.botonAtras = new Button("Atras");
		AtrasBotonHandler atrasHandler = new AtrasBotonHandler(this.stage, this.escenaAnterior);
		this.botonAtras.setOnAction(atrasHandler);
	}
	
	public void agregarBotonABloque(){
		this.bloqueComoJugar.getChildren().add(this.botonAtras);
	}

}
