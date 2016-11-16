package modelo;

public class Vida {
	private int vidaOriginal;
	private int vidaRestante;
	
	public Vida(int original){
		this.vidaOriginal = original;
		this.vidaRestante = original;
	}
	
	public void reducirVida(double danio){
		this.vidaRestante -= danio;
		if(this.vidaRestante < 0)
			this.vidaRestante = 0;
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
	
	public void quemar(){
		this.vidaRestante -= (this.vidaOriginal * 0.10);
	}
}
