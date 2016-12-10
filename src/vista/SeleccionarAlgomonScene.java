package vista;

import java.util.ArrayList;

import controlador.ControladorJuego;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import modelo.fabricas.FabricaEspecie;
import modelo.Jugador;
import modelo.algomon.Algomon;

public class SeleccionarAlgomonScene extends Scene{
	
	public Stage stage;
	public String nombreJugador1, nombreJugador2;
	public BorderPane escena;
	public GridPane algomones;
	public HBox bottom;
	public Button charmander, squirtle, bulbasaur, jigglypuff, chansey, rattata;
	public ArrayList<Algomon> algomonesElegidos;
	public int cantidadAlgomonesElegidos;
	public ControladorJuego controlador;
	public PeleaAlgomonesScene peleaAlgomonesScene;
	public TextArea consola;

	public SeleccionarAlgomonScene(Stage stage, BorderPane escenario, ControladorJuego controlador, String nombreJugador1, String nombreJugador2) {
		super(escenario, 1024, 768);
		this.stage = stage;
		this.escena = escenario;
		this.nombreJugador1 = nombreJugador1;
		this.nombreJugador2 = nombreJugador2;
		this.cantidadAlgomonesElegidos = 0;
		this.crearConsola();
		this.escena.setId("fondo_menus");
		this.algomonesElegidos = new ArrayList<Algomon>();
		this.controlador = controlador;		
		this.crearEspacioAlgomones();
		this.elegirAlgomones();
	}
	
	public void crearConsola(){
		HBox nhbox = new HBox();
		this.consola = new TextArea();
		this.consola.setEditable(false);
		nhbox.getChildren().add(this.consola);
		this.escena.setBottom(nhbox);
	}

	public void crearEspacioAlgomones(){
		this.algomones = new GridPane();
		this.algomones.setAlignment(Pos.CENTER);
		this.algomones.setHgap(50);
		this.algomones.setVgap(50);
		this.charmander = new Button();
		this.squirtle = new Button();
		this.bulbasaur = new Button();
		this.jigglypuff = new Button();
		this.chansey = new Button();
		this.rattata = new Button();
	}
	
	public void crearListaDeAlgomones(){
		this.escena.setCenter(this.algomones);
		this.crearOpcionCharmander("charmander", "Brasas", "Fogonazo", "Ataque Rápido", 0, 0);
		this.crearOpcionSquirtle("squirtle", "Burbuja", "Cañón de Agua", "Ataque Rápido", 1, 0);
		this.crearOpcionBulbasaur("bulbasaur", "Chupavidas", "Latigo Cepa", "Ataque Rápido", 2, 0);
		this.crearOpcionJigglypuff("jigglypuff", "Canto", "Burbuja", "Ataque Rápido", 0, 1);
		this.crearOpcionChansey("chansey", "Canto", "Latigo Cepa", "Ataque Rápido", 1, 1);
		this.crearOpcionRattata("rattata", "Fogonazo", "Burbuja", "Ataque Rápido", 2, 1);
	}
	
	public void crearOpcionCharmander(String algomon, String ataque1, String ataque2, String ataque3, int col, int fil){
		Label nombreAlgomon = new Label(algomon);
		nombreAlgomon.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAlgomon = new ImageView(new Image("file:src/vista/images/pokemons/"+algomon+".gif"));
		nombreAlgomon.setGraphic(imgAlgomon);
		nombreAlgomon.setGraphicTextGap(50);
		nombreAlgomon.setContentDisplay(ContentDisplay.BOTTOM);
		this.charmander = new Button("", nombreAlgomon);
		this.charmander.setId("fondo_algomons");
		this.charmander.setMinSize(250, 250);
		Tooltip.install(this.charmander, new Tooltip("Ataques:\n-"+ataque1+"\n-"+ataque2+"\n-"+ataque3));
		this.algomones.add(this.charmander, col, fil);
		CharmanderBotonHandler charmanderHandler = new CharmanderBotonHandler(this, this.charmander, this.algomonesElegidos, this.controlador, this.consola);
		this.charmander.setOnAction(charmanderHandler);
	}
	
