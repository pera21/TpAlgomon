package vista;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class CreditosScene extends Scene{
	
	public VBox bloqueCreditos;
	public Button botonAtras;
	
	public CreditosScene(VBox bloque){
		super(bloque, 1920, 1080);
		this.bloqueCreditos = bloque;
		this.crearCreditos();
		this.crearBoton();
		this.agregarBotonABloque();
	}
	
	public void crearCreditos(){
		this.bloqueCreditos.setId("creditos");
		this.bloqueCreditos.setAlignment(Pos.BOTTOM_CENTER);
	}
	
	public void crearBoton(){
		this.botonAtras = new Button("Atras");
	}
	
	public void agregarBotonABloque(){
		this.bloqueCreditos.getChildren().add(botonAtras);
	}
	
	public Button getBotonAtras(){
		return this.botonAtras;
	}

}
