package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTests {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception{
	}
	
	@After
	public void tearDown() throws Exception {
	
	}


	protected double side1, side2, side3;

	// assigning the values
	protected void setUp1() {
		side1=6;
		side2=12;
		side3=10;

	}

	// test methods
	@Test
	public void testGetArea() {
		double semiPerimeter = (side1+side2+side3)/2 ;
		double a = (semiPerimeter*(semiPerimeter-side1)*(semiPerimeter - side2)*(semiPerimeter - side3));
		double result = Math.sqrt(a);
		assertTrue(result == 29.33);

	}

	@Test
	public void testGetPerimeter() {
		double result = (side1 + side2 + side3);
		assertTrue(result == 28);

	}
	protected double sideONE, sideTWO, sideTHREE;

	// assigning the values
	protected void setUp2() {
		sideONE=24;
		sideTWO=18;
		sideTHREE=16;

	}
	@Test
	public void testGetArea2(){
		double semiPerimeter = (sideONE+sideTWO+sideTHREE)/2 ;
		double a = (semiPerimeter*(semiPerimeter-sideONE)*(semiPerimeter - sideTWO)*(semiPerimeter - sideTHREE));
		double result = Math.sqrt(a);
		assertTrue(result == 143.996);
	}
	@Test
	public void testGetPerimeter2(){
		double result = (sideONE + side2 + side3);
		assertTrue(result == 58);
	}
	protected double sideOne, sideTwo, sideThree;

	// assigning the values
	protected void setUp3() {
		sideOne=3;
		sideTwo=6;
		sideThree=5;

	}
	@Test
	public void testGetArea3(){
		double semiPerimeter = (sideOne+sideTwo+sideThree)/2 ;
		double a = (semiPerimeter*(semiPerimeter-sideOne)*(semiPerimeter - sideTwo)*(semiPerimeter - sideThree));
		double result = Math.sqrt(a);
		assertTrue(result == 7.483);
	}
	@Test
	public void testGetPerimeter3(){
		double result = (sideOne + sideTwo + sideThree);
		assertTrue(result == 14);
	}
	protected double Side1, Side2, Side3;

	// assigning the values
	protected void setUp4() {
		Side1=13;
		Side2=12;
		Side3=11;
	}


	@Test
	public void testGetArea4(){
		double semiPerimeter = (Side1+Side2+Side3)/2 ;
		double a = (semiPerimeter*(semiPerimeter-Side1)*(semiPerimeter - Side2)*(semiPerimeter - Side3));
		double result = Math.sqrt(a);
		assertTrue(result == 61.482);
	}
	@Test
	public void testGetPerimeter4(){
		double result = (Side1 + Side2 + Side3);
		assertTrue(result == 36);
	}
}
	