	public void crearOpcionSquirtle(String algomon, String ataque1, String ataque2, String ataque3, int col, int fil){
		Label nombreAlgomon = new Label(algomon);
		nombreAlgomon.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAlgomon = new ImageView(new Image("file:src/vista/images/pokemons/"+algomon+".gif"));
		nombreAlgomon.setGraphic(imgAlgomon);
		nombreAlgomon.setGraphicTextGap(50);
		nombreAlgomon.setContentDisplay(ContentDisplay.BOTTOM);
		this.squirtle = new Button("", nombreAlgomon);
		this.squirtle.setId("fondo_algomons");
		this.squirtle.setMinSize(250, 250);
		Tooltip.install(this.squirtle, new Tooltip("Ataques:\n-"+ataque1+"\n-"+ataque2+"\n-"+ataque3));
		this.algomones.add(this.squirtle, col, fil);
		SquirtleBotonHandler squirtleHandler = new SquirtleBotonHandler(this, this.squirtle, this.algomonesElegidos, this.controlador, this.consola);
		this.squirtle.setOnAction(squirtleHandler);
	}
	
	public void crearOpcionBulbasaur(String algomon, String ataque1, String ataque2, String ataque3, int col, int fil){
		Label nombreAlgomon = new Label(algomon);
		nombreAlgomon.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAlgomon = new ImageView(new Image("file:src/vista/images/pokemons/"+algomon+".gif"));
		nombreAlgomon.setGraphic(imgAlgomon);
		nombreAlgomon.setGraphicTextGap(50);
		nombreAlgomon.setContentDisplay(ContentDisplay.BOTTOM);
		this.bulbasaur = new Button("", nombreAlgomon);
		this.bulbasaur.setId("fondo_algomons");
		this.bulbasaur.setMinSize(250, 250);
		Tooltip.install(this.bulbasaur, new Tooltip("Ataques:\n-"+ataque1+"\n-"+ataque2+"\n-"+ataque3));
		this.algomones.add(this.bulbasaur, col, fil);
		BulbasaurBotonHandler bulbasaurHandler = new BulbasaurBotonHandler(this, this.bulbasaur, this.algomonesElegidos, this.controlador, this.consola);
		this.bulbasaur.setOnAction(bulbasaurHandler);
	}
	
	public void crearOpcionJigglypuff(String algomon, String ataque1, String ataque2, String ataque3, int col, int fil){
		Label nombreAlgomon = new Label(algomon);
		nombreAlgomon.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAlgomon = new ImageView(new Image("file:src/vista/images/pokemons/"+algomon+".gif"));
		nombreAlgomon.setGraphic(imgAlgomon);
		nombreAlgomon.setGraphicTextGap(50);
		nombreAlgomon.setContentDisplay(ContentDisplay.BOTTOM);
		this.jigglypuff = new Button("", nombreAlgomon);
		this.jigglypuff.setId("fondo_algomons");
		this.jigglypuff.setMinSize(250, 250);
		Tooltip.install(this.jigglypuff, new Tooltip("Ataques:\n-"+ataque1+"\n-"+ataque2+"\n-"+ataque3));
		this.algomones.add(this.jigglypuff, col, fil);
		JigglypuffBotonHandler jigglypuffHandler = new JigglypuffBotonHandler(this, this.jigglypuff, this.algomonesElegidos, this.controlador, this.consola);
		this.jigglypuff.setOnAction(jigglypuffHandler);
	}
	
