package templatemethod.manipulator;

/**
 * 
 * @author Denilson | RA: 816122383
 *
 */
public class ManipuladorDuplicar extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		return string + " " + string;
	}
}
