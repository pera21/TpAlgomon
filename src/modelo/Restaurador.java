package modelo;

public class Restaurador implements Elemento {
	
	private int usos;
	
	public Restaurador(){
		this.usos = 3;
	}

	@Override
	public void aplicarEfecto(Algomon algomon) {
		algomon.estadoNormalEfimero();
		algomon.estadoNormalPersistente();
		this.usos -= 1;
	}
	
	public int usosRestantes(){
		return this.usos;
	}

}