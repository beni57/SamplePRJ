package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleApp1Test {

	@Test
	public void testSum() {

		SampleApp1 test1 = new SampleApp1();
		assertEquals(" error in sum() ",10,test1.sum(4));
		assertEquals(" error in sum() ",-10,test1.sum(4));
	}

}
