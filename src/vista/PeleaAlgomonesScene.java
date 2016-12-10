package vista;

import java.util.ArrayList;

import controlador.ControladorJuego;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import modelo.Jugador;
import modelo.algomon.Algomon;
import modelo.fabricas.FabricaAtaque;

public class PeleaAlgomonesScene extends Scene{
	
	public Stage stage;
	public BorderPane escenario;
	public ControladorJuego controlador;
	public TextArea consola;
	public Jugador[] jugadores;
	public Algomon algomonJugadorActivo, algomonJugadorInactivo;
	public GridPane algomones;
	public VBox opcionesJugador;
	public TilePane menuInferior;
	public Button ataqueRapido, canto, burbuja, canionDeAgua, chupavidas, latigoCepa, brasas, fogonazo;
	public Button ataque1, ataque2, ataque3;
	public MenuButton pocion, restaurador, superpocion, vitamina;
	public MenuButton cambiarAlgomonActivo;

	public PeleaAlgomonesScene(Stage stage, ControladorJuego controlador, BorderPane escena) {
		super(escena, 1024, 768);
		this.stage = stage;
		this.escenario = escena;
		this.controlador = controlador;
		this.consola = new TextArea();
		this.jugadores = this.controlador.getJugadores();
		this.crearEscenario();
		this.establecerAlgomonesPelea();
		this.asignarAtaquesAlgomonActivo();
		
		//Ejemplo menu button
		/* MenuButton m = new MenuButton("Eats");
		 m.getItems().addAll(new MenuItem("Burger"), new MenuItem("Hot Dog"));
		 this.opcionesJugador.getChildren().add(m);*/
	}
	
	public void crearEscenario(){
		this.algomones = new GridPane();
		this.escenario.setCenter(this.algomones);
		this.escenario.setId("fondo_batalla");
		this.algomones.setAlignment(Pos.CENTER);
		this.algomones.setHgap(50);
		this.algomones.setVgap(50);
		this.menuInferior = new TilePane();
		this.menuInferior.setAlignment(Pos.CENTER);
		this.crearConsola();
		this.crearOpcionesJugador();
		this.escenario.setRight(this.opcionesJugador);
		this.escenario.setBottom(this.menuInferior);
	}
	
	public void crearConsola(){
		this.consola = new TextArea();
		this.consola.setEditable(false);
		this.consola.setId("consola");
		this.menuInferior.getChildren().add(this.consola);
	}
	
	public void crearOpcionesJugador(){
		this.opcionesJugador = new VBox();
		this.opcionesJugador.setId("opcionesJugador");
	}
	
	public void establecerAlgomonesPelea(){
		this.algomonJugadorActivo = this.controlador.getJugadorActivo().getAlgomonActivo();
		this.algomonJugadorInactivo = this.controlador.getJugadorInactivo().getAlgomonActivo();
		this.consola.appendText("-> Es el turno de " + this.controlador.getJugadorActivo().getNombreJugador() + ".\n");
		String nombreAtacante = this.algomonJugadorActivo.getNombreAlgomon();
		String nombreOponente = this.algomonJugadorInactivo.getNombreAlgomon();
		Label atacante = new Label(nombreAtacante + "\n" + this.algomonJugadorActivo.vida() + "/" + this.algomonJugadorActivo.vidaOriginal());
		Label oponente = new Label(nombreOponente + "\n" + this.algomonJugadorInactivo.vida() + "/" + this.algomonJugadorInactivo.vidaOriginal());
		atacante.setTextAlignment(TextAlignment.CENTER);
		oponente.setTextAlignment(TextAlignment.CENTER);
		ImageView imgAtacante = new ImageView(new Image("file:src/vista/images/pokemons/" + nombreAtacante.toLowerCase() + "_b.gif"));
		ImageView imgOponente = new ImageView(new Image("file:src/vista/images/pokemons/" + nombreOponente.toLowerCase() + ".gif"));
		oponente.setId("nombreAlgomonOponente");
		imgAtacante.setFitHeight(100);
		imgAtacante.setFitWidth(100);
		imgOponente.setFitHeight(100);
		imgOponente.setFitWidth(100);
		atacante.setGraphic(imgAtacante);
		atacante.setGraphicTextGap(10);
		atacante.setContentDisplay(ContentDisplay.BOTTOM);
		oponente.setGraphic(imgOponente);
		oponente.setGraphicTextGap(10);
		oponente.setContentDisplay(ContentDisplay.BOTTOM);
		this.algomones.add(atacante, 0, 8);
		this.algomones.add(oponente, 6, 7);
	}
	
