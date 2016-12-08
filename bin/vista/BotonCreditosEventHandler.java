package vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonCreditosEventHandler implements EventHandler<ActionEvent>{
	
	Stage stage;
    Scene proximaEscena;

    public BotonCreditosEventHandler(Stage stage, Scene proximaEscena) {
        this.stage = stage;
        this.proximaEscena = proximaEscena;
    }

	@Override
	public void handle(ActionEvent accion) {
		 stage.setScene(proximaEscena);
		
	}
	
}


