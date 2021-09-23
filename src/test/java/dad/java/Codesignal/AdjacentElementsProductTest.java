package dad.java.Codesignal;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AdjacentElementsProductTest {
	private EdgeOfTheOcean Eo;
	
	@Before
	public void Setup() {
		Eo =new EdgeOfTheOcean();
	} 
	@Test
	public void test1() {
		int[] intArray = new int[]{3, 6, -2, -5, 7, 3}; 
		assertEquals(21,Eo.adjacentElementsProduct(intArray));
	}
	@Test
	public void test2() {
		int[] intArray = new int[]{-1, -2}; 
		assertEquals(2,Eo.adjacentElementsProduct(intArray));
	}
	@Test
	public void test3() {
		int[] intArray = new int[]{5, 1, 2, 3, 1, 4}; 
		assertEquals(6,Eo.adjacentElementsProduct(intArray));
	}
	@Test
	public void test4() {
		int[] intArray = new int[]{1, 2, 3, 0}; 
		assertEquals(6,Eo.adjacentElementsProduct(intArray));
	}
}
