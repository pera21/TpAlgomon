package modelo.estados;

import modelo.algomon.Algomon;

public interface EstadoPersistente {
	public void aplicarEfectoEstado(Algomon atacante);

}