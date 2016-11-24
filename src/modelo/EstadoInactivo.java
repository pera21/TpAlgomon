package modelo;

public class EstadoInactivo implements Estado{

	@Override
	public void atacar(Algomon atacante, Algomon oponente, FabricaAtaque ataque) {
		throw new RuntimeException("No es tu turno");
	}

	@Override
	public void utilizarElemento(Algomon algomon, Elemento elemento) {
		throw new RuntimeException("No es tu turno");
	}

}
