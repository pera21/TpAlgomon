package test;

import static org.junit.Assert.*;
import org.junit.Test;
import modelo.Algomon;
import modelo.FabricaEspecie;
import modelo.FabricaAtaque;

public class AlgomonTest {

	@Test
	public void testSquirtleAtacaCharmanderConBurbujaYCanion(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		squirtle.cambiarAEstadoActivo();
		squirtle.atacar(charmander, FabricaAtaque.BURBUJA);
		
		assertEquals(150, charmander.vida());
		
		squirtle.atacar(charmander, FabricaAtaque.CANION_DE_AGUA);
		
		assertEquals(110, charmander.vida());
	}
	
	@Test
	public void testSquirtleAtacaBulbasaurConBurbujaYCanion(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		squirtle.cambiarAEstadoActivo();
		squirtle.atacar(bulbasaur, FabricaAtaque.BURBUJA);
		
		assertEquals(135, bulbasaur.vida());
		
		squirtle.atacar(bulbasaur, FabricaAtaque.CANION_DE_AGUA);
		
		assertEquals(125, bulbasaur.vida());
	}
	
	@Test
	public void testSquirtleAtacaJigglypuffConBurbujaYCanion(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		Algomon jigglypuf = FabricaEspecie.JIGGLYPUFF.crear();
		squirtle.cambiarAEstadoActivo();
		squirtle.atacar(jigglypuf, FabricaAtaque.BURBUJA);
		
		assertEquals(120, jigglypuf.vida());
		
		squirtle.atacar(jigglypuf, FabricaAtaque.CANION_DE_AGUA);
		
		assertEquals(100, jigglypuf.vida());
	}
	
