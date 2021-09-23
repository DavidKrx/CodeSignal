package dad.java.Codesignal;
import static org.junit.Assert.assertEquals;

import org.junit.*;


public class AddTestSuite {
	
	@Test
	public void test1() {
		TheJourneyBegins tjb=new TheJourneyBegins();
		int resultado=tjb.add(1, 2);
		assertEquals(resultado, 3);
	}
	@Test
	public void test2() {
		TheJourneyBegins tjb=new TheJourneyBegins();
		int resultado=tjb.add(30, -15);
		assertEquals(resultado, 15);
	}
}
