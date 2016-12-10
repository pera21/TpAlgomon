package vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComoJugarScene extends Scene{
	
	public Stage stage;
	public MenuPrincipalScene escenaAnterior;
	public HBox bloqueComoJugar;
	public Button botonAtras, botonContinuar;
	
	public ComoJugarScene(Stage stage, MenuPrincipalScene escena, HBox bloque){
		super(bloque, 1920, 1080);
		this.stage = stage;
		this.escenaAnterior = escena;
		this.bloqueComoJugar = bloque;
		this.crearCreditos();
		this.crearBotones();
		this.agregarBotonABloque();
	}
	
	public void crearCreditos(){
		this.bloqueComoJugar.setId("comoJugar");
		this.bloqueComoJugar.setAlignment(Pos.BOTTOM_CENTER);
	}
	
	public void crearBotones(){
		this.botonAtras = new Button("Atras");
		AtrasBotonHandler atrasHandler = new AtrasBotonHandler(this.stage, this.escenaAnterior);
		this.botonAtras.setOnAction(atrasHandler);
		this.botonContinuar = new Button("Siguiente");
		ContinuarComoJugarHandler continuarHandler = new ContinuarComoJugarHandler(this.stage, this);
		this.botonContinuar.setOnAction(continuarHandler);
	}
	
	public void agregarBotonABloque(){
		this.bloqueComoJugar.getChildren().add(this.botonAtras);
		this.bloqueComoJugar.getChildren().add(this.botonContinuar);
	}

}
