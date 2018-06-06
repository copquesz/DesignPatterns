package observer;

/**
 * 
 * @author Lucas Copque - 816112862
 *
 */
public interface Observer {
	public void update(String desc);

	public void subscribe();

	public void unSubscribe();
}
