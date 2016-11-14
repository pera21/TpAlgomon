package modelo;

public class TipoFuego extends Tipo {
	
	public TipoFuego(String tipo, double danioContraAgua, double danioContraFuego, double danioContraPlanta, double danioContraNormal){
		super(tipo, danioContraAgua, danioContraFuego, danioContraPlanta, danioContraNormal);
	}
	
	public double danioPorTipo(){
		return this.danioContraFuego;
	}
}
