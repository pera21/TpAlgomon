package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class TestChanseyAtaqueSimple {

	// ATAQUE CHANSEY CON LATIGO CEPA //
	
	@Test
	public void testChanseyAtacaACharmanderConLatigoCepa() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		
		chansey.atacar(charmander, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(162,charmander.vida());
	}
	
	@Test
	public void testChanseyAtacaASquirtleConLatigoCepa() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		
		chansey.atacar(squirtle, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(120,squirtle.vida());
	}
	
	@Test
	public void testChanseyAtacaABulbasaurConLatigoCepa() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		
		chansey.atacar(bulbasaur, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(132,bulbasaur.vida());
	}
	
	@Test
	public void testChanseyAtacaAJigglypuffConLatigoCepa() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon jigglypuff = Especie.JIGGLYPUFF.crear();
		
		chansey.atacar(jigglypuff, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(115,jigglypuff.vida());
	}
	
	@Test
	public void testChanseyAtacaARattataConLatigoCepa() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon rattata = Especie.RATTATA.crear();
		
		chansey.atacar(rattata, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(155,rattata.vida());
	}
	
	@Test
	public void testChanseyAtacaAChanseyConLatigoCepa() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon chansey2 = Especie.CHANSEY.crear();
		
		chansey.atacar(chansey2, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(115,chansey2.vida());
	}
	
	// ATAQUE CHANSEY CON ATAQUE RAPIDO //
	
	@Test
	public void testChanseyAtacaACharmanderConAtaqueRapido() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		
		chansey.atacar(charmander, NombreAtaque.ATAQUE_RAPIDO);
		
		assertEquals(160,charmander.vida());
	}
	
	@Test
	public void testChanseyAtacaASquirtleConAtaqueRapido() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		
		chansey.atacar(squirtle, NombreAtaque.ATAQUE_RAPIDO);
		
		assertEquals(140,squirtle.vida());
	}
	
	@Test
	public void testChanseyAtacaABulbasaurConAtaqueRapido() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		
		chansey.atacar(bulbasaur, NombreAtaque.ATAQUE_RAPIDO);
		
		assertEquals(130,bulbasaur.vida());
	}
	
	@Test
	public void testChanseyAtacaARattataConAtaqueRapido() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon rattata = Especie.RATTATA.crear();
		
		chansey.atacar(rattata, NombreAtaque.ATAQUE_RAPIDO);
		
		assertEquals(160,rattata.vida());
	}
	
	@Test
	public void testChanseyAtacaAJigglypuffConAtaqueRapido() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon jigglypuff = Especie.JIGGLYPUFF.crear();
		
		chansey.atacar(jigglypuff, NombreAtaque.ATAQUE_RAPIDO);
		
		assertEquals(120,jigglypuff.vida());
	}
	
	@Test
	public void testChanseyAtacaAChanseyConAtaqueRapido() {
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon chansey2 = Especie.CHANSEY.crear();
		
		chansey.atacar(chansey2, NombreAtaque.ATAQUE_RAPIDO);
		
		assertEquals(120,chansey2.vida());
	}

}