	@Test
	public void testSquirtleAtacaRattataConBurbujaYCanion(){
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		squirtle.cambiarAEstadoActivo();
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
		squirtle.cambiarAEstadoActivo();
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
		bulbasaur.cambiarAEstadoActivo();
		bulbasaur.atacar(squirtle, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(120,squirtle.vida());
		chansey.cambiarAEstadoActivo();
		chansey.atacar(squirtle, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(90,squirtle.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanCharmanderConLatigoCepa() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		bulbasaur.cambiarAEstadoActivo();
		bulbasaur.atacar(charmander, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(162,charmander.vida());
		chansey.cambiarAEstadoActivo();
		chansey.atacar(charmander, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(154,charmander.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanRattataConLatigoCepa() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		bulbasaur.cambiarAEstadoActivo();
		bulbasaur.atacar(rattata, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(155,rattata.vida());
		chansey.cambiarAEstadoActivo();
		chansey.atacar(rattata, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(140,rattata.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanJigglypuffConLatigoCepa() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		bulbasaur.cambiarAEstadoActivo();
		bulbasaur.atacar(jigglypuff, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(115,jigglypuff.vida());
		chansey.cambiarAEstadoActivo();
		chansey.atacar(jigglypuff, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(100,jigglypuff.vida());
	}
	
	@Test
	public void testBulbasaurYChanseyAtacanChanseyConLatigoCepa() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon chansey2 = FabricaEspecie.CHANSEY.crear();
		bulbasaur.cambiarAEstadoActivo();
		bulbasaur.atacar(chansey2, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(115,chansey2.vida());
		chansey.cambiarAEstadoActivo();
		chansey.atacar(chansey2, FabricaAtaque.LATIGO_CEPA);
		
		assertEquals(100,chansey2.vida());
	}
	
	@Test
	public void testCharmanderAtacaBulbasaurConBrasas() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		charmander.cambiarAEstadoActivo();
		charmander.atacar(bulbasaur, FabricaAtaque.BRASAS);
		
		assertEquals(108,bulbasaur.vida());
	}
	
	@Test
	public void testCharmanderAtacaSquirtleConBrasas() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		charmander.cambiarAEstadoActivo();
		charmander.atacar(squirtle, FabricaAtaque.BRASAS);
		
		assertEquals(142,squirtle.vida());
	}
	
	@Test
	public void testCharmanderAtacaChanseyConBrasas() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		charmander.cambiarAEstadoActivo();
		charmander.atacar(chansey, FabricaAtaque.BRASAS);
		
		assertEquals(114,chansey.vida());
	}
	
	@Test
	public void testCharmanderAtacaRattataConBrasas() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		charmander.cambiarAEstadoActivo();
		charmander.atacar(rattata, FabricaAtaque.BRASAS);
		
		assertEquals(154,rattata.vida());
	}
	
	@Test
	public void testCharmanderAtacaJigglypuffConBrasas() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		charmander.cambiarAEstadoActivo();
		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		
		assertEquals(114,jigglypuff.vida());
	}
	
	@Test
	public void AlgomonAgotaCantidadDisponibleDeAtaques(){
			Algomon charmander = FabricaEspecie.CHARMANDER.crear();
			Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
			Algomon rattata = FabricaEspecie.RATTATA.crear();
			charmander.cambiarAEstadoActivo();
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
	public void testBulbasaurAtacaCharmanderConChupaVidas() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		charmander.cambiarAEstadoActivo();
		bulbasaur.cambiarAEstadoActivo();
		charmander.atacar(bulbasaur, FabricaAtaque.BRASAS);
		bulbasaur.atacar(charmander, FabricaAtaque.CHUPAVIDAS);
		assertEquals(162,charmander.vida());
		assertEquals(110,bulbasaur.vida());
	}
	
	@Test
	public void testBulbasaurAtacaSquirtleConChupaVidas() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon squirtle = FabricaEspecie.SQUIRTLE.crear();
		squirtle.cambiarAEstadoActivo();
		bulbasaur.cambiarAEstadoActivo();
		squirtle.atacar(bulbasaur, FabricaAtaque.CANION_DE_AGUA);
		bulbasaur.atacar(squirtle, FabricaAtaque.CHUPAVIDAS);
		assertEquals(120,squirtle.vida());
		assertEquals(139,bulbasaur.vida());
	}
	
	@Test
	public void testBulbasaurAtacaBulbasaurConChupaVidas() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon bulbasaur2 = FabricaEspecie.BULBASAUR.crear();
		bulbasaur.cambiarAEstadoActivo();
		bulbasaur2.cambiarAEstadoActivo();
		bulbasaur2.atacar(bulbasaur, FabricaAtaque.ATAQUE_RAPIDO);
		bulbasaur.atacar(bulbasaur2, FabricaAtaque.CHUPAVIDAS);
		assertEquals(132,bulbasaur2.vida());
		assertEquals(132,bulbasaur.vida());
	}
	
	@Test
	public void testBulbasaurAtacaChanseyConChupaVidas() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		chansey.cambiarAEstadoActivo();
		bulbasaur.cambiarAEstadoActivo();
		chansey.atacar(bulbasaur, FabricaAtaque.ATAQUE_RAPIDO);
		bulbasaur.atacar(chansey, FabricaAtaque.CHUPAVIDAS);
		assertEquals(115,chansey.vida());
		assertEquals(134,bulbasaur.vida());
	}
	
	@Test
	public void testBulbasaurAtacaJigglypuffConChupaVidas() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		jigglypuff.cambiarAEstadoActivo();
		bulbasaur.cambiarAEstadoActivo();
		jigglypuff.atacar(bulbasaur, FabricaAtaque.ATAQUE_RAPIDO);
		bulbasaur.atacar(jigglypuff, FabricaAtaque.CHUPAVIDAS);
		assertEquals(115,jigglypuff.vida());
		assertEquals(134,bulbasaur.vida());
	}
	
	@Test
	public void testBulbasaurAtacaRattataConChupaVidas() {
		Algomon bulbasaur = FabricaEspecie.BULBASAUR.crear();
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		rattata.cambiarAEstadoActivo();
		bulbasaur.cambiarAEstadoActivo();
		rattata.atacar(bulbasaur, FabricaAtaque.ATAQUE_RAPIDO);
		bulbasaur.atacar(rattata, FabricaAtaque.CHUPAVIDAS);
		assertEquals(155,rattata.vida());
		assertEquals(134,bulbasaur.vida());
	}
	
	@Test
	public void testJigglypuffAtacaCharmanderConCantoYCharmanderNoSacaVidaPor3Turnos(){
		Algomon jigglypuff = FabricaEspecie.JIGGLYPUFF.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		charmander.cambiarAEstadoActivo();
		jigglypuff.cambiarAEstadoActivo();
		jigglypuff.atacar(charmander, FabricaAtaque.CANTO);
		assertEquals(170, charmander.vida());
		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		charmander.atacar(jigglypuff, FabricaAtaque.BRASAS);
		assertEquals(130, jigglypuff.vida());
	}
	
	@Test
	public void testChanseyAtacaCharmanderConCantoYCharmanderNoSacaVidaPor3Turnos(){
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		charmander.cambiarAEstadoActivo();
		chansey.cambiarAEstadoActivo();
		chansey.atacar(charmander, FabricaAtaque.CANTO);
		assertEquals(170, charmander.vida());
		charmander.atacar(chansey, FabricaAtaque.BRASAS);
		charmander.atacar(chansey, FabricaAtaque.BRASAS);
		charmander.atacar(chansey, FabricaAtaque.BRASAS);
		assertEquals(130, chansey.vida());
	}
	
	@Test
	public void testCharmanderAtacaChanseyConFogonazo() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		charmander.cambiarAEstadoActivo();
		charmander.atacar(chansey, FabricaAtaque.FOGONAZO);
		assertEquals(128,chansey.vida());
	}
	
	@Test
	public void testCharmanderAtacaChanseyConFogonazoYEsteRecibe13DeDañoPorTurno() {
		Algomon charmander = FabricaEspecie.CHARMANDER.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		charmander.cambiarAEstadoActivo();
		chansey.cambiarAEstadoActivo();
		charmander.atacar(chansey, FabricaAtaque.FOGONAZO);
		chansey.atacar(charmander, FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(115,chansey.vida());
		charmander.atacar(chansey, FabricaAtaque.BRASAS);
		assertEquals(99,chansey.vida());
		chansey.atacar(charmander, FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(86,chansey.vida());
	}
	
	@Test
	public void testRattataAtacaChanseyConFogonazoYEsteRecibe13DeDañoPorTurno() {
		Algomon rattata = FabricaEspecie.RATTATA.crear();
		Algomon chansey = FabricaEspecie.CHANSEY.crear();
		rattata.cambiarAEstadoActivo();
		chansey.cambiarAEstadoActivo();
		rattata.atacar(chansey, FabricaAtaque.FOGONAZO);
		chansey.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(115,chansey.vida());
		rattata.atacar(chansey, FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(105,chansey.vida());
		chansey.atacar(rattata, FabricaAtaque.ATAQUE_RAPIDO);
		assertEquals(92,chansey.vida());
	}

}
