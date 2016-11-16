package modelo;

public class EstadoDormido implements EstadoEfimero {
	
	private int duracionEstado;
	
	public EstadoDormido(int turnosDormido){
		this.duracionEstado = turnosDormido;
	}


}
