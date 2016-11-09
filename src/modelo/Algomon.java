package modelo;

import java.util.ArrayList;
import modelo.Ataque;
import java.util.EnumMap;

public class Algomon implements Atacar {
	private NombreAlgomon nombre;
	private TipoAlgomon tipo;
	private Vida vida;
	private EnumMap<NombreAtaque, Poder> poderes;
	
	public Algomon(NombreAlgomon nombre, TipoAlgomon tipo, Vida vida, EnumMap<NombreAtaque, Poder> poderes){
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.poderes = poderes;
	}

	@Override
	public void atacar(Algomon oponente, NombreAtaque ataque) {
		// buscar ataque en poderes y usar el de poderes
		Poder ataqueAlgomon = poderes.get(ataque);
		/*if(this.ataquesAgotados())
			throw new AtaquesAgotados();*/
		
		try{
			oponente.vida.reducirVida(ataqueAlgomon.getTipoAtaque().danioPorTipo(oponente.getTipo()) * ataqueAlgomon.getPotencia());
		}
		catch(AlgomonMuerto exception){
			System.out.println("El algomon que intentas atacar esta muerto");
		}
		
		ataqueAlgomon.reducirCantidadAtaque();
		
	}

	
	public TipoAlgomon getTipo(){
		return this.tipo;
	}
	
	private boolean ataquesAgotados() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int getVida(){
		return this.vida.obtenerVida();
	}

}
