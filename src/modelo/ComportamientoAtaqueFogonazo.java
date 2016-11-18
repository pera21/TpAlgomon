package modelo;

public class ComportamientoAtaqueFogonazo extends Poder{

	public ComportamientoAtaqueFogonazo(int potenciaAtaque, int cantidadAtaque, TipoElemento ataque) {
		super(potenciaAtaque, cantidadAtaque, ataque);
	}
	
	public void aplicarEfecto(Algomon oponente){
		oponente.estadoQuemado();
	}
	
	@Override
	public void atacar(Algomon atacante, Algomon oponente){
		double danio = this.getTipoElemento().danioContra(oponente.getTipo()) * this.getPotencia();
		oponente.getVida().reducirVida(danio);
		this.aplicarEfecto(oponente);
	}
		
}
