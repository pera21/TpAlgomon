package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modelo.Algomon;
import modelo.FabricaEspecie;
import modelo.EstadoQuemado;
import modelo.FabricaAtaque;
import modelo.EstadoPersistente;

public class AlgomonOtrosTest {

////////////////------------ ATAQUES BULBASAUR CON LATIGO CEPA ------------////////////////
		
	@Test
	public void testBulbasaurAtacaABulbasaurConLatigoCepa() {
		Algomon bulbasaur1 = FabricaEspecie.BULBASAUR.crear();
		Algomon bulbasaur2 = FabricaEspecie.BULBASAUR.crear();
		bulbasaur1.atacar(bulbasaur2,FabricaAtaque.LATIGO_CEPA);
		assertEquals(132,bulbasaur2.vida());
	}
	
	@Test
	public void testBulbasaurAtacaACharmanderConLatigoCepa() {
		Algomon bulbasaur1 = FabricaEspecie.BULBASAUR.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		bulbasaur1.atacar(charmander,FabricaAtaque.LATIGO_CEPA);
		assertEquals(162,charmander.vida());
	}
	
	@Test
	public void testBulbasaurAtacaASquirtleConLatigoCepa() {
		Algomon bulbasaur1 = FabricaEspecie.BULBASAUR.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		bulbasaur1.atacar(squirtle,FabricaAtaque.LATIGO_CEPA);
		assertEquals(120,squirtle.vida());
	}
	
	@Test
	public void testBulbasaurAtacaAChanseyConLatigoCepa() {
		Algomon bulbasaur1 = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		bulbasaur1.atacar(chansey,FabricaAtaque.LATIGO_CEPA);
		assertEquals(115,chansey.vida());
	}
	
	@Test
	public void testBulbasaurAtacaARattataConLatigoCepa() {
		Algomon bulbasaur1 = FabricaEspecie.BULBASAUR.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		bulbasaur1.atacar(rattata,FabricaAtaque.LATIGO_CEPA);
		assertEquals(155,rattata.vida());
	}
	
	@Test
	public void testBulbasaurAtacaAJigglypuffConLatigoCepa() {
		Algomon bulbasaur1 = FabricaEspecie.BULBASAUR.crear();
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		bulbasaur1.atacar(jigglypuff,FabricaAtaque.LATIGO_CEPA);
		assertEquals(115,jigglypuff.vida());
	}
	
////////////////------------ ATAQUES CHANSEY CON LATIGO CEPA ------------////////////////
	
		@Test
		public void testChanseyAtacaACharmanderConLatigoCepa() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon charmander = FabricaEspecie.CHARMANDER.crear();
			chansey.atacar(charmander, FabricaAtaque.LATIGO_CEPA);
			assertEquals(162,charmander.vida());
		}
		
		@Test
		public void testChanseyAtacaASquirtleConLatigoCepa() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
			chansey.atacar(squirtle, FabricaAtaque.LATIGO_CEPA);
			assertEquals(120,squirtle.vida());
		}
		
		@Test
		public void testChanseyAtacaABulbasaurConLatigoCepa() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
			chansey.atacar(bulbasaur, FabricaAtaque.LATIGO_CEPA);
			assertEquals(132,bulbasaur.vida());
		}
		
		@Test
		public void testChanseyAtacaAJigglypuffConLatigoCepa() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
			chansey.atacar(jigglypuff, FabricaAtaque.LATIGO_CEPA);
			assertEquals(115,jigglypuff.vida());
		}
		
		@Test
		public void testChanseyAtacaARattataConLatigoCepa() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon rattata = FabricaEspecie.RATTATA.crear();
			chansey.atacar(rattata, FabricaAtaque.LATIGO_CEPA);
			assertEquals(155,rattata.vida());
		}
		
		@Test
		public void testChanseyAtacaAChanseyConLatigoCepa() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon chansey2 = FabricaEspecie.CHANSEY.crear();
			chansey.atacar(chansey2, FabricaAtaque.LATIGO_CEPA);
			assertEquals(115,chansey2.vida());
		}
		
