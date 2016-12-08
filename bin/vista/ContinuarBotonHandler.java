package vista;
import controlador.ControladorJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ContinuarBotonHandler implements EventHandler<ActionEvent>{
	
	public Stage stage;
	public SeleccionarAlgomonScene seleccionarAlgomones;
	public TextField nombreJugador1, nombreJugador2;
	public ControladorJuego controlador;
	
	public ContinuarBotonHandler(Stage stage, ControladorJuego controlador, TextField nombreJugador1, TextField nombreJugador2){
		this.stage = stage;
		this.controlador = controlador;
		this.nombreJugador1 = nombreJugador1;
		this.nombreJugador2 = nombreJugador2;
	}
	
	@Override
	public void handle(ActionEvent event) {
		this.seleccionarAlgomones = new SeleccionarAlgomonScene(this.stage, new BorderPane(), this.controlador, this.nombreJugador1.getText(), this.nombreJugador2.getText());
		this.seleccionarAlgomones.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		this.stage.setScene(this.seleccionarAlgomones);
	}
	
}