	public void crearOpcionChansey(String algomon, String ataque1, String ataque2, String ataque3, int col, int fil){
		Label nombreAlgomon = new Label(algomon);
		nombreAlgomon.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAlgomon = new ImageView(new Image("file:src/vista/images/pokemons/"+algomon+".gif"));
		nombreAlgomon.setGraphic(imgAlgomon);
		nombreAlgomon.setGraphicTextGap(50);
		nombreAlgomon.setContentDisplay(ContentDisplay.BOTTOM);
		this.chansey = new Button("", nombreAlgomon);
		this.chansey.setId("fondo_algomons");
		this.chansey.setMinSize(250, 250);
		Tooltip.install(this.chansey, new Tooltip("Ataques:\n-"+ataque1+"\n-"+ataque2+"\n-"+ataque3));
		this.algomones.add(this.chansey, col, fil);
		ChanseyBotonHandler chanseyHandler = new ChanseyBotonHandler(this, this.chansey, this.algomonesElegidos, this.controlador, this.consola);
		this.chansey.setOnAction(chanseyHandler);
	}
	
	public void crearOpcionRattata(String algomon, String ataque1, String ataque2, String ataque3, int col, int fil){
		Label nombreAlgomon = new Label(algomon);
		nombreAlgomon.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAlgomon = new ImageView(new Image("file:src/vista/images/pokemons/"+algomon+".gif"));
		nombreAlgomon.setGraphic(imgAlgomon);
		nombreAlgomon.setGraphicTextGap(50);
		nombreAlgomon.setContentDisplay(ContentDisplay.BOTTOM);
		this.rattata = new Button("", nombreAlgomon);
		this.rattata.setId("fondo_algomons");
		this.rattata.setMinSize(250, 250);
		Tooltip.install(this.rattata, new Tooltip("Ataques:\n-"+ataque1+"\n-"+ataque2+"\n-"+ataque3));
		this.algomones.add(this.rattata, col, fil);
		RattataBotonHandler rattataHandler = new RattataBotonHandler(this, this.rattata, this.algomonesElegidos, this.controlador, this.consola);
		this.rattata.setOnAction(rattataHandler);
	}
	
	public ArrayList<Algomon> getAlgomonesElegidos(){
		return this.algomonesElegidos;
	}
	
	public void setNombreJugadores(String jugador1, String jugador2){
		this.nombreJugador1 = jugador1;
		this.nombreJugador2 = jugador2;
	}
	
	public void aumentarCantidadAlgomonesElegidos(){
		this.cantidadAlgomonesElegidos++;
	}
	
	public int getCantidadAlgomonesElegidos(){
		return this.cantidadAlgomonesElegidos;
	}
	
	public void elegirAlgomones(){
		this.consola.appendText("-> " + this.nombreJugador1 + ", es tu turno de elegir algomones.\n-> El primero que elijas será con el primero que juegues.\n");
		this.crearListaDeAlgomones();
	}
	
	public void crearJugador(){
		if(this.cantidadAlgomonesElegidos == 3){
			ArrayList<Algomon> algomonesJugador1 = new ArrayList<Algomon>(this.algomonesElegidos);
			this.controlador.crearJugador(this.nombreJugador1, algomonesJugador1);
			this.algomonesElegidos.clear();
		}else if(this.cantidadAlgomonesElegidos == 6){
			ArrayList<Algomon> algomonesJugador2 = new ArrayList<Algomon>(this.algomonesElegidos);
			this.controlador.crearJugador(this.nombreJugador2, algomonesJugador2);
			this.algomonesElegidos.clear();
		}
	}
	
	public void cambiarAEscenaPelea(){
		this.controlador.inicializarJugadores();
		this.peleaAlgomonesScene = new PeleaAlgomonesScene(this.stage, this.controlador, new BorderPane());
		this.peleaAlgomonesScene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		this.stage.setScene(this.peleaAlgomonesScene);
	}
	
	public void resetearBotonesAlgomones(){
		this.consola.appendText("-> " + this.nombreJugador2 + ", es tu turno de elegir algomones.\n-> El primero que elijas será con el primero que juegues.\n");
		this.charmander.setDisable(false);
		this.squirtle.setDisable(false);
		this.bulbasaur.setDisable(false);
		this.jigglypuff.setDisable(false);
		this.chansey.setDisable(false);
		this.rattata.setDisable(false);
	}

}
