package modelo.ataques;

import modelo.algomon.Algomon;
import modelo.fabricas.FabricaAtaque;

public interface Atacar {
	public void atacar(Algomon oponente, FabricaAtaque ataque);

}
