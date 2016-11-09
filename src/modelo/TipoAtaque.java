package modelo;

public enum TipoAtaque {
	
	//Agua, fuego, Planta, Normal
	AGUA("agua", 0.5, 2, 0.5, 1),
	FUEGO("fuego", 0.5, 0.5, 2, 1),
	PLANTA("planta", 2, 0.5, 0.5, 1),
	NORMAL("normal", 1, 1, 1, 1);
	
	private String tipo;
	private double danioContraAgua;
	private double danioContraFuego;
	private double danioContraPlanta;
	private double danioContraNormal;

	
	private TipoAtaque(String tipo, double danioContraAgua, double danioContraFuego, double danioContraPlanta, double danioContraNormal){
		
		this.tipo = tipo;
		this.danioContraAgua = danioContraAgua;
		this.danioContraFuego = danioContraFuego;
		this.danioContraPlanta = danioContraPlanta;
		this.danioContraNormal = danioContraNormal;
			
	}
	
	private boolean esFuego(TipoAlgomon tipoAlgomon){
		
		return tipoAlgomon.tipo().equals("fuego");
	}
	
	private boolean esAgua(TipoAlgomon tipoAlgomon){
		
		return tipoAlgomon.tipo().equals("agua");
	}
	
	private boolean esPlanta(TipoAlgomon tipoAlgomon){
		
		return tipoAlgomon.tipo().equals("planta");
	}
	
	public double danioPorTipo(TipoAlgomon otro){
		
		if(this.esFuego(otro))
			return this.danioContraFuego;
		
		if(this.esAgua(otro))
			return this.danioContraAgua;
		
		if(this.esPlanta(otro))
			return this.danioContraPlanta;
			
		return this.danioContraNormal;
	
	}

}
