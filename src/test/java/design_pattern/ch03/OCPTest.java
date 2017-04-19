package design_pattern.ch03;

import static org.junit.Assert.*;

import org.junit.Test;

import design_pattern.ch03.check01.FakeTimeProvider;
import design_pattern.ch03.check01.RealTimeProvider;
import design_pattern.ch03.check01.TimeProvider;
import design_pattern.ch03.check01.TimeReminder;

public class OCPTest {

	@Test
	public void testTimeReminder() {
		TimeProvider tProvSub = new FakeTimeProvider();
		tProvSub.setHours(23);
		
		TimeReminder tr = new TimeReminder();
		tr.settProv(tProvSub);
		
		tr.reminder();
	}
	@Test
	public void testRealTimeProvider(){
		System.out.println("testRealTimeProvider()");
		TimeProvider tProvSub = new RealTimeProvider();
		tProvSub.setHours(23);
		
		TimeReminder tr = new TimeReminder();
		tr.settProv(tProvSub);
		
		tr.reminder();
	}

}
