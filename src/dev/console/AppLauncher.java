package dev.console;

import java.util.Scanner;
import dev.service.CalculService;

/**
 * @author Simon SUDRE
 * class applauncher
 */
public class AppLauncher {

	/**
	 * point d'entréer
	 * @param args non utiliser
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			new App(scanner, new CalculService()).demarrer();
		}
	}

}
