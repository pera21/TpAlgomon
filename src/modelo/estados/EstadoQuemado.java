package modelo.estados;

import modelo.algomon.Algomon;

public class EstadoQuemado implements EstadoPersistente {
	
	public void aplicarEfectoEstado(Algomon algomon){
		algomon.getVida().quemar(algomon);
	}


}
