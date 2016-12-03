package vista;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class BatallaScene extends Scene{
	
	public BorderPane escenario;
	public VBox menuJugador; // Columna derecha
	public VBox algomonAtacante; //Columna izquierda
	public StackPane algomonOponente; // centro

	public BatallaScene(Parent root) {
		super(root);
		// TODO Auto-generated constructor stub
	}

}
