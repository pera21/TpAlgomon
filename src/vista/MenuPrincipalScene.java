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
	public Button botonJugar, botonComoJugar, botonCreditos, botonSalir;
	private Stage stage;

	public MenuPrincipalScene(Stage stage,GridPane menu, NombreJugadoresScene menuNombreJugadores, CreditosScene creditosScene) {
		super(menu, 1024, 768);
		this.stage = stage;
		this.menuInicial = menu;
		this.crearMenuInicial();
		this.crearBotonesMenuInicial(menuNombreJugadores, creditosScene);
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
		this.botonComoJugar = new Button("Como Jugar");
		this.botonCreditos = new Button("Creditos");
		this.botonSalir = new Button("Salir");
		JugarBotonHandler botonJugarHandler = new JugarBotonHandler(this.stage, menuNombreJugadores);
	    this.botonJugar.setOnAction(botonJugarHandler);
	    ComoJugarBotonHandler botonComoJugarHandler = new ComoJugarBotonHandler(this.stage, this);
	    this.botonComoJugar.setOnAction(botonComoJugarHandler);
	    CreditosBotonHandler botonCreditosHandler = new CreditosBotonHandler(this.stage,creditosScene);
	    this.botonCreditos.setOnAction(botonCreditosHandler);
	    SalirBotonHandler botonSalirHandler = new SalirBotonHandler();
	    this.botonSalir.setOnAction(botonSalirHandler);    
	    
	}
	
	public void agregarBotonesAMenuInicial(){
		this.menuInicial.add(this.botonJugar, 0, 0);
		this.menuInicial.add(this.botonComoJugar, 0, 1);
		this.menuInicial.add(this.botonCreditos, 0, 2);
		this.menuInicial.add(this.botonSalir, 0, 3);
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
