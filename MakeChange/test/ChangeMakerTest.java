import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class ChangeMakerTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEasy() {		
		List<Integer> coins = new ArrayList<>();
		coins.add(25);
		coins.add(1);
		
		final int amount = 101;
				
		List<Integer> expected = new ArrayList<>();
		expected.add(25);
		expected.add(25);
		expected.add(25);
		expected.add(25);
		expected.add(1);
		TreeMap<Integer, List<Integer>> solutionSet = new TreeMap<>();
		List<Integer> actual = ChangeMaker.makeChange(coins, amount, solutionSet);

		assertEquals(expected, actual);		
	}
	@Test
	public void testOptimal() {	
		List<Integer> coins = new ArrayList<>();
		coins.add(25);
		coins.add(10);
		coins.add(7);
		coins.add(5);
		coins.add(1);
		
		final int amount = 14;
			
		List<Integer> expected = new ArrayList<>();
		expected.add(7);
		expected.add(7);
		
		System.out.println("Making change for: " + amount + " cents, using the following coins:" + coins);
		
		TreeMap<Integer, List<Integer>> solutionSet = new TreeMap<>();
		List<Integer> actual = ChangeMaker.makeChange(coins, amount, solutionSet);
		
		
		System.out.println("Solution set: " + solutionSet);

		System.out.println("Actual: " + actual);
		System.out.println("Expected: " + expected);
		
		assertEquals(expected, actual);
		
	}

}
