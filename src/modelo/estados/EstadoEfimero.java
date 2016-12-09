package modelo.estados;

import modelo.algomon.Algomon;
import modelo.ataques.Poder;

public interface EstadoEfimero {
	public void aplicarEfecto(Algomon algomon) throws estaDormido;
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque);

}
