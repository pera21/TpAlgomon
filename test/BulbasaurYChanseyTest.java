package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class BulbasaurYChanseyTest {

	@Test
	public void test01() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		
		bulbasaur.atacar(squirtle, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(120,squirtle.vida());
		
		chansey.atacar(squirtle, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(90,squirtle.vida());
	}
	
	@Test
	public void test02() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		
		bulbasaur.atacar(charmander, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(162,charmander.vida());
		
		chansey.atacar(charmander, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(154,charmander.vida());
	}
	
	@Test
	public void test03() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon rattata = Especie.RATTATA.crear();
		
		bulbasaur.atacar(rattata, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(155,rattata.vida());
		
		chansey.atacar(rattata, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(140,rattata.vida());
	}
	
	@Test
	public void test04() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon jigglypuff = Especie.JIGGLYPUFF.crear();
		
		bulbasaur.atacar(jigglypuff, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(115,jigglypuff.vida());
		
		chansey.atacar(jigglypuff, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(100,jigglypuff.vida());
	}
	
	@Test
	public void test05() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon chansey2 = Especie.CHANSEY.crear();
		
		bulbasaur.atacar(chansey2, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(115,chansey2.vida());
		
		chansey.atacar(chansey2, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(100,chansey2.vida());
	}

}
