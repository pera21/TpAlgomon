package modelo.ataques;

import modelo.algomon.Algomon;
import modelo.elementos.TipoElemento;

public class ComportamientoAtaqueCanto extends Poder{

	public ComportamientoAtaqueCanto(int potenciaAtaque, int cantidadAtaque, TipoElemento ataque) {
		super(potenciaAtaque, cantidadAtaque, ataque);
	}
	
	public void aplicarEfecto(Algomon oponente){
		oponente.estadoDormido();
	}

	@Override
	public void atacar(Algomon atacante, Algomon oponente) {
		double danio = this.getTipoElemento().danioContra(oponente.getTipo()) * this.getPotencia();
		oponente.getVida().reducirVida(oponente, danio);
		this.aplicarEfecto(oponente);
	}


}
