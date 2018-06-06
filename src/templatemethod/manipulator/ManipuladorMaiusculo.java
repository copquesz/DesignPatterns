package templatemethod.manipulator;

/**
 * 
 * @author Denilson | RA: 816122383
 *
 */
public class ManipuladorMaiusculo extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		return string.toUpperCase();
	}
}
