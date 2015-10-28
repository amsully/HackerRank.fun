package implementation;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

public class TheGridSearchTest {


	String[] testBig = {"111","111","111"};
	
	String[] testSmall1 = {"11","11","11"}; // Yes
	String[] testSmall2 = {"11","12","11"}; // No
	String[] testSmall3 = {"12","11","11"}; // No
	String[] testSmall4 = {"11","11","21"}; // No
	String[] testSmall5 = {"11","11"}; // Yes
	String[] testSmall6 = {"11"}; // Yes
	String[] testSmall7 = {"1"}; // Yes
	
	
	String[] simple = {"1"};
	
	String[] simple2 = {"11"};
	
	String[] simple3 = {"333"};
	
	@Test
	public void testTest() {

		
		assert(true);
	}
	
	@Test
	public void testGrid() {
	
		assertEquals(true, new Solver().subMatrix(testSmall1, testBig));
	}	
	@Test
	public void testGrid2() {
	
		assertEquals(false, new Solver().subMatrix(testSmall2, testBig));
	}	
	@Test
	public void testGrid3() {
	
		assertEquals(false, new Solver().subMatrix(testSmall3, testBig));
	}	
	@Test
	public void testGrid4() {
	
		assertEquals(false, new Solver().subMatrix(testSmall4, testBig));
	}	
	@Test
	public void testGrid5() {
	
		assertEquals(true, new Solver().subMatrix(testSmall5, testBig));
	}	
	@Test
	public void testGrid6() {
	
		assertEquals(true, new Solver().subMatrix(testSmall6, testBig));
	}	
	@Test
	public void testGrid7() {
	
		assertEquals(true, new Solver().subMatrix(testSmall7, testBig));
	}	
	
	@Test
	public void testSimple() {
	
		assertEquals(true, new Solver().subMatrix(simple, simple));
	}		
	@Test
	public void testSimple2() {
	
		assertEquals(true, new Solver().subMatrix(simple2, simple2));
	}	
	@Test
	public void testSimple3() {
	
		assertEquals(true, new Solver().subMatrix(simple3, simple3));
	}	
}
