package senhafactory;import java.io.File;import java.util.Scanner;import util.ResourceUtils;/** *  * @author Lucas Copque - R.A: 816112862 * */public class ProvedorPublico extends ProvedorInformacao {	protected String recuperarInformacao() {		String pacote = getClass().getPackage().getName().toString().replace('.', '/');		File arquivo = ResourceUtils.getResourceAsFile(pacote + "/publico.txt");		StringBuffer buffer = new StringBuffer();		Scanner scanner = criarScanner(arquivo);		while (scanner.hasNextLine()) {			buffer.append(scanner.nextLine());			buffer.append("\n");		}		scanner.close();		return buffer.toString();	}}