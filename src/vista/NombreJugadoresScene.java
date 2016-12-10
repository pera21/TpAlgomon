package vista;

import controlador.ControladorJuego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class NombreJugadoresScene extends Scene {
	
	public GridPane menuJugadores;
	public SeleccionarAlgomonScene siguienteEscena;
	public Button botonAtras, botonContinuar;
	public TextField campoNombreJugador1, campoNombreJugador2;
	public ControladorJuego controlador;

	
	public NombreJugadoresScene(Stage stage, ControladorJuego controlador, GridPane menu) {
		super(menu, 1024, 768);
		this.menuJugadores = menu;
		this.controlador = controlador;
		this.crearMenuNombreJugadores();;
		this.crearCamposNombres();
		this.crearBotones(stage);
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
		
		this.campoNombreJugador1 = new TextField();
		this.menuJugadores.add(this.campoNombreJugador1, 1, 1);
		
		Label otroNombreJugador = new Label("Nombre Jugador 2:");
		otroNombreJugador.setId("nombreJugador");
		this.menuJugadores.add(otroNombreJugador, 0, 2);
		
		this.campoNombreJugador2 = new TextField();
		this.menuJugadores.add(this.campoNombreJugador2, 1, 2);
	}
	
	public void crearBotones(Stage stage){
		this.botonAtras = new Button("Atras");
		this.botonContinuar = new Button("Continuar");
		
		ContinuarBotonHandler continuarHandler = new ContinuarBotonHandler(stage, this.controlador, this.campoNombreJugador1, this.campoNombreJugador2);
		this.botonContinuar.setOnAction(continuarHandler);
	}
	
	public void agregarBotonesAMenu(){
		this.menuJugadores.add(botonAtras, 0, 3);
		this.menuJugadores.add(botonContinuar, 1, 3);
	}
	
	public Button getBotonAtras(){
		return this.botonAtras;
	}

}
