package modelo;

public class EstadoDormido implements EstadoEfimero {
	
	private int duracionEstado;
	
	public EstadoDormido(){
		this.duracionEstado = 3;
	}
	
	public void aplicarEfecto(Algomon algomon){
		if(this.duracionEstado > 1){
			this.duracionEstado -= 1;
		}else{
			algomon.estadoActivo();
		}
	}
	
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque){
		this.aplicarEfecto(atacante);
		atacante.estadoPersistente().aplicarEfectoEstado(atacante);
	}

}
