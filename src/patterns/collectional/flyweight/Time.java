package patterns.collectional.flyweight;

public class Time {
	private int minute;
	private int hour;
	
	public Time(int minute, int hour) {
		this.minute = minute;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
}
