package modelo;

import java.util.EnumMap;

public class Algomon implements Atacar {
	private NombreAlgomon nombre;
	private TipoAlgomon tipo;
	private Vida vida;
	//private EstadoAlgomon estado;
	private EstadoPersistente estadoPersistente;
	private EstadoEfimero estadoEfimero;
	private EnumMap<NombreAtaque, Poder> poderes;
	
	public Algomon(NombreAlgomon nombre, TipoAlgomon tipo, Vida vida, EnumMap<NombreAtaque, Poder> poderes){
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.poderes = poderes;
		this.estadoPersistente = new EstadoNormal();
		this.estadoEfimero = null;
		//this.estado = new EstadoNormal;
	}

	@Override
	public void atacar(Algomon oponente, NombreAtaque ataque) {
		Poder ataqueAlgomon = this.poderes.get(ataque);
		//double danio = ataqueAlgomon.getTipoAtaque().danioPorTipo(oponente.getTipo()) * ataqueAlgomon.getPotencia();
		ataqueAlgomon.atacar(this, oponente);
		//oponente.vida.reducirVida(danio);
		//oponente.estado.aplicarEfectoDeAtaque(ataqueAlgomon); --> para esto dividimos los ataques en: AtaqueNormal, Canto, Chupavidas y Fogonazo
		//ataqueAlgomon.aplicarEfecto(oponente)   --> otra posibilidad
		estadoPersistente.aplicarEfectoEstado(this);
		try{
			ataqueAlgomon.reducirCantidadAtaque();
		} catch (AtaquesAgotados exception) {
			exception.getMessage();
		}
		
	}

	public int vida(){
		return this.vida.getVida();
	}
	
	public Vida getVida(){
		return this.vida;
	}
	
	public TipoAlgomon getTipo(){
		return this.tipo;
	}

	public int getAtaquesRestantes(NombreAtaque ataque){
		Poder ataqueAlgomon = this.poderes.get(ataque);
		return ataqueAlgomon.getCantidad();
		
	}
	
	public void estadoQuemado(){
		this.estadoPersistente = new EstadoQuemado();
	}
	
	public EstadoPersistente estadoPersistente(){
		return this.estadoPersistente;
	}
	/*
	@Override
	public void aplicarEfectoDeAtaque(Poder ataqueAlgomon) {
		
	}*/

}
