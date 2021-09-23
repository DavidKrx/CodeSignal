package dad.java.Codesignal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTest {
	private TheJourneyBegins tjb;
	
	@Before
	public void Setup() {
		tjb=new TheJourneyBegins();
	}
	@Test
	public void test1() {
		assumeTrue(tjb.checkPalindrome("aabaa"));
	}
	@Test
	public void test2() {
		assumeFalse(tjb.checkPalindrome("abac"));
	}
	@Test
	public void test3() {
		assumeTrue(tjb.checkPalindrome("a"));
	}
	@Test
	public void test4() {
		assertEquals(true,tjb.checkPalindrome("a"));
	}
}
