package modelo;

//import java.util.ArrayList;
import java.util.EnumMap;

public enum Especie {
	CHARMANDER{
		public Algomon crear(){
			Poder brasas = Ataque.BRASAS.crear();
			Poder fogonazo = Ataque.FOGONAZO.crear();
			Poder ataqueRapido = Ataque.ATAQUE_RAPIDO.crear();
			NombreAlgomon nombre = new NombreAlgomon("Charmander");
			Vida vida = new Vida(170);
			TipoAlgomon tipo = new TipoAlgomon("fuego");
			EnumMap<NombreAtaque, Poder> ataques = new EnumMap<NombreAtaque, Poder>(NombreAtaque.class);
			/*ArrayList<Poder> poderes = new ArrayList<Poder>();
			poderes.add(brasas);
			poderes.add(fogonazo);
			poderes.add(ataqueRapido);*/
			ataques.put(NombreAtaque.BRASAS, brasas);
			ataques.put(NombreAtaque.FOGONAZO, fogonazo);
			ataques.put(NombreAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	SQUIRTLE{
		public Algomon crear(){
			Poder burbuja = Ataque.BURBUJA.crear();
			Poder canion = Ataque.CANION_DE_AGUA.crear();
			Poder ataqueRapido = Ataque.ATAQUE_RAPIDO.crear();
			NombreAlgomon nombre = new NombreAlgomon("Squirtle");
			Vida vida = new Vida(150);
			TipoAlgomon tipo = new TipoAlgomon("agua");
			EnumMap<NombreAtaque, Poder> ataques = new EnumMap<NombreAtaque, Poder>(NombreAtaque.class);
			/*ArrayList<Poder> poderes = new ArrayList<Poder>();
			poderes.add(burbuja);
			poderes.add(canion);
			poderes.add(ataqueRapido);*/
			ataques.put(NombreAtaque.BURBUJA, burbuja);
			ataques.put(NombreAtaque.CANION_DE_AGUA, canion);
			ataques.put(NombreAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	BULBASAUR{
		public Algomon crear(){
			Poder chupavidas = Ataque.CHUPAVIDAS.crear();
			Poder latigo = Ataque.LATIGO_CEPA.crear();
			Poder ataqueRapido = Ataque.ATAQUE_RAPIDO.crear();
			NombreAlgomon nombre = new NombreAlgomon("Bulbasaur");
			Vida vida = new Vida(140);
			TipoAlgomon tipo = new TipoAlgomon("planta");
			EnumMap<NombreAtaque, Poder> ataques = new EnumMap<NombreAtaque, Poder>(NombreAtaque.class);
			/*ArrayList<Poder> poderes = new ArrayList<Poder>();
			poderes.add(chupavidas);
			poderes.add(latigo);
			poderes.add(ataqueRapido);*/
			ataques.put(NombreAtaque.CHUPAVIDAS, chupavidas);
			ataques.put(NombreAtaque.LATIGO_CEPA, latigo);
			ataques.put(NombreAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	JIGGLYPUFF{
		public Algomon crear(){
			Poder canto = Ataque.CANTO.crear();
			Poder burbuja = Ataque.BURBUJA.crear();
			Poder ataqueRapido = Ataque.ATAQUE_RAPIDO.crear();
			NombreAlgomon nombre = new NombreAlgomon("Jigglypuff");
			Vida vida = new Vida(130);
			TipoAlgomon tipo = new TipoAlgomon("normal");
			EnumMap<NombreAtaque, Poder> ataques = new EnumMap<NombreAtaque, Poder>(NombreAtaque.class);
			/*ArrayList<Poder> poderes = new ArrayList<Poder>();
			poderes.add(canto);
			poderes.add(burbuja);
			poderes.add(ataqueRapido);*/
			ataques.put(NombreAtaque.CANTO, canto);
			ataques.put(NombreAtaque.BURBUJA, burbuja);
			ataques.put(NombreAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	},
	CHANSEY{
		public Algomon crear(){
			Poder canto = Ataque.CANTO.crear();
			Poder latigo = Ataque.LATIGO_CEPA.crear();
			Poder ataqueRapido = Ataque.ATAQUE_RAPIDO.crear();
			NombreAlgomon nombre = new NombreAlgomon("Chansey");
			Vida vida = new Vida(130);
			TipoAlgomon tipo = new TipoAlgomon("normal");
			EnumMap<NombreAtaque, Poder> ataques = new EnumMap<NombreAtaque, Poder>(NombreAtaque.class);
			/*ArrayList<Poder> poderes = new ArrayList<Poder>();
			poderes.add(canto);
			poderes.add(latigo);
			poderes.add(ataqueRapido);*/
			ataques.put(NombreAtaque.CANTO, canto);
			ataques.put(NombreAtaque.LATIGO_CEPA, latigo);
			ataques.put(NombreAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			return new Algomon(nombre,tipo, vida, ataques);
		}
	},
	RATTATA{
		public Algomon crear(){
			Poder fogonazo = Ataque.FOGONAZO.crear();
			Poder burbuja = Ataque.BURBUJA.crear();
			Poder ataqueRapido = Ataque.ATAQUE_RAPIDO.crear();
			NombreAlgomon nombre = new NombreAlgomon("Rattata");
			Vida vida = new Vida(170);
			TipoAlgomon tipo = new TipoAlgomon("normal");
			EnumMap<NombreAtaque, Poder> ataques = new EnumMap<NombreAtaque, Poder>(NombreAtaque.class);
			/*ArrayList<Poder> poderes = new ArrayList<Poder>();
			poderes.add(fogonazo);
			poderes.add(burbuja);
			poderes.add(ataqueRapido);*/
			ataques.put(NombreAtaque.FOGONAZO, fogonazo);
			ataques.put(NombreAtaque.BURBUJA, burbuja);
			ataques.put(NombreAtaque.ATAQUE_RAPIDO, ataqueRapido);
			
			return new Algomon(nombre, tipo, vida, ataques);
		}
	};
	
	
	public abstract Algomon crear();

}