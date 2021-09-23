package dad.java.Codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CenturyFromYearTest {

	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb=new TheJourneyBegins();
	}
	@Test
	public void test1() {
		assertEquals(20, tjb.centuryFromYear(1905));
	}
	@Test
	public void test2() {
		assertEquals(17, tjb.centuryFromYear(1700));
	}
	@Test
	public void test3() {
		assertEquals(20, tjb.centuryFromYear(1988));
	}
}
