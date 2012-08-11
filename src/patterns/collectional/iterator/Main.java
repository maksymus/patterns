package patterns.collectional.iterator;

import java.util.Iterator;


public class Main {
	public static void main(String[] args) {
		DataHolder<String> dataHolder = new DataHolder<String>(5);
		dataHolder.add("1");
		dataHolder.add("2");
		dataHolder.add("hello");
		dataHolder.add("4");
		dataHolder.add("tyrytuiyu");

		Iterator<String> iter = dataHolder.iterator();
		
		while(iter.hasNext()){
			String type = iter.next();
			System.out.println(type);
		}
	}
}
