package patterns.creational.prototype;

public class DeepCopy extends Prototype {
	@Override
	public Object clone() {
		DeepCopy deepCopy = new DeepCopy();
		deepCopy.setObject((Obj) this.getObject().clone());
		deepCopy.setPrimitive(this.getPrimitive());
		
		return deepCopy;
	}
}
