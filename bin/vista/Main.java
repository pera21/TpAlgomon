package vista;

import controlador.ControladorJuego;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	public ControladorJuego controladorJuego;
	public MenuPrincipalScene menuPrincipal;
	public NombreJugadoresScene menuNombreJugadores;
	public CreditosScene creditos;
	public SeleccionarAlgomonScene algomones;
	
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Algomón");
		this.creditos = new CreditosScene(new VBox());
		this.controladorJuego = new ControladorJuego();
		//this.algomones = new SeleccionarAlgomonScene(new BorderPane(), this.controladorJuego);
		this.menuNombreJugadores = new NombreJugadoresScene(stage, this.controladorJuego, new GridPane());
		this.menuPrincipal = new MenuPrincipalScene(stage, new GridPane(), this.menuNombreJugadores,this.creditos);
		

		//Estilo de las escenas
		stage.getStyle().getClass().getResource("style.css");
		this.menuPrincipal.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		this.creditos.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		this.menuNombreJugadores.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		//this.algomones.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		
		//Cambio de Escenas
		this.menuNombreJugadores.getBotonAtras().setOnAction(e-> stage.setScene(this.menuPrincipal));
		//this.menuNombreJugadores.getBotonContinuar().setOnAction(e-> stage.setScene(algomones));
		this.creditos.getBotonAtras().setOnAction(e-> stage.setScene(this.menuPrincipal));
		//this.menuPrincipal.getBotonJugar().setOnAction(e-> stage.setScene(this.menuNombreJugadores));
		//this.menuPrincipal.getBotonCreditos().setOnAction(e->stage.setScene(this.creditos));
		//this.menuPrincipal.getBotonSalir().setOnAction(e-> stage.close());
		
		//Inicializacion Stage
		stage.minWidthProperty().bind(this.menuPrincipal.widthProperty());
		stage.minHeightProperty().bind(this.menuPrincipal.heightProperty());
		stage.setScene(this.menuPrincipal);
		stage.show();
		
	}

}
