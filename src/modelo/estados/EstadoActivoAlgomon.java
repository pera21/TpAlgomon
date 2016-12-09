package modelo.estados;

import modelo.algomon.Algomon;
import modelo.ataques.Poder;

public class EstadoActivoAlgomon implements EstadoAlgomon {

	@Override
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque) {
		atacante.estadoEfimero().atacar(atacante, oponente, ataque);
	}

}
