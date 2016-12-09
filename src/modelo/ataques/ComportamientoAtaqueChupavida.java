package modelo.ataques;

import modelo.algomon.Algomon;
import modelo.elementos.TipoElemento;

public class ComportamientoAtaqueChupavida extends Poder{

	public ComportamientoAtaqueChupavida(int potenciaAtaque, int cantidadAtaque, TipoElemento ataque) {
		super(potenciaAtaque, cantidadAtaque, ataque);
	}

	@Override
	public void atacar(Algomon atacante, Algomon oponente) {
		double danio = this.getTipoElemento().danioContra(oponente.getTipo()) * this.getPotencia();
		oponente.getVida().reducirVida(oponente, danio);
		atacante.getVida().aumentarVida(danio * 0.3);
	}
	

}
