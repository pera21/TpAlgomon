package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComoJugarBotonHandler implements EventHandler<ActionEvent>{
	
	public Stage stage;
	public MenuPrincipalScene escenaActual;
	
	public ComoJugarBotonHandler(Stage stage, MenuPrincipalScene escena){
		this.stage = stage;
		this.escenaActual = escena;
	}
	
	@Override
	public void handle(ActionEvent event) {
		ComoJugarScene escena = new ComoJugarScene(this.stage, this.escenaActual, new HBox());
		escena.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		this.stage.setScene(escena);
		
	}

}
