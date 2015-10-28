package implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaumAndBdayTest {

	@Test
	public void test() {
			assertEquals(true, true);
	}
	
	@Test
	public void testOne() {
			assertEquals(2, new TaumAndBday().printCost(1, 1,  1, 1, 1));
	}
	
	@Test
	public void testTwo() {
			assertEquals(1, new TaumAndBday().printCost(1, 1,  0, 1, 1));
	}
	
	// 1 0
	// 1 0 0
	@Test
	public void testThree() {
			assertEquals(0, new TaumAndBday().printCost(1, 0,  1, 0, 0));
	}

	// 1 1
	// 1 50 0
	@Test
	public void testFour() {
			assertEquals(1, new TaumAndBday().printCost(1, 0,  1, 50, 0));
	}
	
	// 1 1
	// 1 0 0
	@Test
	public void testFive() {
			assertEquals(0, new TaumAndBday().printCost(1, 1,  1, 0, 0));
	}
	
//	10 10
//	1 1 1
	@Test
	public void testSix() {
			assertEquals(20, new TaumAndBday().printCost(10, 10,  1, 1, 1));
	}	
	
//	5 9
//	2 3 4
	@Test
	public void testSeven() {
			assertEquals(37, new TaumAndBday().printCost(5, 9,  2, 3, 4));
	}
//	3 6
//	9 1 1
	@Test
	public void testEight() {
			assertEquals(12, new TaumAndBday().printCost(3, 6,  9, 1, 1));
	}
//	7 7
//	4 2 1
	@Test
	public void testNine() {
			assertEquals(35, new TaumAndBday().printCost(7, 7,  4, 2, 1));
	}
	//	3 3
//	1 9 2
	@Test
	public void testTen() {
			assertEquals(12, new TaumAndBday().printCost(3, 3,  1, 9, 2));
	}
	
	// 1 0
	// 1 0 0
	@Test
	public void testEleven() {
			assertEquals(0, new TaumAndBday().printCost(0, 0,  0, 0, 0));
	}
}
