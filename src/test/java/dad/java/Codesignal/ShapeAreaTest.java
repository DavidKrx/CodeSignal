package dad.java.Codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShapeAreaTest {
	private EdgeOfTheOcean Eo;
	
	@Before
	public void Setup() {
		Eo =new EdgeOfTheOcean();
	} 
	@Test
	public void test1() {
		assertEquals(5,Eo.shapeArea(2));
	}
	@Test
	public void test2() {
		assertEquals(13,Eo.shapeArea(3));
	}
	@Test
	public void test3() {
		assertEquals(1,Eo.shapeArea(1));
	}
	@Test
	public void test4() {
		assertEquals(41,Eo.shapeArea(5));
	}
}
