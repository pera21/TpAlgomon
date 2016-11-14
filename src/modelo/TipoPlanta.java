package modelo;

public class TipoPlanta extends Tipo {
	
	public TipoPlanta(String tipo, double danioContraAgua, double danioContraFuego, double danioContraPlanta, double danioContraNormal){
		super(tipo, danioContraAgua, danioContraFuego, danioContraPlanta, danioContraNormal);
	}
	
	public double danioPorTipo(){
		return this.danioContraPlanta;
	}
}
