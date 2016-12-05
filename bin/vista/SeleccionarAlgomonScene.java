package vista;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
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
import modelo.FabricaEspecie;
import modelo.Jugador;
import modelo.Algomon;

public class SeleccionarAlgomonScene extends Scene{
	
	public BorderPane escena;
	public GridPane algomones;
	public HBox bottom;
	public Button botonAlgomon;
	public Button botonJugar;
	public Button charmander;
	public Button squirtle;
	public Button bulbasaur;
	public Button jigglypuff;
	public Button chansey;
	public Button rattata;
	public ArrayList<Algomon> algomonesElegidos;
	
    /*BorderPane borderPane = new BorderPane();
    ToolBar toolbar = new ToolBar();
    HBox statusbar = new HBox();
    borderPane.setTop(toolbar);
    borderPane.setBottom(statusbar);*/
	

	public SeleccionarAlgomonScene(BorderPane escenario) {
		super(escenario, 800, 600);
		this.escena = escenario;
		this.escena.setId("fondo_menus");
		this.crearEspacioAlgomones();
		this.crearListaDeAlgomones();
		this.botonJugar = new Button("Jugar");
		this.bottom = new HBox();
		this.bottom.getChildren().add(this.botonJugar);
		this.escena.setBottom(this.bottom);
	}

	public void crearEspacioAlgomones(){
		this.algomones = new GridPane();
		this.algomones.setAlignment(Pos.CENTER);
		this.algomones.setHgap(50);
		this.algomones.setVgap(50);
		//this.algomones.setPadding(new Insets(25, 25, 25, 25));
	}
	public void crearListaDeAlgomones(){
		this.escena.setCenter(algomones);
		this.crearOpcionAlgomon("Charmander", "Brasas", "Fogonazo", "Ataque Rápido", 0, 0);
		this.crearOpcionAlgomon("Squirtle", "Burbuja", "Cañón de Agua", "Ataque Rápido", 1, 0);
		this.crearOpcionAlgomon("Bulbasaur", "Chupavidas", "Latigo Cepa", "Ataque Rápido", 2, 0);
		this.crearOpcionAlgomon("Jigglypuff", "Canto", "Burbuja", "Ataque Rápido", 0, 1);
		this.crearOpcionAlgomon("Chansey", "Canto", "Latigo Cepa", "Ataque Rápido", 1, 1);
		this.crearOpcionAlgomon("Rattata", "Fogonazo", "Burbuja", "Ataque Rápido", 2, 1);
	}
	
	public void crearOpcionAlgomon(String algomon, String ataque1, String ataque2, String ataque3, int col, int fil){
		Label nombreAlgomon = new Label(algomon);
		nombreAlgomon.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAlgomon = new ImageView(new Image("file:src/vista/images/Pokemons/"+algomon+".gif"));
		nombreAlgomon.setGraphic(imgAlgomon);
		nombreAlgomon.setGraphicTextGap(50);
		nombreAlgomon.setContentDisplay(ContentDisplay.BOTTOM);
		this.botonAlgomon = new Button("", nombreAlgomon);
		this.botonAlgomon.setId("fondo_algomons");
		this.botonAlgomon.setMinSize(250, 250);
		Tooltip.install(this.botonAlgomon, new Tooltip("Ataques:\n-"+ataque1+"\n-"+ataque2+"\n-"+ataque3));
		this.algomones.add(this.botonAlgomon, col, fil);
		botonAlgomon.setOnAction(e->{
			String nombre = nombreAlgomon.getText().toUpperCase();
			FabricaEspecie.valueOf(nombre).crear();
			//agregar el algomon al array del Jugador
		});
	}
	
	public ArrayList<Algomon> getAlgomonesElegidos(){
		return this.algomonesElegidos;
	}

}
