package implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheTimeInWordsTest {

	@Test
	public void testTest() {
		assertEquals(true, true);
	}

	@Test
	public void testHour()
	{
		assertEquals("one", new TheTimeInWords().getClockNumber(1));
	}
	
	@Test
	public void testAllNumbers()
	{
		assertEquals("one", new TheTimeInWords().getMinutes(1));
		assertEquals("eleven", new TheTimeInWords().getMinutes(11));
		assertEquals("twenty", new TheTimeInWords().getMinutes(20));
		assertEquals("twenty five", new TheTimeInWords().getMinutes(25));
		assertEquals("", new TheTimeInWords().getMinutes(0));
		assertEquals("nineteen", new TheTimeInWords().getMinutes(19));
	}	
	
	@Test
	public void testOClock()
	{
		assertEquals("five o' clock", new TheTimeInWords().solve(5, 0));
	}
	
	@Test
	public void test1()
	{
		assertEquals("one minute past five", new TheTimeInWords().solve(5, 1));
	}
	@Test
	public void test2()
	{
		assertEquals("ten minutes past five", new TheTimeInWords().solve(5, 10));
	}
	@Test
	public void test3()
	{
		assertEquals("half past five", new TheTimeInWords().solve(5, 30));
	}
	@Test
	public void test4()
	{
		assertEquals("twenty minutes to six", new TheTimeInWords().solve(5, 40));
	}
	@Test
	public void test5()
	{
		assertEquals("quarter to six", new TheTimeInWords().solve(5, 45));
	}
}
