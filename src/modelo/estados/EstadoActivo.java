package modelo.estados;

import modelo.algomon.Algomon;
import modelo.elementos.Elemento;
import modelo.fabricas.FabricaAtaque;

public class EstadoActivo implements Estado{

	@Override
	public void atacar(Algomon atacante, Algomon oponente, FabricaAtaque ataque) {
		atacante.atacar(oponente, ataque);
	}

	@Override
	public void utilizarElemento(Algomon algomon, Elemento elemento) {
		elemento.aplicarEfecto(algomon);
	}

}
