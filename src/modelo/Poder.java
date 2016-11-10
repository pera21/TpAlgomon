package modelo;

public class Poder {

	private int potencia;
	private int cantidadOriginal;
	private int cantidadRestante;
	private TipoAtaque ataque;
	
	public Poder(int potenciaAtaque, int cantidadAtaque, TipoAtaque ataque) {
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

	public TipoAtaque getTipoAtaque() {
		return this.ataque;
	}
	
	public int getCantidad(){
		return this.cantidadRestante;
	}

}
