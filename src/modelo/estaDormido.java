package modelo;

public class estaDormido extends Exception {
	
	private static final long serialVersionUID = 1L;

	estaDormido(){
		super("No podes atacar, tu algomón esta dormido. Pierdes el turno");
	}

}
