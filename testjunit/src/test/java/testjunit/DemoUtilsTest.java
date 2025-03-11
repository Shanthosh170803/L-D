package testjunit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoUtilsTest {
	DemoUtils d;
	@BeforeClass
	public static void setUpClass() {
		System.out.println("setupClass() method is called");
	}
	
	@Before
	public void setUp() {
		System.out.println("setup() method is called");
		d=new DemoUtils();
	}
	@Test
	public void testAdd() {
		System.out.println("Add() method is called");
		assertEquals(22,d.add(12, 10));
	}
	@Test
	public void testMul() {
		System.out.println("Mul() method is called");
		assertEquals(50,d.mul(5, 10));
	}
	@Test
	public void testEven() {
		//assertTrue("Enter a even number",d.isEven(17));
		assertFalse("Enter a even number",d.isEven(19));
	}
	@Test
	public void testgetMessage() {
		System.out.println("getMessage() method is called");
		assertNull(d.getMessage());
	}
	@Test
	public void testgetNumbers() {
		int[] myarr= {1,2,3};
		assertArrayEquals(myarr,d.getNumbers());
	}
	@Test(expected = RuntimeException.class)
	public void testThrowException() {
		System.out.println("throwException()");
		d.throwException();
	}
	@After
	public void tearDown() {
		System.out.println("tearDown() called");
		d=null;
	}
	@AfterClass
	public static void tearDownClass() {
		System.out.println("tearDownClass() called");
	}
}
