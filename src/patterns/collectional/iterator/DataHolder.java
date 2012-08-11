package patterns.collectional.iterator;

import java.util.Iterator;

public class DataHolder<T> {
	private int size = 2;
	private T[] data;
	private int count;
	
	private class Iter implements Iterator<T> {
		private int position;
		
		public boolean hasNext() {
			return position < size;
		}

		public T next() {
			return (T) data[position++];
		}

		public void remove() {
		}
	}

	@SuppressWarnings("unchecked")
	public DataHolder(int size) {
		this.size = size;
		this.data = (T[]) new Object[size];
	}
	
	public void add(T object) {
		if(data.length <= count) {
			System.out.println("two  much");
			return;
		}
		
		data[count++] = object;
	}
	
	public Iterator<T> iterator() {
		return new Iter();
	}
}
