package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonJugarEventHandler implements EventHandler<ActionEvent>{

	public Stage stage;
    public Scene proximaEscena;

    public BotonJugarEventHandler(Stage stage, Scene proximaEscena) {
        this.stage = stage;
        this.proximaEscena = proximaEscena;
    }


	@Override
	public void handle(ActionEvent actionEvent) {
        stage.setScene(this.proximaEscena);
		
	}

}