	public void asignarAtaquesAlgomonActivo(){
		switch(this.controlador.getJugadorActivo().getAlgomonActivo().getNombreAlgomon()){
		
		case "Charmander":
			this.ataque1 = new Button("Ataque Rapido (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.ATAQUE_RAPIDO) + ")");
			this.ataque2 = new Button("Brasas (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.BRASAS) + ")");
			this.ataque3 = new Button("Fogonazo (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.FOGONAZO) + ")");
			AtaqueRapidoBotonHandler ataqueRapidoHandler = new AtaqueRapidoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			BrasasBotonHandler brasasHandler = new BrasasBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			FogonazoBotonHandler fogonazoHandler = new FogonazoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			this.ataque1.setOnAction(ataqueRapidoHandler);
			this.ataque2.setOnAction(brasasHandler);
			this.ataque3.setOnAction(fogonazoHandler);
			this.opcionesJugador.getChildren().add(this.ataque1);
			this.opcionesJugador.getChildren().add(this.ataque2);
			this.opcionesJugador.getChildren().add(this.ataque3);
			break;
			
		case "Squirtle":
			this.ataque1 = new Button("Ataque Rapido (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.ATAQUE_RAPIDO) + ")");
			this.ataque2 = new Button("Burbuja (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.BURBUJA) + ")");
			this.ataque3 = new Button("Cañon de Agua (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.CANION_DE_AGUA) + ")");
			AtaqueRapidoBotonHandler ataqueRapidoHandler1 = new AtaqueRapidoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			BurbujaBotonHandler burbujaHandler = new BurbujaBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			CanionDeAguaBotonHandler canionDeAguaHandler = new CanionDeAguaBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			this.ataque1.setOnAction(ataqueRapidoHandler1);
			this.ataque2.setOnAction(burbujaHandler);
			this.ataque3.setOnAction(canionDeAguaHandler);
			this.opcionesJugador.getChildren().add(this.ataque1);
			this.opcionesJugador.getChildren().add(this.ataque2);
			this.opcionesJugador.getChildren().add(this.ataque3);
			break;
			
		case "Bulbasaur":
			this.ataque1 = new Button("Ataque Rapido (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.ATAQUE_RAPIDO) + ")");
			this.ataque2 = new Button("Chupavidas (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.CHUPAVIDAS) + ")");
			this.ataque3 = new Button("Latigo Cepa (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.LATIGO_CEPA) + ")");
			AtaqueRapidoBotonHandler ataqueRapidoHandler2 = new AtaqueRapidoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			ChupavidasBotonHandler chupavidasHandler = new ChupavidasBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			LatigoCepaBotonHandler latigoCepaHandler = new LatigoCepaBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			this.ataque1.setOnAction(ataqueRapidoHandler2);
			this.ataque2.setOnAction(chupavidasHandler);
			this.ataque3.setOnAction(latigoCepaHandler);
			this.opcionesJugador.getChildren().add(this.ataque1);
			this.opcionesJugador.getChildren().add(this.ataque2);
			this.opcionesJugador.getChildren().add(this.ataque3);
			break;
			
		case "Jigglypuff":
			this.ataque1 = new Button("Ataque Rapido (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.ATAQUE_RAPIDO) + ")");
			this.ataque2 = new Button("Canto (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.CANTO) + ")");
			this.ataque3 = new Button("Burbuja (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.BURBUJA) + ")");
			AtaqueRapidoBotonHandler ataqueRapidoHandler3 = new AtaqueRapidoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			CantoBotonHandler cantoHandler = new CantoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			BurbujaBotonHandler burbujaHandler2 = new BurbujaBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			this.ataque1.setOnAction(ataqueRapidoHandler3);
			this.ataque2.setOnAction(cantoHandler);
			this.ataque3.setOnAction(burbujaHandler2);
			this.opcionesJugador.getChildren().add(this.ataque1);
			this.opcionesJugador.getChildren().add(this.ataque2);
			this.opcionesJugador.getChildren().add(this.ataque3);
			break;
			
		case "Chansey":
			this.ataque1 = new Button("Ataque Rapido (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.ATAQUE_RAPIDO) + ")");
			this.ataque2 = new Button("Canto (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.CANTO) + ")");
			this.ataque3 = new Button("Latigo Cepa (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.LATIGO_CEPA) + ")");
			AtaqueRapidoBotonHandler ataqueRapidoHandler4 = new AtaqueRapidoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			CantoBotonHandler cantoHandler2 = new CantoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			LatigoCepaBotonHandler latigoCepaHandler2 = new LatigoCepaBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			this.ataque1.setOnAction(ataqueRapidoHandler4);
			this.ataque2.setOnAction(cantoHandler2);
			this.ataque3.setOnAction(latigoCepaHandler2);
			this.opcionesJugador.getChildren().add(this.ataque1);
			this.opcionesJugador.getChildren().add(this.ataque2);
			this.opcionesJugador.getChildren().add(this.ataque3);
			break;
			
		case "Rattata":
			this.ataque1 = new Button("Ataque Rapido (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.ATAQUE_RAPIDO) + ")");
			this.ataque2 = new Button("Fogonazo (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.FOGONAZO) + ")");
			this.ataque3 = new Button("Burbuja (" + this.controlador.getJugadorActivo().getAlgomonActivo().getAtaquesRestantes(FabricaAtaque.BURBUJA) + ")");
			AtaqueRapidoBotonHandler ataqueRapidoHandler5 = new AtaqueRapidoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			FogonazoBotonHandler fogonazoHandler2 = new FogonazoBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			BurbujaBotonHandler burbujaHandler3 = new BurbujaBotonHandler(this, this.controlador, this.consola, this.algomonJugadorActivo, this.algomonJugadorInactivo);
			this.ataque1.setOnAction(ataqueRapidoHandler5);
			this.ataque2.setOnAction(fogonazoHandler2);
			this.ataque3.setOnAction(burbujaHandler3);
			this.opcionesJugador.getChildren().add(this.ataque1);
			this.opcionesJugador.getChildren().add(this.ataque2);
			this.opcionesJugador.getChildren().add(this.ataque3);
			break;			
		}
		this.agregarBotonesElementos();
	}
	
