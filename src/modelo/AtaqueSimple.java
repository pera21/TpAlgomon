package modelo;

public class AtaqueSimple extends Poder {

	public AtaqueSimple(int potenciaAtaque, int cantidadAtaque, TipoAtaque ataque) {
		super(potenciaAtaque, cantidadAtaque, ataque);
	}
	
	@Override
	public void atacar(Algomon atacante, Algomon oponente){
		double danio = this.getTipoAtaque().danioPorTipo(oponente.getTipo()) * this.getPotencia();
		oponente.getVida().reducirVida(danio);
	}

/*	private int potencia;
	private int cantidadOriginal;
	private int cantidadRestante;
	private TipoAtaque ataque;
	
	public AtaqueSimple(int potenciaAtaque, int cantidadAtaque, TipoAtaque ataque) {
		this.potencia = potenciaAtaque;
		this.cantidadOriginal = cantidadAtaque;
		this.cantidadRestante = cantidadAtaque;
		this.ataque = ataque;
	}
	
	public boolean ataquesAgotados(){
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
*/
}