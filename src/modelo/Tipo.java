package modelo;

public abstract class Tipo {
	
	protected String tipo;
	protected double danioContraAgua;
	protected double danioContraFuego;
	protected double danioContraPlanta;
	protected double danioContraNormal;

	
	public Tipo(String tipo, double danioContraAgua, double danioContraFuego, double danioContraPlanta, double danioContraNormal){
		this.tipo = tipo;
		this.danioContraAgua = danioContraAgua;
		this.danioContraFuego = danioContraFuego;
		this.danioContraPlanta = danioContraPlanta;
		this.danioContraNormal = danioContraNormal;
			
	}
	
	public abstract double danioPorTipo();
}
