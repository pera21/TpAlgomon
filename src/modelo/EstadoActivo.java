package modelo;

public class EstadoActivo implements EstadoEfimero{

	@Override
	public void aplicarEfecto(Algomon algomon) throws estaDormido {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atacar(Algomon atacante, Algomon oponente, Poder ataque) {
		try{
			ataque.atacar(atacante, oponente);
			ataque.reducirCantidadAtaque();
			atacante.estadoPersistente().aplicarEfectoEstado(atacante);
		}catch (AtaquesAgotados exception) {
			exception.getMessage();
		}
		
	}

}
