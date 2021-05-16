package aufgabe4;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

import org.junit.jupiter.api.Test;

class TestDrivenDevelopmentTest {
	
	//int [] nums = {1};

	@Test
	void testLaenge1() {
		//given (preparation)
		Random r = new Random();
		int a = r.nextInt();
		int [] eins = {a};
		
		//when (execution)
		int ergebnis = TestDrivenDevelopment.singleNumber(eins);
		
		//then (verification)
		assertEquals(ergebnis,a);
		}
	
	@Test 
	void testLaenge3()
	{
		//given (preparation)
		Random r = new Random();
		int a = r.nextInt();
		int b = r.nextInt();
		
		int v = r.nextInt(2);
		if (v < 1)
		{
			v = a;
		}
		else v = b;
		
		int [] drei = {a,b,v};
		
		//when (execution)
		int ergebnis = TestDrivenDevelopment.singleNumber(drei);
		
		//then (verification)
		if (v == a)
		{
			assertEquals(ergebnis,b);
		}
		else assertEquals(ergebnis,a);
		
	}
		@Test
		void testLaenge13()
		{
			//given (preparation)
			int [] array13 = {2,3,7,1,9,6,4,1,2,3,9,7,6};
			//when (execution)
			int ergebnis = TestDrivenDevelopment.singleNumber(array13);
			
			//then (verification)
				assertEquals(ergebnis,4);
		}
		
		@Test
		void testLaenge15()
		{
			//given (preparation)
			int [] array13 = {22,33,72,11,94,61,48,11,22,33,94,72,48,52,52};
			//when (execution)
			int ergebnis = TestDrivenDevelopment.singleNumber(array13);
			
			//then (verification)
				assertEquals(ergebnis,61);
		}
}
