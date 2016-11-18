package test;

import static org.junit.Assert.*;
import org.junit.Test;
import modelo.Algomon;
import modelo.FabricaEspecie;
import modelo.EstadoDormido;
import modelo.EstadoEfimero;
import modelo.FabricaAtaque;

public class AlgomonTest {

	@Test
	public void testSquirtleAtacaCharmanderConBurbujaYCanion(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		
		squirtle.atacar(charmander, FabricaAtaque.BURBUJA);
		
		assertEquals(150, charmander.vida());
		
		squirtle.atacar(charmander, FabricaAtaque.CANION_DE_AGUA);
		
		assertEquals(110, charmander.vida());
	}
	
	@Test
	public void testSquirtleAtacaBulbasaurConBurbujaYCanion(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		
		squirtle.atacar(bulbasaur, FabricaAtaque.BURBUJA);
		
		assertEquals(135, bulbasaur.vida());
		
		squirtle.atacar(bulbasaur, FabricaAtaque.CANION_DE_AGUA);
		
		assertEquals(125, bulbasaur.vida());
	}
	
	@Test
	public void testSquirtleAtacaJigglypuffConBurbujaYCanion(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		Algomon jigglypuf = FabricaEspecie.JIGGLYPUFF.crear();
		
		squirtle.atacar(jigglypuf, FabricaAtaque.BURBUJA);
		
		assertEquals(120, jigglypuf.vida());
		
		squirtle.atacar(jigglypuf, FabricaAtaque.CANION_DE_AGUA);
		
		assertEquals(100, jigglypuf.vida());
	}
	
	@Test
	public void testSquirtleAtacaRattataConBurbujaYCanion(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		
		squirtle.atacar(rattata, FabricaAtaque.BURBUJA);
		
		assertEquals(160, rattata.vida());
		
		squirtle.atacar(rattata, FabricaAtaque.CANION_DE_AGUA);
		
		assertEquals(140, rattata.vida());
	}
	
	@Test
	public void testSquirtleAtacaChanseyYRattataConBurbujaYCanion(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		
		squirtle.atacar(chansey, FabricaAtaque.BURBUJA);
		
		assertEquals(120, chansey.vida());
		
		squirtle.atacar(chansey, FabricaAtaque.CANION_DE_AGUA);
		
		assertEquals(100, chansey.vida());
		
		squirtle.atacar(rattata, FabricaAtaque.BURBUJA);
		
		assertEquals(160, rattata.vida());
		
		squirtle.atacar(rattata, FabricaAtaque.CANION_DE_AGUA);
		
		assertEquals(140, rattata.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanSquirtleConLatigoCepa() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		
		bulbasaur.atacar(squirtle, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(120,squirtle.vida());
		
		chansey.atacar(squirtle, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(90,squirtle.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanCharmanderConLatigoCepa() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		
		bulbasaur.atacar(charmander, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(162,charmander.vida());
		
		chansey.atacar(charmander, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(154,charmander.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanRattataConLatigoCepa() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		
		bulbasaur.atacar(rattata, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(155,rattata.vida());
		
		chansey.atacar(rattata, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(140,rattata.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanJigglypuffConLatigoCepa() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		
		bulbasaur.atacar(jigglypuff, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(115,jigglypuff.vida());
		
		chansey.atacar(jigglypuff, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(100,jigglypuff.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanChanseyConLatigoCepa() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon chansey2 = FabricaEspecie.CHANSEY.crear();
		
		bulbasaur.atacar(chansey2, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(115,chansey2.vida());
		
		chansey.atacar(chansey2, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(100,chansey2.vida());
	}
	
	@Test
	public void testCharmanderAtacaBulbasaurConBrasas() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		
		charmander.atacar(bulbasaur, FabricaAtaque.BRASAS);
		
		assertEquals(108,bulbasaur.vida());
	}
	
	@Test
	public void testCharmanderAtacaSquirtleConBrasas() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		
		charmander.atacar(squirtle, FabricaAtaque.BRASAS);
		
		assertEquals(142,squirtle.vida());
	}
	
	@Test
	public void testCharmanderAtacaChanseyConBrasas() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		
		charmander.atacar(chansey, FabricaAtaque.BRASAS);
		
		assertEquals(114,chansey.vida());
	}
	
	@Test
	public void testCharmanderAtacaRattataConBrasas() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		
		charmander.atacar(rattata, FabricaAtaque.BRASAS);
		
		assertEquals(154,rattata.vida());
	}
	
	@Test
	public void testCharmanderAtacaJigglypuffConBrasas() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();

		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		
		assertEquals(114,jigglypuff.vida());
	}
	
	@Test
	public void AlgomonAgotaCantidadDisponibleDeAtaques(){
			Algomon charmander = FabricaEspecie.CHARMANDER.crear();
			Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
			Algomon rattata = FabricaEspecie.RATTATA.crear();
			
			charmander.atacar(squirtle, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(squirtle, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			charmander.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			
			charmander.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
			
			assertEquals(0, charmander.getAtaquesRestantes(FabricaAtaque.ATAQUE_RAPIDO));
	}
	
	@Test
	public void testJigglypuffAtacaCharmanderConCantoYQuedaDormido(){
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		jigglypuff.atacar(charmander, FabricaAtaque.CANTO);
		EstadoEfimero estado = charmander.estadoEfimero();
		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		EstadoEfimero estado2 = new EstadoDormido();
		assertEquals(estado.getClass().getName(), estado2.getClass().getName());
	}
	
	@Test
	public void testJigglypuffAtacaCharmanderConCanto(){
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		jigglypuff.atacar(charmander, FabricaAtaque.CANTO);
		assertEquals(170, charmander.vida());
		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		assertEquals(130, jigglypuff.vida());
		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		assertEquals(130, jigglypuff.vida());
		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		assertEquals(130, jigglypuff.vida());
		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		assertEquals(114, jigglypuff.vida());
	}

}
