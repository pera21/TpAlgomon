package modelo;

public enum Ataque {
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
}
