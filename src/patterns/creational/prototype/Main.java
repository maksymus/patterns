package patterns.creational.prototype;

public class Main {
	public static void main(String[] args) {
		System.out.println("\tShallow copy test");
		ShallowCopy shallowCopy = new ShallowCopy();
		ShallowCopy shallowCopyClone = (ShallowCopy) shallowCopy.clone();
		System.out.println(shallowCopy.getPrimitive() + " " + shallowCopy.getObject());
		System.out.println(shallowCopyClone.getPrimitive() + " " + shallowCopyClone.getObject());
		
		System.out.println("\tDeep copy test");
		DeepCopy deepCopy = new DeepCopy();
		DeepCopy deepCopyClone = (DeepCopy) deepCopy.clone();
		System.out.println(deepCopy.getPrimitive() + " " + deepCopy.getObject());
		System.out.println(deepCopyClone.getPrimitive() + " " + deepCopyClone.getObject());
	}
}
