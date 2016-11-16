package modelo;

public enum Ataque {
	ATAQUE_RAPIDO{
		public AtaqueSimple crear(){
			AtaqueSimple ataque = new AtaqueSimple(10, 16, TipoAtaque.NORMAL);
			return ataque;
		}
	},
	CANTO{
		public AtaqueCanto crear(){
			AtaqueCanto canto = new AtaqueCanto(0, 6, TipoAtaque.NORMAL);
			return canto;
		}
	},
	BURBUJA{
		public AtaqueSimple crear(){
			AtaqueSimple ataque = new AtaqueSimple(10, 15, TipoAtaque.AGUA);
			return ataque;
		}	
	},
	CANION_DE_AGUA{
		public AtaqueSimple crear(){
			AtaqueSimple ataque = new AtaqueSimple(20, 8, TipoAtaque.AGUA);
			return ataque;
		}	
	},
	CHUPAVIDAS{
		public AtaqueChupavida crear(){
			AtaqueChupavida ataque = new AtaqueChupavida(15, 8, TipoAtaque.PLANTA);
			return ataque;
		}	
	},
	LATIGO_CEPA{
		public AtaqueSimple crear(){
			AtaqueSimple ataque = new AtaqueSimple(15, 10, TipoAtaque.PLANTA);
			return ataque;
		}	
	},
	BRASAS{
		public AtaqueSimple crear(){
			AtaqueSimple ataque = new AtaqueSimple(16, 10, TipoAtaque.FUEGO);
			return ataque;
		}
	},
	FOGONAZO{
		public AtaqueFogonazo crear(){
			AtaqueFogonazo ataque = new AtaqueFogonazo(2, 4, TipoAtaque.FUEGO);
			return ataque;
		}
	};

	public abstract Poder crear();
}
