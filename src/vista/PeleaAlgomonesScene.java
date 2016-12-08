package vista;

import controlador.ControladorJuego;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import modelo.Jugador;

public class PeleaAlgomonesScene extends Scene{
	
	public Stage stage;
	public BorderPane escenario;
	public ControladorJuego controlador;
	public Jugador[] jugadores;
	public VBox menuJugador; // Columna derecha
	public VBox algomonAtacante; //Columna izquierda
	public StackPane algomonOponente; // centro
	public GridPane algomones;

	public PeleaAlgomonesScene(Stage stage, ControladorJuego controlador, BorderPane escena) {
		super(escena, 1920, 1080);
		this.stage = stage;
		this.escenario = escena;
		this.escenario.setId("fondo_batalla");
		this.controlador = controlador;
		this.jugadores = this.controlador.getJugadores();
		this.crearEscenario();
	}
	
	public void crearEscenario(){
		this.algomones = new GridPane();
		this.escenario.setCenter(this.algomones);
		this.algomones.setId("fondo_batalla");
		this.algomones.setAlignment(Pos.CENTER);
		this.algomones.setHgap(50);
		this.algomones.setVgap(50);
		Label imgAlgomonAtacante = new Label("Charmander");
		imgAlgomonAtacante.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAlgomon = new ImageView(new Image("file:src/vista/images/Pokemons/charmander_b.gif"));
		imgAlgomonAtacante.setGraphic(imgAlgomon);
		imgAlgomonAtacante.setGraphicTextGap(50);
		imgAlgomonAtacante.setContentDisplay(ContentDisplay.BOTTOM);
		Label imgAlgomonOponente = new Label("Charmander");
		imgAlgomonAtacante.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAlgomon2 = new ImageView(new Image("file:src/vista/images/Pokemons/charmander.gif"));
		imgAlgomonOponente.setGraphic(imgAlgomon2);
		imgAlgomonOponente.setGraphicTextGap(50);
		imgAlgomonOponente.setContentDisplay(ContentDisplay.BOTTOM);
		this.algomones.add(imgAlgomonAtacante, 1, 4);
		this.algomones.add(imgAlgomonOponente, 10, 0);
		
	}

}
