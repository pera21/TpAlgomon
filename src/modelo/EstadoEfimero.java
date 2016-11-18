package modelo;

public interface EstadoEfimero {
	public void aplicarEfecto(Algomon algomon) throws estaDormido;
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque);

}
