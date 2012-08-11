package patterns.behavioral.memento;

public class Main {
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		
		Originator originator = new Originator();
		
		originator.setData("data1");
		careTaker.addState(originator.createState());

		originator.setData("data2");
		careTaker.addState(originator.createState());
		
		originator.setData("data3");
		careTaker.addState(originator.createState());
		
		originator.restore(careTaker.getPreviousState());
		System.out.println(originator.getData());

		originator.restore(careTaker.getPreviousState());
		System.out.println(originator.getData());
		
		originator.restore(careTaker.getPreviousState());
		System.out.println(originator.getData());
	}
}
