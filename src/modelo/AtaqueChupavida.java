package modelo;

public class AtaqueChupavida extends Poder{

	public AtaqueChupavida(int potenciaAtaque, int cantidadAtaque, TipoAtaque ataque) {
		super(potenciaAtaque, cantidadAtaque, ataque);
	}

	@Override
	public void atacar(Algomon atacante, Algomon oponente) {
		double danio = this.getTipoAtaque().danioPorTipo(oponente.getTipo()) * this.getPotencia();
		oponente.getVida().reducirVida(danio);
		atacante.getVida().aumentarVida(danio * 0.3);
	}
	

}
