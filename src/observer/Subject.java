package observer;

/**
 * 
 * @author Lucas Copque - 816112862
 *
 */
public interface Subject {
	public void subscribeObserver(Observer observer);

	public void unSubscribeObserver(Observer observer);

	public void notifyObservers();

	public String subjectDetails();
}
