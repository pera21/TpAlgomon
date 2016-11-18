package modelo;

import java.util.EnumMap;

public class Algomon implements Atacar {
	private NombreAlgomon nombre;
	private TipoElemento tipo;
	private Vida vida;
	private EstadoPersistente estadoPersistente;
	private EstadoEfimero estadoEfimero;
	private EnumMap<FabricaAtaque, Poder> poderes;
	
	public Algomon(NombreAlgomon nombre, TipoElemento tipo, Vida vida, EnumMap<FabricaAtaque, Poder> poderes){
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.poderes = poderes;
		this.estadoPersistente = new EstadoNormal();
		this.estadoEfimero = new EstadoActivo();
	}

	@Override
	public void atacar(Algomon oponente, FabricaAtaque ataque) {
		Poder ataqueAlgomon = this.poderes.get(ataque);
		this.estadoEfimero.atacar(this, oponente, ataqueAlgomon);		
	}
	
	public int vida(){
		return this.vida.getVida();
	}
	
	public Vida getVida(){
		return this.vida;
	}
	
	public TipoElemento getTipo(){
		return this.tipo;
	}

	public int getAtaquesRestantes(FabricaAtaque ataque){
		Poder ataqueAlgomon = this.poderes.get(ataque);
		return ataqueAlgomon.getCantidad();
		
	}
	
	public void estadoQuemado(){
		this.estadoPersistente = new EstadoQuemado();
	}
	
	public void estadoDormido(){
		this.estadoEfimero = new EstadoDormido();
	}
	
	public EstadoPersistente estadoPersistente(){
		return this.estadoPersistente;
	}
	
	public EstadoEfimero estadoEfimero(){
		return this.estadoEfimero;
	}

	public void estadoActivo() {
		this.estadoEfimero = new EstadoActivo();
		
	}

}
