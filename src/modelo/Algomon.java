package modelo;

import java.util.EnumMap;

public class Algomon implements Atacar {
	private NombreAlgomon nombre;
	private TipoAlgomon tipo;
	private Vida vida;
	//private EstadoAlgomon estado;
	private Persistente persistente;
	private Efimero efimero;
	private EnumMap<NombreAtaque, Poder> poderes;
	
	public Algomon(NombreAlgomon nombre, TipoAlgomon tipo, Vida vida, EnumMap<NombreAtaque, Poder> poderes){
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.poderes = poderes;
		this.persistente = new EstadoNormal();
		//this.estado = new EstadoNormal;
	}

	@Override
	public void atacar(Algomon oponente, NombreAtaque ataque) {
		Poder ataqueAlgomon = poderes.get(ataque);
		oponente.vida.reducirVida(ataqueAlgomon.getTipoAtaque().danioPorTipo(oponente.getTipo()) * ataqueAlgomon.getPotencia());
		//oponente.estado.aplicarEfectoDeAtaque(ataqueAlgomon); --> para esto dividimos los ataques en: AtaqueNormal, Canto, Chupavidas y Fogonazo
		// ataqueAlgomon.aplicarEfecto(oponente)   --> otra posibilidad
		try{
			ataqueAlgomon.reducirCantidadAtaque();
		} catch (AtaquesAgotados exception) {
			exception.getMessage();
		}
		
	}

	public int vida(){
		return this.vida.getVida();
	}
	
	public TipoAlgomon getTipo(){
		return this.tipo;
	}

	public int getAtaquesRestantes(NombreAtaque ataque){
		Poder ataqueAlgomon = this.poderes.get(ataque);
		return ataqueAlgomon.getCantidad();
		
	}
	/*
	@Override
	public void aplicarEfectoDeAtaque(Poder ataqueAlgomon) {
		
	}*/

}
