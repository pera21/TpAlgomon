package modelo;

public class AlgomonMuerto extends Exception {

	private static final long serialVersionUID = 1L;

	AlgomonMuerto(){
		super("El algomón que intentas atacar ya está muerto");
	}
}
