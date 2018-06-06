package templatemethod;

/**
 * 
 * @author Lucas Copque - 816112862
 *
 */
public class ManipuladorMinusculo extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		return string.toLowerCase();
	}
}