	public void resetearPaneles(){
		this.algomones.getChildren().clear();
		this.opcionesJugador.getChildren().clear();
	}
	
	public void agregarBotonesElementos(){
		this.pocion = new MenuButton("Pocion (" + this.controlador.getJugadorActivo().getMochila().getCantidadRestantePocion() + ")");
		this.restaurador = new MenuButton("Restaurador (" + this.controlador.getJugadorActivo().getMochila().getCantidadRestanteRestaurador() + ")");
		this.superpocion = new MenuButton("Superpoción (" + this.controlador.getJugadorActivo().getMochila().getCantidadRestanteSuperpocion() + ")");
		this.vitamina = new MenuButton("Vitamina (" + this.controlador.getJugadorActivo().getMochila().getCantidadRestanteVitamina() + ")");
		ArrayList<Algomon> algomones = this.controlador.getJugadorActivo().getListaAlgomones();
		// POCIONES
		MenuItem pocionAlgomon1 = new MenuItem(algomones.get(0).getNombreAlgomon());
		MenuItem pocionAlgomon2 = new MenuItem(algomones.get(1).getNombreAlgomon());
		MenuItem pocionAlgomon3 = new MenuItem(algomones.get(2).getNombreAlgomon());
		// HANDLERS POCIONES
		PocionBotonHandler pocionHandler1 = new PocionBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(0));
		PocionBotonHandler pocionHandler2 = new PocionBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(1));
		PocionBotonHandler pocionHandler3 = new PocionBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(2));
		pocionAlgomon1.setOnAction(pocionHandler1);
		pocionAlgomon2.setOnAction(pocionHandler2);
		pocionAlgomon3.setOnAction(pocionHandler3);
		this.pocion.getItems().addAll(pocionAlgomon1, pocionAlgomon2, pocionAlgomon3);
		
		// RESTAURADOR
		MenuItem restauradorAlgomon1 = new MenuItem(algomones.get(0).getNombreAlgomon());
		MenuItem restauradorAlgomon2 = new MenuItem(algomones.get(1).getNombreAlgomon());
		MenuItem restauradorAlgomon3 = new MenuItem(algomones.get(2).getNombreAlgomon());
		//HANDLERS RESTAURADOR
		RestauradorBotonHandler restauradorHandler1 = new RestauradorBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(0));
		RestauradorBotonHandler restauradorHandler2 = new RestauradorBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(1));
		RestauradorBotonHandler restauradorHandler3 = new RestauradorBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(2));
		restauradorAlgomon1.setOnAction(restauradorHandler1);
		restauradorAlgomon2.setOnAction(restauradorHandler2);
		restauradorAlgomon3.setOnAction(restauradorHandler3);
		this.restaurador.getItems().addAll(restauradorAlgomon1, restauradorAlgomon2, restauradorAlgomon3);
		
		// SUPERPOCION
		MenuItem superpocionAlgomon1 = new MenuItem(algomones.get(0).getNombreAlgomon());
		MenuItem superpocionAlgomon2 = new MenuItem(algomones.get(1).getNombreAlgomon());
		MenuItem superpocionAlgomon3 = new MenuItem(algomones.get(2).getNombreAlgomon());
		SuperpocionBotonHandler superpocionHandler1 = new SuperpocionBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(0));
		SuperpocionBotonHandler superpocionHandler2 = new SuperpocionBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(1));
		SuperpocionBotonHandler superpocionHandler3 = new SuperpocionBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(2));
		// HANDLERS SUPERPOCION
		superpocionAlgomon1.setOnAction(superpocionHandler1);
		superpocionAlgomon2.setOnAction(superpocionHandler2);
		superpocionAlgomon3.setOnAction(superpocionHandler3);
		this.superpocion.getItems().addAll(superpocionAlgomon1, superpocionAlgomon2, superpocionAlgomon3);
		
		// VITAMINA
		MenuItem vitaminaAlgomon1 = new MenuItem(algomones.get(0).getNombreAlgomon());
		MenuItem vitaminaAlgomon2 = new MenuItem(algomones.get(1).getNombreAlgomon());
		MenuItem vitaminaAlgomon3 = new MenuItem(algomones.get(2).getNombreAlgomon());
		VitaminaBotonHandler vitaminaHandler1 = new VitaminaBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(0));
		VitaminaBotonHandler vitaminaHandler2 = new VitaminaBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(1));
		VitaminaBotonHandler vitaminaHandler3 = new VitaminaBotonHandler(this, this.controlador, this.consola, this.controlador.getJugadorActivo(), algomones.get(2));
		// HANDLERS VITAMINA
		vitaminaAlgomon1.setOnAction(vitaminaHandler1);
		vitaminaAlgomon2.setOnAction(vitaminaHandler2);
		vitaminaAlgomon3.setOnAction(vitaminaHandler3);
		this.vitamina.getItems().addAll(vitaminaAlgomon1, vitaminaAlgomon2, vitaminaAlgomon3);
		
		this.opcionesJugador.getChildren().addAll(this.pocion, this.restaurador, this.superpocion, this.vitamina);
	}
	
	public void agregarAlgomonesASubMenus(){
		
	}
	
}
