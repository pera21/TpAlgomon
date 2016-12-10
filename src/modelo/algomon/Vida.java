package modelo.algomon;

public class Vida {
	private int vidaOriginal;
	private int vidaRestante;
	
	public Vida(int original){
		this.vidaOriginal = original;
		this.vidaRestante = original;
	}
	
	public void reducirVida(Algomon atacado, double danio){
		this.vidaRestante -= danio;
		if(this.vidaRestante <= 0){
			this.vidaRestante = 0;
			atacado.cambiarAEstadoMuerto();
		}		
	}
	
	public int getVidaOriginal(){
		return this.vidaOriginal;
	}
	
	public int getVida(){
		return this.vidaRestante;
	}
	
	public void aumentarVida(double vida){
		if(this.vidaRestante + vida > this.vidaOriginal){
			this.vidaRestante = this.vidaOriginal;
		}else{
			this.vidaRestante += vida;
		}
	}
	
	public void quemar(Algomon algomon){
		this.reducirVida(algomon, this.vidaOriginal * 0.10);
	}
}
