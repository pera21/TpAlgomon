package modelo;

public class Vida {
	private int vidaOriginal;
	private int vidaRestante;
	
	public Vida(int original){
		this.vidaOriginal = original;
		this.vidaRestante = original;
	}
	
	public void reducirVida(double danio) throws AlgomonMuerto{
		if(this.vidaRestante == 0)
			throw new AlgomonMuerto();
		this.vidaRestante -= danio;
		if(this.vidaRestante < 0)
			this.vidaRestante = 0;
	}
	
	public int obtenerVida(){
		return this.vidaRestante;
	}

}
