package modelo;

public enum Ataque {
	ATAQUE_RAPIDO{
		public AtaqueSimple crear(){
			AtaqueSimple ataque = new AtaqueSimple(10, 16, TipoAtaque.NORMAL);
			return ataque;
		}
	},
	CANTO{
		public AtaqueSimple crear(){
			AtaqueSimple ataque = new AtaqueSimple(0, 6, TipoAtaque.NORMAL);
			return ataque;
			/*
			 * AtaqueCanto canto = new AtaqueCanto(0, 6, TipoAtaque.NORMAL);
			 * return canto;
			 */
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
		public AtaqueSimple crear(){
			AtaqueSimple ataque = new AtaqueSimple(15, 8, TipoAtaque.PLANTA);
			return ataque;
			/*
			 * Chupavidas chupavidas = new Chupavidas(15, 8, TipoAtaque.PLANTA);
			 * return chupavidas;
			 */
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
		public AtaqueSimple crear(){
			AtaqueSimple ataque = new AtaqueSimple(2, 4, TipoAtaque.FUEGO);
			return ataque;
			/*
			 * Fogonazo fogonazo = new Fogonazo(2, 4, TipoAtaque.FUEGO);
			 * return fogonazo;
			 */
		}
	};
	
	public abstract AtaqueSimple crear();
}
