package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class AlgomonTest {

	@Test
	public void test01AtaqueFuegoContraNormal(){
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon charman = Especie.CHARMANDER.crear();
		charmander.atacar(charman, NombreAtaque.BRASAS);
		assertEquals(162, charman.vida());
	}

	@Test
	public void testSquirtleAtacaCharmander(){
		Algomon squirtle = Especie.SQUIRTLE.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		squirtle.atacar(charmander, NombreAtaque.BURBUJA);
		assertEquals(150, charmander.vida());
		squirtle.atacar(charmander, NombreAtaque.CANION_DE_AGUA);
		assertEquals(110, charmander.vida());
	}
	
	@Test
	public void testSquirtleAtacaBulbasaurConBurbujaYCanion(){
		Algomon squirtle = Especie.SQUIRTLE.crear();
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		squirtle.atacar(bulbasaur, NombreAtaque.BURBUJA);
		assertEquals(135, bulbasaur.vida());
		squirtle.atacar(bulbasaur, NombreAtaque.CANION_DE_AGUA);
		assertEquals(125, bulbasaur.vida());
	}
	
	@Test
	public void testSquirtleAtacaJigglypuffConBurbujaYCanion(){
		Algomon squirtle = Especie.SQUIRTLE.crear();
		Algomon jigglypuf = Especie.JIGGLYPUFF.crear();
		squirtle.atacar(jigglypuf, NombreAtaque.BURBUJA);
		assertEquals(120, jigglypuf.vida());
		squirtle.atacar(jigglypuf, NombreAtaque.CANION_DE_AGUA);
		assertEquals(100, jigglypuf.vida());
	}
	
	@Test
	public void testSquirtleAtacaRattataConBurbujaYCanion(){
		Algomon squirtle = Especie.SQUIRTLE.crear();
		Algomon rattata = Especie.RATTATA.crear();
		squirtle.atacar(rattata, NombreAtaque.BURBUJA);
		assertEquals(160, rattata.vida());
		squirtle.atacar(rattata, NombreAtaque.CANION_DE_AGUA);
		assertEquals(140, rattata.vida());
	}
	
	@Test
	public void testSquirtleAtacaChanseyYRattataConBurbujaYCanion(){
		Algomon squirtle = Especie.SQUIRTLE.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon rattata = Especie.RATTATA.crear();
		squirtle.atacar(chansey, NombreAtaque.BURBUJA);
		assertEquals(120, chansey.vida());
		squirtle.atacar(chansey, NombreAtaque.CANION_DE_AGUA);
		assertEquals(100, chansey.vida());
		squirtle.atacar(rattata, NombreAtaque.BURBUJA);
		assertEquals(160, rattata.vida());
		squirtle.atacar(rattata, NombreAtaque.CANION_DE_AGUA);
		assertEquals(140, rattata.vida());
	}
	
	@Test
	public void asd(){
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		charmander.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(140, squirtle.vida());
	}

	@Test
	public void AlgomonAgotaCantidadDisponibleDeAtaques(){
			Algomon charmander = Especie.CHARMANDER.crear();
			Algomon squirtle = Especie.SQUIRTLE.crear();
			Algomon rattata = Especie.RATTATA.crear();
			charmander.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
			assertEquals(0, charmander.getAtaquesRestantes(NombreAtaque.ATAQUE_RAPIDO));
	}
}
