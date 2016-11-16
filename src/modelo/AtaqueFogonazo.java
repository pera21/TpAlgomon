package modelo;

public class AtaqueFogonazo extends Poder{

	public AtaqueFogonazo(int potenciaAtaque, int cantidadAtaque, TipoAtaque ataque) {
		super(potenciaAtaque, cantidadAtaque, ataque);
	}
	
	public void aplicarEfecto(Algomon oponente){
		oponente.estadoQuemado();
	}
	
	@Override
	public void atacar(Algomon atacante, Algomon oponente){
		double danio = this.getTipoAtaque().danioPorTipo(oponente.getTipo()) * this.getPotencia();
		oponente.getVida().reducirVida(danio);
		this.aplicarEfecto(oponente);
	}
		
}
