package modelo.estados;

import modelo.algomon.Algomon;
import modelo.ataques.Poder;

public class EstadoNormal implements EstadoPersistente, EstadoEfimero {
	
	public void quemar(Algomon atacante){
		
	}

	@Override
	public void aplicarEfectoEstado(Algomon atacante) {
		return;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) throws estaDormido {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque) {
		// TODO Auto-generated method stub
		
	}


}
