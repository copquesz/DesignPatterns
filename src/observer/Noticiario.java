package observer;

import java.util.Observable;

/**
 * 
 * @author Lucas Copque - 816112862
 *
 */
public abstract class Noticiario extends Observable {
	public abstract void notificaNoticia(String textoNoticia, int dia, int mes, String topico);

}
