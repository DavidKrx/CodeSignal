package dad.java.Codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MakeArrayConsecutive2Test {

	private EdgeOfTheOcean Eo;
	
	@Before
	public void Setup() {
		Eo =new EdgeOfTheOcean();
	} 
	@Test
	public void test1() {
		int[] intArray = new int[]{6, 2, 3, 8}; 
		assertEquals(3,Eo.makeArrayConsecutive2(intArray));
	}
	@Test
	public void test2() {
		int[] intArray = new int[]{0, 3}; 
		assertEquals(2,Eo.makeArrayConsecutive2(intArray));
	}
	@Test
	public void test3() {
		int[] intArray = new int[]{5, 4, 6}; 
		assertEquals(0,Eo.makeArrayConsecutive2(intArray));
	}
	@Test
	public void test4() {
		int[] intArray = new int[]{6, 3}; 
		assertEquals(2,Eo.makeArrayConsecutive2(intArray));
	}
}
