package modelo;

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
		oponente.getVida().reducirVida(danio);
		this.aplicarEfecto(oponente);
	}


}
