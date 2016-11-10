package modelo;

import java.util.EnumMap;

public enum Especie {
	CHARMANDER{
		public Algomon crear(){
			TipoAlgomon tipo = new TipoAlgomon("fuego");
			NombreAlgomon nombre = new NombreAlgomon("Charmander");
			Vida vida = new Vida(170);
			EnumMap<NombreAtaque, Poder> ataques = asignarPoderes("BRASAS", "FOGONAZO", "ATAQUE_RAPIDO");
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	SQUIRTLE{
		public Algomon crear(){
			TipoAlgomon tipo = new TipoAlgomon("agua");
			NombreAlgomon nombre = new NombreAlgomon("Squirtle");
			Vida vida = new Vida(150);
			EnumMap<NombreAtaque, Poder> ataques = asignarPoderes("BURBUJA", "CANION_DE_AGUA", "ATAQUE_RAPIDO");			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	BULBASAUR{
		public Algomon crear(){
			TipoAlgomon tipo = new TipoAlgomon("planta");
			NombreAlgomon nombre = new NombreAlgomon("Bulbasaur");
			Vida vida = new Vida(140);
			EnumMap<NombreAtaque, Poder> ataques = asignarPoderes("CHUPAVIDAS", "LATIGO_CEPA", "ATAQUE_RAPIDO");		
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	JIGGLYPUFF{
		public Algomon crear(){
			TipoAlgomon tipo = new TipoAlgomon("normal");
			NombreAlgomon nombre = new NombreAlgomon("Jigglypuff");
			Vida vida = new Vida(130);
			EnumMap<NombreAtaque, Poder> ataques = asignarPoderes("CANTO", "BURBUJA", "ATAQUE_RAPIDO");			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	CHANSEY{
		public Algomon crear(){
			TipoAlgomon tipo = new TipoAlgomon("normal");
			NombreAlgomon nombre = new NombreAlgomon("Chansey");
			Vida vida = new Vida(130);
			EnumMap<NombreAtaque, Poder> ataques = asignarPoderes("CANTO", "LATIGO_CEPA", "ATAQUE_RAPIDO");
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	RATTATA{
		public Algomon crear(){
			TipoAlgomon tipo = new TipoAlgomon("normal");
			NombreAlgomon nombre = new NombreAlgomon("Rattata");
			Vida vida = new Vida(170);
			EnumMap<NombreAtaque, Poder> ataques = asignarPoderes("FOGONAZO", "BURBUJA", "ATAQUE_RAPIDO");			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	};
	
	
	public abstract Algomon crear();
	
	public EnumMap<NombreAtaque, Poder> asignarPoderes(String poder1, String poder2, String poder3){
		Poder primero = Ataque.valueOf(poder1).crear();
		Poder segundo = Ataque.valueOf(poder2).crear();
		Poder tercero = Ataque.valueOf(poder3).crear();
		EnumMap<NombreAtaque, Poder> ataques = new EnumMap<NombreAtaque, Poder>(NombreAtaque.class);
		ataques.put(NombreAtaque.valueOf(poder1), primero);
		ataques.put(NombreAtaque.valueOf(poder2), segundo);
		ataques.put(NombreAtaque.valueOf(poder3), tercero);
		return ataques;
		
	}

}