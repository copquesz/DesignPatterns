package abstractfactory;

/**
 * 
 * @author Lucas Copque - R.A: 816112862
 *
 */
public class ScreenPrintTextPrinter implements TextPrinter {

	@Override
	public void print() {
		System.out.println("Screen Print");
	}

}
