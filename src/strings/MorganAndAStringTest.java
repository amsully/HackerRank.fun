package strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class MorganAndAStringTest {

	@Test
	public void testProvidedInput() {
		assertEquals("DAJACKNIEL", MorganAndAString.minimumOrder("JACK", "DANIEL"));
	}
	@Test
	public void testProvidedInput2() {
		assertEquals("AABABACABACABA", MorganAndAString.minimumOrder("ABACABA", "ABACABA"));
	}
	@Test
	public void testAZ() {
		assertEquals("AAAAZZZZ", MorganAndAString.minimumOrder("ZZZZ", "AAAA"));
	}
	@Test
	public void testBug() {
		assertEquals("BABD", MorganAndAString.minimumOrder("BD", "BA"));
	}	
	@Test
	public void testBug2() {
		assertEquals("BABD", MorganAndAString.minimumOrder("BA", "BD"));
	}	
	@Test
	public void testBug3() {
		assertEquals("BBBBBBBBBABD", MorganAndAString.minimumOrder("BBBBBBBBBA", "BD"));
	}	
	@Test
	public void testBug4() {
		assertEquals("BBBBBBBBBABD", MorganAndAString.minimumOrder("BD", "BBBBBBBBBA"));
	}	
	@Test
	public void testBug5() {
		assertEquals("ZZZZAZZZZ", MorganAndAString.minimumOrder("ZZZZA", "ZZZZ"));
	}	
	@Test
	public void testBug6() {
		assertEquals("CCZAZB", MorganAndAString.minimumOrder("CZA", "CZB"));
	}	

}
