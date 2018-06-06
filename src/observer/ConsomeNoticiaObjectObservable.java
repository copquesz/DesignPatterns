package observer;

import java.util.Observable;

/**
 * 
 * @author Lucas Copque - 816112862
 *
 */
public class ConsomeNoticiaObjectObservable extends Observable implements ConsomeNoticia {

	private String noticia;
	private final String subjectDetails;

	public ConsomeNoticiaObjectObservable(String subjectDetails) {
		this.subjectDetails = subjectDetails;
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		this.noticia = textoNoticia;
		setChanged();
		notifyObservers(noticia);
	}

	public String subjectDetails() {
		return subjectDetails;
	}
}
