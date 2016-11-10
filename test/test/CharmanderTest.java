package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class CharmanderTest {

	@Test
	public void test01() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		
		charmander.atacar(bulbasaur, NombreAtaque.BRASAS);
		
		assertEquals(108,bulbasaur.vida());
	}
	
	@Test
	public void test02() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		
		charmander.atacar(squirtle, NombreAtaque.BRASAS);
		
		assertEquals(142,squirtle.vida());
	}
	
	@Test
	public void test03() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		
		charmander.atacar(chansey, NombreAtaque.BRASAS);
		
		assertEquals(114,chansey.vida());
	}
	
	@Test
	public void test04() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon rattata = Especie.RATTATA.crear();
		
		charmander.atacar(rattata, NombreAtaque.BRASAS);
		
		assertEquals(154,rattata.vida());
	}
	
	@Test
	public void test05() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon jigglypuff = Especie.JIGGLYPUFF.crear();
		
		charmander.atacar(jigglypuff, NombreAtaque.BRASAS);
		
		assertEquals(114,jigglypuff.vida());
	}

}