////////////////------------ ATAQUES CHANSEY CON ATAQUE RAPIDO ------------////////////////
		
		@Test
		public void testChanseyAtacaACharmanderConAtaqueRapido() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon charmander = FabricaEspecie.CHARMANDER.crear();
			chansey.atacar(charmander, FabricaAtaque.ATAQUE_RAPIDO);
			assertEquals(160,charmander.vida());
		}
		
		@Test
		public void testChanseyAtacaASquirtleConAtaqueRapido() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
			chansey.atacar(squirtle, FabricaAtaque.ATAQUE_RAPIDO);
			assertEquals(140,squirtle.vida());
		}
		
		@Test
		public void testChanseyAtacaABulbasaurConAtaqueRapido() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
			chansey.atacar(bulbasaur, FabricaAtaque.ATAQUE_RAPIDO);
			assertEquals(130,bulbasaur.vida());
		}
		
		@Test
		public void testChanseyAtacaARattataConAtaqueRapido() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon rattata = FabricaEspecie.RATTATA.crear();
			chansey.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			assertEquals(160,rattata.vida());
		}
		
		@Test
		public void testChanseyAtacaAJigglypuffConAtaqueRapido() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
			chansey.atacar(jigglypuff, FabricaAtaque.ATAQUE_RAPIDO);
			assertEquals(120,jigglypuff.vida());
		}
		
		@Test
		public void testChanseyAtacaAChanseyConAtaqueRapido() {
			Algomon chansey = FabricaEspecie.CHANSEY.crear();
			Algomon chansey2 = FabricaEspecie.CHANSEY.crear();
			chansey.atacar(chansey2, FabricaAtaque.ATAQUE_RAPIDO);
			assertEquals(120,chansey2.vida());
		}
		
////////////////------------ ATAQUES RATTATA CON BURBUJA ------------////////////////
	
	@Test
	public void testRattataAtacaARattataConBurbuja() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon rattata2 = FabricaEspecie.RATTATA.crear();
		rattata1.atacar(rattata2,FabricaAtaque.BURBUJA);
		assertEquals(160,rattata2.vida());
	}
	
	@Test
	public void testRattataAtacaACharmanderConBurbuja() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		rattata1.atacar(charmander,FabricaAtaque.BURBUJA);
		assertEquals(150,charmander.vida());
	}
	
	@Test
	public void testRattataAtacaSquirtleConBurbuja() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		rattata1.atacar(squirtle,FabricaAtaque.BURBUJA);
		assertEquals(145,squirtle.vida());
	}
	
	@Test
	public void testRattataAtacaAChanseyConBurbuja() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		rattata1.atacar(chansey,FabricaAtaque.BURBUJA);
		assertEquals(120,chansey.vida());
	}
	
	@Test
	public void testRattataAtacaAJugglypuffConBurbuja() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon jugglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		rattata1.atacar(jugglypuff,FabricaAtaque.BURBUJA);
		assertEquals(120,jugglypuff.vida());
	}
	
	@Test
	public void testRattataAtacaABulbasaurConBurbuja() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		rattata1.atacar(bulbasaur,FabricaAtaque.BURBUJA);
		assertEquals(135,bulbasaur.vida());
	}
	
