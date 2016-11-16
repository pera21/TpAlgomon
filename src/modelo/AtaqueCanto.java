package modelo;

public class AtaqueCanto extends Poder{

	public AtaqueCanto(int potenciaAtaque, int cantidadAtaque, TipoAtaque ataque) {
		super(potenciaAtaque, cantidadAtaque, ataque);
	}
	
	public void aplicarEfecto(Algomon oponente){
		
	}

	@Override
	public void atacar(Algomon atacante, Algomon oponente) {
		double danio = this.getTipoAtaque().danioPorTipo(oponente.getTipo()) * this.getPotencia();
		oponente.getVida().reducirVida(danio);
	}


}
