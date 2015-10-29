package implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class KaprekarNumbersTest {

	@Test
	public void test() {
		assertEquals( true, new KaprekarNumbers().isKaprekar(1) );
		assertEquals( true, new KaprekarNumbers().isKaprekar(9) );
		assertEquals( true, new KaprekarNumbers().isKaprekar(45) );
		assertEquals( true, new KaprekarNumbers().isKaprekar(55) );
		assertEquals( true, new KaprekarNumbers().isKaprekar(99) );
		assertEquals( false, new KaprekarNumbers().isKaprekar(4879) );

	}
	
	

}
