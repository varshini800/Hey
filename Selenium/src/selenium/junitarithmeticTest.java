package selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junitarithmeticTest {
	junitarithmetic a=new junitarithmetic();
	@Test
	void testadd() 
	{
	assertEquals("pass", 15, a.add(10,5));
	assertEquals("pass", 25, a.add(10,15));
	assertEquals("pass", 11, a.add(10,1));
	}
	@Test
	void testsub() 
	{
	assertEquals("pass", 8, a.sub(10,2));
	assertEquals("pass", 10, a.sub(15,5));
	assertEquals("pass", 11, a.sub(15,4));
	}
	@Test
	void testmul() 
	{
	assertEquals("pass", 20, a.mul(10,2));
	assertEquals("pass", 25, a.mul(5,5));
	assertEquals("passs", 60, a.mul(15,4));
	}
	void testdiv() 
	{
	assertEquals("pass",5, a.div(10,2));
	assertEquals("pass", 1, a.div(5,5));
	assertEquals("pass", 5, a.div(15,3));
	}
	@Test
	void testaddfail()
	{
	assertEquals("error", 17, a.add(10,5));
	}
	@Test
	void testsubfail() 
	{
	assertEquals("error", 18, a.sub(10,2));
	}
	@Test
	void testmulfail() 
	{
	assertEquals("error", 30, a.mul(10,2));
	}
	@Test
	void testdivfail() 
	{
	assertEquals("error", 30, a.div(10,2));
	}
}
