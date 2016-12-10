package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CreditosBotonHandler implements EventHandler<ActionEvent>{
	
	Stage stage;
    Scene proximaEscena;

    public CreditosBotonHandler(Stage stage, Scene proximaEscena) {
        this.stage = stage;
        this.proximaEscena = proximaEscena;
    }

	@Override
	public void handle(ActionEvent accion) {
		 stage.setScene(proximaEscena);
		
	}
	
}


