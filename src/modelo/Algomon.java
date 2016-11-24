package modelo;

import java.util.EnumMap;

public class Algomon implements Atacar {
	private NombreAlgomon nombre;
	private TipoElemento tipo;
	private Vida vida;
	private EstadoAlgomon estadoAlgomon;
	private EstadoPersistente estadoPersistente;
	private EstadoEfimero estadoEfimero;
	private EnumMap<FabricaAtaque, Poder> poderes;
	
	public Algomon(NombreAlgomon nombre, TipoElemento tipo, Vida vida, EnumMap<FabricaAtaque, Poder> poderes){
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
		this.poderes = poderes;
		this.estadoAlgomon = new EstadoActivoAlgomon();
		this.estadoPersistente = new EstadoNormalPersistente();
		this.estadoEfimero = new EstadoNormalEfimero();
	}

	@Override
	public void atacar(Algomon oponente, FabricaAtaque ataque) {
		Poder ataqueAlgomon = this.poderes.get(ataque);
		this.estadoAlgomon.atacar(this, oponente, ataqueAlgomon);		
	}
	
	public int vida(){
		return this.vida.getVida();
	}
	
	public Vida getVida(){
		return this.vida;
	}
	
	public EnumMap<FabricaAtaque, Poder> getPoderes(){
		return this.poderes;
	}
	
	public TipoElemento getTipo(){
		return this.tipo;
	}
	
	public Poder getAtaque(FabricaAtaque ataque){
		return this.poderes.get(ataque);
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
	
	public void estadoActivo() {
		this.estadoAlgomon = new EstadoActivoAlgomon();
		
	}
	
	public void estadoNormalEfimero() {
		this.estadoEfimero = new EstadoNormalEfimero();
		
	}
	
	public void estadoNormalPersistente() {
		this.estadoPersistente = new EstadoNormalPersistente();
		
	}
	
	public EstadoPersistente estadoPersistente(){
		return this.estadoPersistente;
	}
	
	public EstadoEfimero estadoEfimero(){
		return this.estadoEfimero;
	}
	
	public EstadoAlgomon estadoAlgomon(){
		return this.estadoAlgomon;
	}

}
