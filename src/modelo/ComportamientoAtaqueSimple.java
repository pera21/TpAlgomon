package modelo;

public class ComportamientoAtaqueSimple extends Poder {

	public ComportamientoAtaqueSimple(int potenciaAtaque, int cantidadAtaque, TipoElemento ataque) {
		super(potenciaAtaque, cantidadAtaque, ataque);
	}
	
	@Override
	public void atacar(Algomon atacante, Algomon oponente){
		double danio = this.getTipoElemento().danioContra(oponente.getTipo()) * this.getPotencia();
		oponente.getVida().reducirVida(oponente, danio);
	}
}