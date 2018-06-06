package abstractfactory;

/**
 * 
 * @author Lucas Copque - R.A: 816112862
 *
 */
public class TestAbstractPrinterFactory {
	public static void main(String[] args) {

		AbstractPrinterFactory printerFactory = new PrinterFactory();
		TextPrinter printer = printerFactory.getPrinterInstance("FILEPRINT");
		printer.print();

		System.out.println("************************************");

		printer = printerFactory.getPrinterInstance("SCREENPRINT");
		printer.print();
	}
}