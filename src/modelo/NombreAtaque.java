package modelo;

public enum NombreAtaque {
	ATAQUE_RAPIDO("Ataque rápido"),
	CANTO("Canto"),
	BURBUJA("Burbuja"),
	CANION_DE_AGUA("Cañon de agua"),
	CHUPAVIDAS("Chupavidas"),
	LATIGO_CEPA("Látigo cepa"),
	BRASAS("Brasas"),  
	FOGONAZO("fogonazo");
	
	private String nombre;
	
	private NombreAtaque(String nombreAtaque){
		
		this.nombre = nombreAtaque;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
