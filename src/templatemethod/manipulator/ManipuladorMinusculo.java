package templatemethod.manipulator;

/**
 * 
 * @author Denilson | RA: 816122383
 *
 */
public class ManipuladorMinusculo extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		return string.toLowerCase();
	}
}
