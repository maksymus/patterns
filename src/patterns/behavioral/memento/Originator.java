package patterns.behavioral.memento;

public class Originator {
	private String data;
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void restore(Memento memento) {
		data = memento.data;
	}
	
	public Memento createState() {
		return new Memento(data);
	}
	
	public final class Memento {
		private String data;
		
		public Memento(String data) {
			this.data = data;
		}
	}
}
