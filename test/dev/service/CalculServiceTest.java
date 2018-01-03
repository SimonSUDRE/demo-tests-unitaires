package dev.service;

import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dev.exception.CalculException;

// import static org.assertj.core.api.Assertions.*;

/**
* Test unitaire de la classe dev.service.CalculService.
*/
public class CalculServiceTest {

	/** LOG : Logger */
	public static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);

	/**
	 * test normal
	 * @throws Exception exception
	 */
	@Test
	public void testAdditionner() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		CalculService calculService = new CalculService();
		
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		int somme = calculService.additionner("1+3+4");
		
		LOG.info("Alors j'obtiens le résultat 8");
		assertEquals(somme, 8);
	}
	
	/**
	 * test CalculException
	 * @throws Exception exception
	 */
	@Test(expected = CalculException.class)
	public void testAdditionnerException() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		CalculService calculService = new CalculService();
		
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3-4");
		calculService.additionner("1+3-4");
		
		LOG.info("Alors j'obtiens une exception");
	}
	
	/**
	 * test avec assertThat
	 * @throws Exception exception
	 */
	@Test
	public void testSomme3valeurs() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		CalculService calculService = new CalculService();
		
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		int somme = calculService.additionner("1+3+4");
		
		LOG.info("Alors j'obtiens le résultat 8");
		assertThat(somme).isEqualTo(8);
	}
}
