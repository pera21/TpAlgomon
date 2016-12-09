package modelo.estados;

import modelo.algomon.Algomon;
import modelo.elementos.Elemento;
import modelo.fabricas.FabricaAtaque;

public interface Estado {
	
	public void atacar(Algomon atacante, Algomon oponente, FabricaAtaque ataque);
	public void utilizarElemento(Algomon algomon, Elemento elemento);

}
