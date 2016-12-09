package modelo.estados;

import modelo.algomon.Algomon;
import modelo.ataques.Poder;

public class EstadoInactivoAlgomon implements EstadoAlgomon {

	@Override
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque) {
		throw new RuntimeException("No es tu turno");
	}

}
