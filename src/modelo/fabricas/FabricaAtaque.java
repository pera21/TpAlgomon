package modelo.fabricas;

import modelo.ataques.ComportamientoAtaqueCanto;
import modelo.ataques.ComportamientoAtaqueChupavida;
import modelo.ataques.ComportamientoAtaqueFogonazo;
import modelo.ataques.ComportamientoAtaqueSimple;
import modelo.ataques.Poder;
import modelo.elementos.TipoElemento;

public enum FabricaAtaque {
	ATAQUE_RAPIDO{
		public ComportamientoAtaqueSimple crear(){
			ComportamientoAtaqueSimple ataque = new ComportamientoAtaqueSimple(10, 16, TipoElemento.NORMAL);
			return ataque;
		}
	},
	CANTO{
		public ComportamientoAtaqueCanto crear(){
			ComportamientoAtaqueCanto canto = new ComportamientoAtaqueCanto(0, 6, TipoElemento.NORMAL);
			return canto;
		}
	},
	BURBUJA{
		public ComportamientoAtaqueSimple crear(){
			ComportamientoAtaqueSimple ataque = new ComportamientoAtaqueSimple(10, 15, TipoElemento.AGUA);
			return ataque;
		}
	},
	CANION_DE_AGUA{
		public ComportamientoAtaqueSimple crear(){
			ComportamientoAtaqueSimple ataque = new ComportamientoAtaqueSimple(20, 8, TipoElemento.AGUA);
			return ataque;
		}	
	},
	CHUPAVIDAS{
		public ComportamientoAtaqueChupavida crear(){
			ComportamientoAtaqueChupavida ataque = new ComportamientoAtaqueChupavida(15, 8, TipoElemento.PLANTA);
			return ataque;
		}
	},
	LATIGO_CEPA{
		public ComportamientoAtaqueSimple crear(){
			ComportamientoAtaqueSimple ataque = new ComportamientoAtaqueSimple(15, 10, TipoElemento.PLANTA);
			return ataque;
		}
	},
	BRASAS{
		public ComportamientoAtaqueSimple crear(){
			ComportamientoAtaqueSimple ataque = new ComportamientoAtaqueSimple(16, 10, TipoElemento.FUEGO);
			return ataque;
		}
	},
	FOGONAZO{
		public ComportamientoAtaqueFogonazo crear(){
			ComportamientoAtaqueFogonazo ataque = new ComportamientoAtaqueFogonazo(2, 4, TipoElemento.FUEGO);
			return ataque;
		}
	};
	
	public abstract Poder crear();
}
