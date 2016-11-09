package modelo;

public enum Ataque {
	/*ATAQUE_RAPIDO("Ataque Rápido", 10, 16, TipoAtaque.NORMAL),
	CANTO("Canto", 0, 6, TipoAtaque.NORMAL),
	BURBUJA("Burbuja", 10, 15, TipoAtaque.AGUA),
	CANION_DE_AGUA("Canion de Agua", 20, 8, TipoAtaque.AGUA),
	CHUPAVIDAS("Chupavidas", 15, 8, TipoAtaque.PLANTA),
	LATIGO_CEPA("Látigo Cepa", 15, 10, TipoAtaque.PLANTA),
	BRASAS("Brasas", 16, 10, TipoAtaque.FUEGO),
	FOGONAZO("Fogonazo", 2, 4, TipoAtaque.FUEGO);
	
	private String nombre;
	private int potencia;
	private int cantidadOriginal;
	private int cantidadRestante;
	private TipoAtaque tipo;
	
	private Ataque(String nombre, int potencia, int cantidad, TipoAtaque ataque){
		this.nombre = nombre;
		this.potencia = potencia;
		this.cantidadOriginal = cantidad;
		this.cantidadRestante = cantidad;
		this.tipo = ataque;
	}*/
	ATAQUE_RAPIDO{
		public Poder crear(){
			Poder poder = new Poder(10, 16, TipoAtaque.NORMAL);
			return poder;
		}
	},
	CANTO{
		public Poder crear(){
			Poder poder = new Poder(0, 6, TipoAtaque.NORMAL);
			return poder;
		}
	},
	BURBUJA{
		public Poder crear(){
			Poder poder = new Poder(10, 15, TipoAtaque.AGUA);
			return poder;
		}	
	},
	CANION_DE_AGUA{
		public Poder crear(){
			Poder poder = new Poder(20, 8, TipoAtaque.AGUA);
			return poder;
		}	
	},
	CHUPAVIDAS{
		public Poder crear(){
			Poder poder = new Poder(15, 8, TipoAtaque.PLANTA);
			return poder;
		}	
	},
	LATIGO_CEPA{
		public Poder crear(){
			Poder poder = new Poder(15, 10, TipoAtaque.PLANTA);
			return poder;
		}	
	},
	BRASAS{
		public Poder crear(){
			Poder poder = new Poder(16, 10, TipoAtaque.FUEGO);
			return poder;
		}
	},
	FOGONAZO{
		public Poder crear(){
			Poder poder = new Poder(2, 4, TipoAtaque.FUEGO);
			return poder;
		}
	};
	
	public abstract Poder crear();
	/*public Poder crear(int potencia, int cantidad, TipoAtaque ataque){
		Poder poder = new Poder(potencia, cantidad, ataque);
		return poder;
	}*/
}
