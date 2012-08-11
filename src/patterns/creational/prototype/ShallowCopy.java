package patterns.creational.prototype;

/**
 * Primitives are copied. 
 *
 */
public class ShallowCopy extends Prototype {

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
