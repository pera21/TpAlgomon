package modelo;

public class TipoNormal extends Tipo {
	
	public TipoNormal(String tipo, double danioContraAgua, double danioContraFuego, double danioContraPlanta, double danioContraNormal){
		super(tipo, danioContraAgua, danioContraFuego, danioContraPlanta, danioContraNormal);
	}
	
	public double danioPorTipo(){
		return this.danioContraNormal;
	}
}