////////////////------------ ATAQUES RATTATA CON ATAQUE RAPIDO ------------////////////////	
	
	
	@Test
	public void testRattataAtacaARattataConAtaqueRapido() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon rattata2 = FabricaEspecie.RATTATA.crear();
		rattata1.atacar(rattata2,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(160,rattata2.vida());
	}
	
	@Test
	public void testRattataAtacaACharmanderConAtaqueRapido() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		rattata1.atacar(charmander,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(160,charmander.vida());
	}
	
	@Test
	public void testRattataAtacaSquirtleConAtaqueRapido() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		rattata1.atacar(squirtle,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(140,squirtle.vida());
	}
	
	@Test
	public void testRattataAtacaAChanseyConAtaqueRapido() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		rattata1.atacar(chansey,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(120,chansey.vida());
	}
	
	@Test
	public void testRattataAtacaAJugglypuffConAtaqueRapido() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon jugglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		rattata1.atacar(jugglypuff,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(120,jugglypuff.vida());
	}
	
	@Test
	public void testRattataAtacaABulbasaurConAtaqueRapido() {
		Algomon rattata1 = FabricaEspecie.RATTATA.crear();
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		rattata1.atacar(bulbasaur,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(130,bulbasaur.vida());
	}
	
////////////////------------ ATAQUES CHARMANDER CON BRASAS ------------////////////////
	
	@Test
	public void testCharmanderAtacaACharmanderConBrasas() {
		Algomon charmander1 = FabricaEspecie.CHARMANDER.crear();
		Algomon charmander2 = FabricaEspecie.CHARMANDER.crear();
		charmander1.atacar(charmander2,FabricaAtaque.BRASAS);
		assertEquals(162,charmander2.vida());
	}
	
	@Test
	public void testCharmanderAtacaASquirtleConBrasas() {
		Algomon charmander1 = FabricaEspecie.CHARMANDER.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		charmander1.atacar(squirtle, FabricaAtaque.BRASAS);
		assertEquals(142,squirtle.vida());
	}
	
	@Test
	public void testCharmanderAtacaABulbasaurConBrasas() {
		Algomon charmander1 = FabricaEspecie.CHARMANDER.crear();
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		charmander1.atacar(bulbasaur,FabricaAtaque.BRASAS);
		assertEquals(108,bulbasaur.vida());
	}
	
	@Test
	public void testCharmanderAtacaAChanseyConBrasas() {
		Algomon charmander1 = FabricaEspecie.CHARMANDER.crear();
		Algomon Chansey = FabricaEspecie.CHANSEY.crear();
		charmander1.atacar(Chansey,FabricaAtaque.BRASAS);
		assertEquals(114,Chansey.vida());
	}
	
	@Test
	public void testCharmanderAtacaARattataConBrasas() {
		Algomon charmander1 = FabricaEspecie.CHARMANDER.crear();
		Algomon Rattata = FabricaEspecie.RATTATA.crear();
		charmander1.atacar(Rattata,FabricaAtaque.BRASAS);
		assertEquals(154,Rattata.vida());
	}
	
	@Test
	public void testCharmanderAtacaAJigglypuffConBrasas() {
		Algomon charmander1 = FabricaEspecie.CHARMANDER.crear();
		Algomon Jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		charmander1.atacar(Jigglypuff,FabricaAtaque.BRASAS);
		assertEquals(114,Jigglypuff.vida());
	}
	
////////////////------------ ATAQUES CHARMANDER CON ATAQUE RAPIDO ------------////////////////	
	
	@Test
	public void testCharmanderAtacaACharmanderConAtaqueRapido() {
		Algomon charmander1 = FabricaEspecie.CHARMANDER.crear();
		Algomon charmander2 = FabricaEspecie.CHARMANDER.crear();
		charmander1.atacar(charmander2,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(160,charmander2.vida());
	}
	
	@Test
	public void testCharmanderAtacaASquirtleConAtaqueRapido() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		charmander.atacar(squirtle,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(140,squirtle.vida());
	}
	
	@Test
	public void testCharmanderAtacaABulbasaurConAtaqueRapido() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		charmander.atacar(bulbasaur,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(130,bulbasaur.vida());
	}
	
	@Test
	public void testCharmanderAtacaAJigglypuffConAtaqueRapido() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		charmander.atacar(jigglypuff,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(120,jigglypuff.vida());
	}
	
	@Test
	public void testCharmanderAtacaAChanseyConAtaqueRapido() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		charmander.atacar(chansey,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(120,chansey.vida());
	}
	
	@Test
	public void testCharmanderAtacaARattataConAtaqueRapido() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		charmander.atacar(rattata,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(160,rattata.vida());
	}
	
////////////////------------ ATAQUES JIGGLYPUFF CON BURBUJA ------------////////////////
	
	@Test
	public void testJigglypuffAtacaAJigglypuffConBurbuja() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.JIGGLYPUFF.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.BURBUJA);
		assertEquals(120,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaACharmanderConBurbuja() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.CHARMANDER.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.BURBUJA);
		assertEquals(150,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaASquirtleConBurbuja() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.SQUIRTLE.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.BURBUJA);
		assertEquals(145,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaABulbasaurConBurbuja() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.BULBASAUR.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.BURBUJA);
		assertEquals(135,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaAChanseyConBurbuja() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.CHANSEY.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.BURBUJA);
		assertEquals(120,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaARattataConBurbuja() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.RATTATA.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.BURBUJA);
		assertEquals(160,jigglypuff2.vida());
	}
	
////////////////------------ ATAQUES JIGGLYPUFF CON ATAQUE RAPIDO ------------////////////////
	
	@Test
	public void testJigglypuffAtacaAJigglypuffConAtaqueRapido() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.JIGGLYPUFF.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(120,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaACharmanderConAtaqueRapido() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.CHARMANDER.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(160,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaASquirtleConAtaqueRapido() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		jigglypuff1.atacar(squirtle,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(140,squirtle.vida());
	}
	
	@Test
	public void testJigglypuffAtacaABulbasaurConAtaqueRapido() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.BULBASAUR.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(130,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaAChanseyConAtaqueRapido() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.CHANSEY.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(120,jigglypuff2.vida());
	}
	
	@Test
	public void testJigglypuffAtacaARattataConAtaqueRapido() {
		Algomon jigglypuff1 = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon jigglypuff2 = FabricaEspecie.RATTATA.crear();
		jigglypuff1.atacar(jigglypuff2,FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(160,jigglypuff2.vida());
	}
	
	
	
	@Test
	public void testCharmanderAtacaJigglypuffConFogonazoYQuedaQuemado(){
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		charmander.atacar(jigglypuff, FabricaAtaque.FOGONAZO);
		EstadoPersistente estado = jigglypuff.estadoPersistente();
		EstadoPersistente estado2 = new EstadoQuemado();
		assertEquals(estado.getClass().getName(), estado2.getClass().getName());
		assertEquals(128, jigglypuff.vida());
		jigglypuff.atacar(charmander, FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(115, jigglypuff.vida());
		jigglypuff.atacar(charmander, FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(102, jigglypuff.vida());
		charmander.atacar(jigglypuff, FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(92, jigglypuff.vida());
		charmander.atacar(jigglypuff, FabricaAtaque.FOGONAZO);
		assertEquals(90, jigglypuff.vida());	
	}
}
