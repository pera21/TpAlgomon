package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import modelo.Algomon;
import modelo.Especie;
import modelo.NombreAtaque;

public class AlgomonTest {

	@Test
	public void testSquirtleAtacaCharmanderConBurbujaYCanion(){
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
	public void testBulbasaurYChanseyAtacanSquirtleConLatigoCepa() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		
		bulbasaur.atacar(squirtle, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(120,squirtle.vida());
		
		chansey.atacar(squirtle, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(90,squirtle.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanCharmanderConLatigoCepa() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		
		bulbasaur.atacar(charmander, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(162,charmander.vida());
		
		chansey.atacar(charmander, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(154,charmander.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanRattataConLatigoCepa() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon rattata = Especie.RATTATA.crear();
		
		bulbasaur.atacar(rattata, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(155,rattata.vida());
		
		chansey.atacar(rattata, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(140,rattata.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanJigglypuffConLatigoCepa() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon jigglypuff = Especie.JIGGLYPUFF.crear();
		
		bulbasaur.atacar(jigglypuff, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(115,jigglypuff.vida());
		
		chansey.atacar(jigglypuff, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(100,jigglypuff.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanChanseyConLatigoCepa() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		Algomon chansey2 = Especie.CHANSEY.crear();
		
		bulbasaur.atacar(chansey2, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(115,chansey2.vida());
		
		chansey.atacar(chansey2, NombreAtaque.LATIGO_CEPA);
		
		assertEquals(100,chansey2.vida());
	}
	
	@Test
	public void testCharmanderAtacaBulbasaurConBrasas() {
		Algomon bulbasaur = Especie.BULBASAUR.crear();
		Algomon charmander = Especie.CHARMANDER.crear();
		
		charmander.atacar(bulbasaur, NombreAtaque.BRASAS);
		
		assertEquals(108,bulbasaur.vida());
	}
	
	@Test
	public void testCharmanderAtacaSquirtleConBrasas() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon squirtle = Especie.SQUIRTLE.crear();
		
		charmander.atacar(squirtle, NombreAtaque.BRASAS);
		
		assertEquals(142,squirtle.vida());
	}
	
	@Test
	public void testCharmanderAtacaChanseyConBrasas() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon chansey = Especie.CHANSEY.crear();
		
		charmander.atacar(chansey, NombreAtaque.BRASAS);
		
		assertEquals(114,chansey.vida());
	}
	
	@Test
	public void testCharmanderAtacaRattataConBrasas() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon rattata = Especie.RATTATA.crear();
		
		charmander.atacar(rattata, NombreAtaque.BRASAS);
		
		assertEquals(154,rattata.vida());
	}
	
	@Test
	public void testCharmanderAtacaJigglypuffConBrasas() {
		Algomon charmander = Especie.CHARMANDER.crear();
		Algomon jigglypuff = Especie.JIGGLYPUFF.crear();

		charmander.atacar(jigglypuff, NombreAtaque.BRASAS);
		
		assertEquals(114,jigglypuff.vida());
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
