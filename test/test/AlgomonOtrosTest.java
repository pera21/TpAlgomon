package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class AlgomonOtrosTest {

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
	
////////////////------------ ATAQUES CHANSEY CON LATIGO CEPA ------------////////////////
	
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
		
////////////////------------ ATAQUES CHANSEY CON ATAQUE RAPIDO ------------////////////////
		
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
