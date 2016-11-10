package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class testsJigglypuffAtaquesSimples {

////////////////------------ ATAQUES JIGGLYPUFF CON BURBUJA ------------////////////////
	
	@Test
	public void testJigglypuffAtacaAJigglypuffConBurbuja() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.JIGGLYPUFF.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.BURBUJA);
		assertEquals(120,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaACharmanderConBurbuja() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.CHARMANDER.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.BURBUJA);
		assertEquals(150,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaASquirtleConBurbuja() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.SQUIRTLE.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.BURBUJA);
		assertEquals(145,jigglypuff2.vida());
	}

	@Test
	public void testJigglypuffAtacaABulbasaurConBurbuja() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.BULBASAUR.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.BURBUJA);
		assertEquals(135,jigglypuff2.vida());
	}

	@Test
	public void testJigglypuffAtacaAChanseyConBurbuja() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.CHANSEY.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.BURBUJA);
		assertEquals(120,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaARattataConBurbuja() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.RATTATA.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.BURBUJA);
		assertEquals(160,jigglypuff2.vida());
	}
	
////////////////------------ ATAQUES JIGGLYPUFF CON ATAQUE RAPIDO ------------////////////////

	@Test
	public void testJigglypuffAtacaAJigglypuffConAtaqueRapido() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.JIGGLYPUFF.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(120,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaACharmanderConAtaqueRapido() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.CHARMANDER.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(160,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaASquirtleConAtaqueRapido() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.SQUIRTLE.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(140,jigglypuff2.vida());
	}

	@Test
	public void testJigglypuffAtacaABulbasaurConAtaqueRapido() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.BULBASAUR.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(130,jigglypuff2.vida());
	}

	@Test
	public void testJigglypuffAtacaAChanseyConAtaqueRapido() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.CHANSEY.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(120,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaARattataConAtaqueRapido() {
		Algomon jigglypuff1 = Especie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = Especie.RATTATA.crear();
		jigglypuff1.atacar(jigglypuff2,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(160,jigglypuff2.vida());
	}
}
