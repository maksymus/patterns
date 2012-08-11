package patterns.creational.prototype;


public class Prototype implements Cloneable {
	class Obj implements Cloneable {
		@Override
		protected Object clone()  {
			try {
				return super.clone();
			} catch (CloneNotSupportedException e) {
				return null;
			}
		}
	}
	
	public Prototype() {
		primitive = 1;
		object = new Obj();
	}

	protected Obj object;
	protected int primitive;
	
	public Obj getObject() {
		return object;
	}
	
	public void setObject(Obj object) {
		this.object = object;
	}
	
	public int getPrimitive() {
		return primitive;
	}
	
	public void setPrimitive(int primitive) {
		this.primitive = primitive;
	}
}
