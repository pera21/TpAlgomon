package modelo;

public abstract class Poder {

	private int potencia;
	private int cantidadOriginal;
	private int cantidadRestante;
	private TipoElemento ataque;
	
	public Poder(int potenciaAtaque, int cantidadAtaque, TipoElemento ataque) {
		this.potencia = potenciaAtaque;
		this.cantidadOriginal = cantidadAtaque;
		this.cantidadRestante = cantidadAtaque;
		this.ataque = ataque;
	}
	
	private boolean ataquesAgotados(){
		return this.cantidadRestante == 0;
	}
	
	public int getPotencia(){
		return this.potencia;
	}

	public void reducirCantidadAtaque() throws AtaquesAgotados {
		if(ataquesAgotados()){
			throw new AtaquesAgotados();
		}
		this.cantidadRestante -= 1;
		
	}

	public TipoElemento getTipoElemento() {
		return this.ataque;
	}
	
	public int getCantidad(){
		return this.cantidadRestante;
	}

	public abstract void atacar(Algomon atacante, Algomon oponente);

	public void modificarCantidadAtaques(int cantidadAtaquesRegenerados) {
		if (this.cantidadRestante + cantidadAtaquesRegenerados > this.cantidadOriginal){
			this.cantidadRestante = this.cantidadOriginal;
		}else{
			this.cantidadRestante += cantidadAtaquesRegenerados;
		}
		
	}
}
