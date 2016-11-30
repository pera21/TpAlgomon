package modelo;

public interface Estado {
	
	public void atacar(Algomon atacante, Algomon oponente, FabricaAtaque ataque);
	public void utilizarElemento(Algomon algomon, Elemento elemento);

}
