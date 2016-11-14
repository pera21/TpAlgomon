package modelo;

public class TipoAgua extends Tipo{
	
	public TipoAgua(String tipo, double danioContraAgua, double danioContraFuego, double danioContraPlanta, double danioContraNormal){
		super(tipo, danioContraAgua, danioContraFuego, danioContraPlanta, danioContraNormal);
	}
	
	public double danioPorTipo(){
		return this.danioContraAgua;
	}
}
