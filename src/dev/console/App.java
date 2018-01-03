package dev.console;

import java.util.Scanner;

import dev.exception.CalculException;
import dev.service.CalculService;
import static dev.console.AppTest.LOG;

/**
 * @author Simon SUDRE
 * class App
 *
 */
public class App {

	/** Scanner : scanner */
	private Scanner scanner;
	
	/** CalculService : calculatrice */
	private CalculService calculatrice;
	
	/** Constructeur
	 * @param scanner un scanner
	 * @param calculatrice un calculservice
	 */
	public App(Scanner scanner, CalculService calculatrice) {
		this.setScanner(scanner);
		this.setCalculatrice(calculatrice);
	}
	
	/**
	 * methode afficher titre
	 */
	protected void afficherTitre() {
		LOG.info("**** Application Calculatrice ****");
	}
	
	/**
	 * methode demarer lance la methode afficher titre
	 */
	public void demarrer() {
		afficherTitre();
	}
	
	/**
	 * methode evaluer
	 * @param expression expression
	 */
	protected void evaluer(String expression) {
		try {
			this.getCalculatrice().additionner(expression);
		}
		catch(Exception e) { 
			throw new CalculException("L’expression " + expression + " est invalide");
		}
	}

	/**
	 * GET scanner
	 * @return scanner
	 */
	public Scanner getScanner() {
		return scanner;
	}

	/**
	 * SET scanner
	 * @param scanner scanner
	 */
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	/**
	 * GET calculatrice
	 * @return calculatrice
	 */
	public CalculService getCalculatrice() {
		return calculatrice;
	}

	/**
	 * SET calculatrice
	 * @param calculatrice calculatrice
	 */
	public void setCalculatrice(CalculService calculatrice) {
		this.calculatrice = calculatrice;
	}
}
