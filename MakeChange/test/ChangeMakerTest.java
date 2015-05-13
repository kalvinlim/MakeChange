import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
		
		List<Integer> actual = ChangeMaker.makeChange(coins, amount);

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
		
		List<Integer> actual = ChangeMaker.makeChange(coins, amount);
				
		assertEquals(expected, actual);
	}

}
