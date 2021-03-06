package design_pattern.ch03.check01;

import java.util.Calendar;

public class RealTimeProvider implements TimeProvider {
	private Calendar cal;
	
	
	
	public RealTimeProvider() {
		cal = Calendar.getInstance();
	}
	
	public RealTimeProvider(int hours){
		cal = Calendar.getInstance();
		setHours(hours);
	}

	@Override
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours);
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

}
