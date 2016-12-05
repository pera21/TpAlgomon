package vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class NombreJugadoresScene extends Scene {
	
	public GridPane menuJugadores;
	public Button botonAtras, botonContinuar;
	
	public NombreJugadoresScene(GridPane menu) {
		super(menu, 800, 600);
		this.menuJugadores = menu;
		this.crearMenuNombreJugadores();;
		this.crearCamposNombres();
		this.crearBotones();
		this.agregarBotonesAMenu();
	}
	
	public void crearMenuNombreJugadores(){
		this.menuJugadores.setId("fondo_menus");
		this.menuJugadores.setAlignment(Pos.CENTER);
		this.menuJugadores.setHgap(10);
		this.menuJugadores.setVgap(10);
		this.menuJugadores.setPadding(new Insets(25, 25, 25, 25));
	}
	
	public void crearCamposNombres(){
		Label nombreJugador = new Label("Nombre Jugador 1:");
		nombreJugador.setId("nombreJugador");
		this.menuJugadores.add(nombreJugador, 0, 1);
		
		TextField campoNombreJugador = new TextField();
		this.menuJugadores.add(campoNombreJugador, 1, 1);
		
		Label otroNombreJugador = new Label("Nombre Jugador 2:");
		otroNombreJugador.setId("nombreJugador");
		this.menuJugadores.add(otroNombreJugador, 0, 2);
		
		TextField campoOtroNombreJugador = new TextField();
		this.menuJugadores.add(campoOtroNombreJugador, 1, 2);
	}
	
	public void crearBotones(){
		this.botonAtras = new Button("Atras");
		this.botonContinuar = new Button("Continuar");
	}
	
	public void agregarBotonesAMenu(){
		this.menuJugadores.add(botonAtras, 0, 3);
		this.menuJugadores.add(botonContinuar, 1, 3);
	}
	
	public Button getBotonAtras(){
		return this.botonAtras;
	}
	
	public Button getBotonContinuar(){
		return this.botonContinuar;
	}

}
