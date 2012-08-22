package patterns.collectional.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TimeFactory {
	private static Map<String, Time> timeCache = new HashMap<String, Time>();
	
	public static Time create(int hour, int minute) {
		String key = hour + ":" + minute;
		
		if (!timeCache.containsKey(key)) {
			timeCache.put(key, new Time(minute, hour));
		}
		
		return timeCache.get(key);
	}
}
