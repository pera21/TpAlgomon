package modelo;

public class EstadoActivoAlgomon implements EstadoAlgomon {

	@Override
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque) {
		atacante.estadoEfimero().atacar(atacante, oponente, ataque);
	}

}
