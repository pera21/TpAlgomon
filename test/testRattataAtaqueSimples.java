package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class testRattataAtaqueSimples {
	
////////////////------------ ATAQUES RATTATA CON BURBUJA ------------////////////////

	@Test
	public void testRattataAtacaARattataConBurbuja() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon rattata2 = Especie.RATTATA.crear();
		rattata1.atacar(rattata2,NombreAtaque.BURBUJA);
		assertEquals(160,rattata2.vida());
	}
	
	@Test
	public void testRattataAtacaACharmanderConBurbuja() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		rattata1.atacar(charmander,NombreAtaque.BURBUJA);
		assertEquals(150,charmander.vida());
	}
	
	@Test
	public void testRattataAtacaSquirtleConBurbuja() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		rattata1.atacar(squirtle,NombreAtaque.BURBUJA);
		assertEquals(145,squirtle.vida());
	}
	
	@Test
	public void testRattataAtacaAChanseyConBurbuja() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		rattata1.atacar(chansey,NombreAtaque.BURBUJA);
		assertEquals(120,chansey.vida());
	}
	
	@Test
	public void testRattataAtacaAJugglypuffConBurbuja() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon jugglypuff = Especie.JIGGLYPUFF.crear();
		rattata1.atacar(jugglypuff,NombreAtaque.BURBUJA);
		assertEquals(120,jugglypuff.vida());
	}
	
	@Test
	public void testRattataAtacaABulbasaurConBurbuja() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		rattata1.atacar(bulbasaur,NombreAtaque.BURBUJA);
		assertEquals(135,bulbasaur.vida());
	}
	
////////////////------------ ATAQUES RATTATA CON ATAQUE RAPIDO ------------////////////////	
	
	
	@Test
	public void testRattataAtacaARattataConAtaqueRapido() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon rattata2 = Especie.RATTATA.crear();
		rattata1.atacar(rattata2,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(160,rattata2.vida());
	}
	
	@Test
	public void testRattataAtacaACharmanderConAtaqueRapido() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		rattata1.atacar(charmander,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(160,charmander.vida());
	}
	
	@Test
	public void testRattataAtacaSquirtleConAtaqueRapido() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		rattata1.atacar(squirtle,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(140,squirtle.vida());
	}
	
	@Test
	public void testRattataAtacaAChanseyConAtaqueRapido() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		rattata1.atacar(chansey,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(120,chansey.vida());
	}
	
	@Test
	public void testRattataAtacaAJugglypuffConAtaqueRapido() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon jugglypuff = Especie.JIGGLYPUFF.crear();
		rattata1.atacar(jugglypuff,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(120,jugglypuff.vida());
	}
	
	@Test
	public void testRattataAtacaABulbasaurConAtaqueRapido() {
		Algomon rattata1 = Especie.RATTATA.crear();
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		rattata1.atacar(bulbasaur,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(130,bulbasaur.vida());
	}

}
