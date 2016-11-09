package modelo;

public class Poder {

	private int potencia;
	private int cantidadOriginal;
	private int cantidadRestante;
	private TipoAtaque ataque;
	/*private boolean efimero;
	private boolean persistente;*/
	
	public Poder(int potenciaAtaque, int cantidadAtaque, TipoAtaque ataque) {
		this.potencia = potenciaAtaque;
		this.cantidadOriginal = cantidadAtaque;
		this.cantidadRestante = cantidadAtaque;
		this.ataque = ataque;
		/*this.efimero = esEfimero;
		this.persistente = esPersistente;*/
	}
	
	private boolean ataquesAgotados(){
		
		return cantidadRestante == 0;
	}
	
	public int getPotencia(){
		return this.potencia;
	}

	public void reducirCantidadAtaque() {
		this.cantidadRestante -= 1;
		
	}
	
	public TipoAtaque getTipoAtaque(){
		return this.ataque;
	}

}
