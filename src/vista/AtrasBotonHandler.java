package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AtrasBotonHandler implements EventHandler<ActionEvent>{
	public Stage stage;
    public Scene anteriorEscena;

    public AtrasBotonHandler(Stage stage, Scene anteriorEscena) {
        this.stage = stage;
        this.anteriorEscena = anteriorEscena;
    }

	@Override
	public void handle(ActionEvent accion) {
		 stage.setScene(anteriorEscena);
	}
}
