package modelo.estados;

import modelo.algomon.Algomon;
import modelo.ataques.Poder;

public interface EstadoAlgomon {
	
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque);
}
