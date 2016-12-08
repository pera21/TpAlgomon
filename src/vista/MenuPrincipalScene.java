package vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MenuPrincipalScene extends Scene{
	
	public GridPane menuInicial;
	public Button botonJugar, botonCreditos, botonSalir;
	private Stage stage;

	public MenuPrincipalScene(Stage stage,GridPane menu, NombreJugadoresScene menuNombreJugadores, CreditosScene creditosScene) {
		super(menu, 1920, 1080);
		this.stage = stage;
		this.menuInicial = menu;
		this.crearMenuInicial();
		this.crearBotonesMenuInicial(menuNombreJugadores,creditosScene);
		this.agregarBotonesAMenuInicial();
		
	}
	
	public void crearMenuInicial(){
		this.menuInicial.setId("fondo_menus");
		this.menuInicial.setHgap(10);
		this.menuInicial.setVgap(50);
		this.menuInicial.setPadding(new Insets(0, 100, 0, 100));
		this.menuInicial.setAlignment(Pos.CENTER);
	}
	
	public void crearBotonesMenuInicial(NombreJugadoresScene menuNombreJugadores, CreditosScene creditosScene){
		this.botonJugar = new Button("Jugar");
		this.botonCreditos = new Button("Creditos");
		this.botonSalir = new Button("Salir");
		BotonJugarEventHandler botonJugarHandler = new BotonJugarEventHandler(stage, menuNombreJugadores);
	    this.botonJugar.setOnAction(botonJugarHandler);
	    BotonSalirEventHandler botonSalirHandler = new BotonSalirEventHandler();
	    this.botonSalir.setOnAction(botonSalirHandler);    
	    BotonCreditosEventHandler botonCreditosHandler = new BotonCreditosEventHandler(stage,creditosScene);
	    this.botonCreditos.setOnAction(botonCreditosHandler);
	}
	
	public void agregarBotonesAMenuInicial(){
		this.menuInicial.add(botonJugar, 0, 0);
		this.menuInicial.add(botonCreditos, 0, 1);
		this.menuInicial.add(botonSalir, 0, 2);
	}
	
	public Button getBotonJugar(){
		return this.botonJugar;
	}
	
	public Button getBotonSalir(){
		return this.botonSalir;
	}
	
	public Button getBotonCreditos(){
		return this.botonCreditos;
	}

}
