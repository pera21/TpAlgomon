package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class testBulbasaurAtaquesSimples {

	
////////////////------------ ATAQUES BULBASAUR CON LATIGO CEPA ------------////////////////
	
	@Test
	public void testBulbasaurAtacaABulbasaurConLatigoCepa() {
		Algomon bulbasaur1 = Especie.BULBASAUR.crear();
		Algomon bulbasaur2 = Especie.BULBASAUR.crear();
		bulbasaur1.atacar(bulbasaur2,NombreAtaque.LATIGO_CEPA);
		assertEquals(132,bulbasaur2.vida());
	}
	
	@Test
	public void testBulbasaurAtacaACharmanderConLatigoCepa() {
		Algomon bulbasaur1 = Especie.BULBASAUR.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		bulbasaur1.atacar(charmander,NombreAtaque.LATIGO_CEPA);
		assertEquals(162,charmander.vida());
	}
	
	@Test
	public void testBulbasaurAtacaASquirtleConLatigoCepa() {
		Algomon bulbasaur1 = Especie.BULBASAUR.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		bulbasaur1.atacar(squirtle,NombreAtaque.LATIGO_CEPA);
		assertEquals(120,squirtle.vida());
	}
	
	@Test
	public void testBulbasaurAtacaAChanseyConLatigoCepa() {
		Algomon bulbasaur1 = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		bulbasaur1.atacar(chansey,NombreAtaque.LATIGO_CEPA);
		assertEquals(115,chansey.vida());
	}
	
	@Test
	public void testBulbasaurAtacaARattataConLatigoCepa() {
		Algomon bulbasaur1 = Especie.BULBASAUR.crear();
		Algomon rattata = Especie.RATTATA.crear();
		bulbasaur1.atacar(rattata,NombreAtaque.LATIGO_CEPA);
		assertEquals(155,rattata.vida());
	}

	@Test
	public void testBulbasaurAtacaAJigglypuffConLatigoCepa() {
		Algomon bulbasaur1 = Especie.BULBASAUR.crear();
		Algomon jigglypuff = Especie.JIGGLYPUFF.crear();
		bulbasaur1.atacar(jigglypuff,NombreAtaque.LATIGO_CEPA);
		assertEquals(115,jigglypuff.vida());
	}
}
