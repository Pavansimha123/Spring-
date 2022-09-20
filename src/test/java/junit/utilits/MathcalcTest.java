package junit.utilits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathcalcTest {

	Mathcalc calc;
	
	@BeforeAll
	 static public void beforealll() {
		System.out.println("this gonna run before all");
	}
	
	
	@BeforeEach
	public void init() 
	{     
          calc= new Mathcalc();
	}
	
	@AfterEach
	public void clean() {
		System.out.println("cleaning up----");
	}
	@Test
	@DisplayName("testing add method")
	void testadd() {
		
		//fail("Not yet implemented");
		//System.out.println("This Test Ran");
		
		int expectedoutput= 2;
		int actualoutput=calc.add(1, 1);
		
		assertEquals(expectedoutput, actualoutput);
	}
	@Test
	void testDivide()
	{
		//Mathcalc calc= new Mathcalc();
		assertThrows(ArithmeticException.class, ()->calc.Divide(1, 0));
	
	}
	
	@Test
	void testcomputercircleradius()
	{
		//Mathcalc calc= new Mathcalc();
		assertEquals(314.1592653589793, calc.computercircleradius(10));
	}
	
	@Test
	void testmultiply() {
		
		assertAll(()-> assertEquals(4, calc.multiply(2, 2)),
				()-> assertEquals(6, calc.multiply(3, 2)),
				()-> assertEquals(64, calc.multiply(8, 8))
			
				);
		
	}
	
	@Test
	void testfact() 
	{
		assertEquals(120, calc.fact(5));
	}
	

}
