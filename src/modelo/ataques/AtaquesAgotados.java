package modelo.ataques;

public class AtaquesAgotados extends Exception {

	private static final long serialVersionUID = 1L;

	AtaquesAgotados(){
		super("No te quedan más ataques disponibles");
	}

}
