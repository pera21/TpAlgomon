package modelo;

public class EstadoInactivoAlgomon implements EstadoAlgomon {

	@Override
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque) {
		throw new RuntimeException("No es tu turno");
	}

}
