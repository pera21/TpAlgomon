package test;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class testsCharmandarAtaquesSimples {

////////////////------------ ATAQUES CHARMANDER CON BRASAS ------------////////////////
	
	@Test
	public void testCharmanderAtacaACharmanderConBrasas() {
		Algomon charmander1 = Especie.CHARMANDER.crear();
		Algomon charmander2 = Especie.CHARMANDER.crear();
		charmander1.atacar(charmander2,NombreAtaque.BRASAS);
		assertEquals(162,charmander2.vida());
	}
	
	@Test
	public void testCharmanderAtacaASquirtleConBrasas() {
		Algomon charmander1 = Especie.CHARMANDER.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		charmander1.atacar(squirtle, NombreAtaque.BRASAS);
		assertEquals(142,squirtle.vida());
	}
	
	@Test
	public void testCharmanderAtacaABulbasaurConBrasas() {
		Algomon charmander1 = Especie.CHARMANDER.crear();
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		charmander1.atacar(bulbasaur,NombreAtaque.BRASAS);
		assertEquals(108,bulbasaur.vida());
	}
	
	@Test
	public void testCharmanderAtacaAChanseyConBrasas() {
		Algomon charmander1 = Especie.CHARMANDER.crear();
		Algomon Chansey = Especie.CHANSEY.crear();
		charmander1.atacar(Chansey,NombreAtaque.BRASAS);
		assertEquals(114,Chansey.vida());
	}
	
	@Test
	public void testCharmanderAtacaARattataConBrasas() {
		Algomon charmander1 = Especie.CHARMANDER.crear();
		Algomon Rattata = Especie.RATTATA.crear();
		charmander1.atacar(Rattata,NombreAtaque.BRASAS);
		assertEquals(154,Rattata.vida());
	}
	
	@Test
	public void testCharmanderAtacaAJigglypuffConBrasas() {
		Algomon charmander1 = Especie.CHARMANDER.crear();
		Algomon Jigglypuff = Especie.JIGGLYPUFF.crear();
		charmander1.atacar(Jigglypuff,NombreAtaque.BRASAS);
		assertEquals(114,Jigglypuff.vida());
	}
	
////////////////------------ ATAQUES CHARMANDER CON ATAQUE RAPIDO ------------////////////////	
	
	@Test
	public void testCharmanderAtacaACharmanderConAtaqueRapido() {
		Algomon charmander1 = Especie.CHARMANDER.crear();
		Algomon charmander2 = Especie.CHARMANDER.crear();
		charmander1.atacar(charmander2,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(160,charmander2.vida());
	}
	
	@Test
	public void testCharmanderAtacaASquirtleConAtaqueRapido() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		charmander.atacar(squirtle,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(140,squirtle.vida());
	}
	
	@Test
	public void testCharmanderAtacaABulbasaurConAtaqueRapido() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		charmander.atacar(bulbasaur,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(130,bulbasaur.vida());
	}
	
	@Test
	public void testCharmanderAtacaAJigglypuffConAtaqueRapido() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon jigglypuff = Especie.JIGGLYPUFF.crear();
		charmander.atacar(jigglypuff,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(120,jigglypuff.vida());
	}
	
	@Test
	public void testCharmanderAtacaAChanseyConAtaqueRapido() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		charmander.atacar(chansey,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(120,chansey.vida());
	}
	
	@Test
	public void testCharmanderAtacaARattataConAtaqueRapido() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon rattata = Especie.RATTATA.crear();
		charmander.atacar(rattata,NombreAtaque.ATAQUE_RAPIDO);
		assertEquals(160,rattata.vida());
	}
}
