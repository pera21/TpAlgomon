package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ContinuarComoJugarHandler implements EventHandler<ActionEvent>{
	public Stage stage;
	public ComoJugarScene escenaActual;
	
    public ContinuarComoJugarHandler(Stage stage, ComoJugarScene actual) {
        this.stage = stage;
        this.escenaActual = actual;
    }

	@Override
	public void handle(ActionEvent accion) {
		ComoJugarContinuacionScene continuaComoJugar = new ComoJugarContinuacionScene(this.stage, this.escenaActual, new HBox());
		continuaComoJugar.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		this.stage.setScene(continuaComoJugar);
	}
}
