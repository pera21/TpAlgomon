package vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class MenuPrincipalScene extends Scene{
	
	public GridPane menuInicial;
	public Button botonJugar, botonCreditos, botonSalir;

	public MenuPrincipalScene(GridPane menu) {
		super(menu, 800, 600);
		this.menuInicial = menu;
		this.crearMenuInicial();
		this.crearBotonesMenuInicial();
		this.agregarBotonesAMenuInicial();
	}
	
	public void crearMenuInicial(){
		this.menuInicial.setId("fondo_menus");
		this.menuInicial.setHgap(10);
		this.menuInicial.setVgap(50);
		this.menuInicial.setPadding(new Insets(0, 100, 0, 100));
		this.menuInicial.setAlignment(Pos.CENTER);
	}
	
	public void crearBotonesMenuInicial(){
		this.botonJugar = new Button("Jugar");
		this.botonCreditos = new Button("Créditos");
		this.botonSalir = new Button("Salir");
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
