package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JugarBotonHandler implements EventHandler<ActionEvent>{

	public Stage stage;
    public Scene proximaEscena;

    public JugarBotonHandler(Stage stage, Scene proximaEscena) {
        this.stage = stage;
        this.proximaEscena = proximaEscena;
    }


	@Override
	public void handle(ActionEvent actionEvent) {
        stage.setScene(this.proximaEscena);
		
	}

}
