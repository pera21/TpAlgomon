package modelo.estados;

import modelo.algomon.Algomon;
import modelo.ataques.Poder;

public class EstadoMuertoAlgomon implements EstadoAlgomon{

	@Override
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque) {
		throw new RuntimeException("El algomón está muerto");
		
	}

}
