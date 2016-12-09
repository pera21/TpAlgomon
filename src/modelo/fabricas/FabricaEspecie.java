package modelo.fabricas;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;

import modelo.algomon.Algomon;
import modelo.algomon.NombreAlgomon;
import modelo.algomon.Vida;
import modelo.ataques.Poder;
import modelo.elementos.TipoElemento;

public enum FabricaEspecie {
	CHARMANDER{
		public Algomon crear(){
			TipoElemento tipo = TipoElemento.FUEGO;
			NombreAlgomon nombre = new NombreAlgomon("Charmander");
			Vida vida = new Vida(170);
			EnumMap<FabricaAtaque, Poder> ataques = asignarPoderes(Arrays.asList(FabricaAtaque.BRASAS, FabricaAtaque.FOGONAZO, FabricaAtaque.ATAQUE_RAPIDO));
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	SQUIRTLE{
		public Algomon crear(){
			TipoElemento tipo = TipoElemento.AGUA;
			NombreAlgomon nombre = new NombreAlgomon("Squirtle");
			Vida vida = new Vida(150);
			EnumMap<FabricaAtaque, Poder> ataques = asignarPoderes(Arrays.asList(FabricaAtaque.BURBUJA, FabricaAtaque.CANION_DE_AGUA, FabricaAtaque.ATAQUE_RAPIDO));			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	BULBASAUR{
		public Algomon crear(){
			TipoElemento tipo = TipoElemento.PLANTA;
			NombreAlgomon nombre = new NombreAlgomon("Bulbasaur");
			Vida vida = new Vida(140);
			EnumMap<FabricaAtaque, Poder> ataques = asignarPoderes(Arrays.asList(FabricaAtaque.CHUPAVIDAS, FabricaAtaque.LATIGO_CEPA, FabricaAtaque.ATAQUE_RAPIDO));		
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	JIGGLYPUFF{
		public Algomon crear(){
			TipoElemento tipo = TipoElemento.NORMAL;
			NombreAlgomon nombre = new NombreAlgomon("Jigglypuff");
			Vida vida = new Vida(130);
			EnumMap<FabricaAtaque, Poder> ataques = asignarPoderes(Arrays.asList(FabricaAtaque.CANTO, FabricaAtaque.BURBUJA, FabricaAtaque.ATAQUE_RAPIDO));			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	CHANSEY{
		public Algomon crear(){
			TipoElemento tipo = TipoElemento.NORMAL;
			NombreAlgomon nombre = new NombreAlgomon("Chansey");
			Vida vida = new Vida(130);
			EnumMap<FabricaAtaque, Poder> ataques = asignarPoderes(Arrays.asList(FabricaAtaque.CANTO, FabricaAtaque.LATIGO_CEPA, FabricaAtaque.ATAQUE_RAPIDO));
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	RATTATA{
		public Algomon crear(){
			TipoElemento tipo = TipoElemento.NORMAL;
			NombreAlgomon nombre = new NombreAlgomon("Rattata");
			Vida vida = new Vida(170);
			EnumMap<FabricaAtaque, Poder> ataques = asignarPoderes(Arrays.asList(FabricaAtaque.FOGONAZO, FabricaAtaque.BURBUJA, FabricaAtaque.ATAQUE_RAPIDO));			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	};
	
	
	public abstract Algomon crear();
	
	public EnumMap<FabricaAtaque, Poder> asignarPoderes(List<FabricaAtaque> ataques){
		EnumMap<FabricaAtaque, Poder> listaAtaques  = new EnumMap<>(FabricaAtaque.class);
		for (FabricaAtaque a : ataques) {
			listaAtaques.put(a, a.crear());
		}
		return listaAtaques;
		
	}

}