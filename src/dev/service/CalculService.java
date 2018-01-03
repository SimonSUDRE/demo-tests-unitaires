package dev.service;

import static dev.service.CalculServiceTest.LOG;
import dev.exception.CalculException;

/**
 * @author Simon SUDRE
 * class calcul service
 *
 */
public class CalculService {

	/**
	 * methode additionner
	 * @param expression expretion d'addition
	 * @return le resultat de l'expretion
	 */
	public int additionner(String expression) {
		LOG.debug("Evaluation de l'expression ", expression);
		int resultat = 0;
		for(String s : expression.split("\\+")) {
			try {
				resultat += Integer.parseInt(s);
			}
			catch(Exception e) {
				throw new CalculException("L’expression " + expression + " est invalide");
			}
		}
		return resultat;
	}
}