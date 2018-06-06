package abstractfactory;

/**
 * 
 * @author Lucas Copque - R.A: 816112862
 *
 */
public interface AbstractPrinterFactory {
	TextPrinter getPrinterInstance(String printerType);

}
