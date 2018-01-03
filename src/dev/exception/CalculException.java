package dev.exception;

/**
 * @author Simon SUDRE
 * Class calcul exception runtime
 */
public class CalculException extends RuntimeException {

	/** long : serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructeur
	 * @param msg le message d'erreur
	 */
	public CalculException(String msg) { super(msg); } 

}
