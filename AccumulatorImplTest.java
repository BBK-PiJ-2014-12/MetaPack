package MetaPack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccumulatorImplTest {
	Accumulator accumulator;
	
	@Before
	public void setUp() {
		accumulator = new AccumulatorImpl();
	}
	
	@Test 
	public void accumulate() {
		int number = accumulator.accumulate(1, 2, 3, 4, 5);
		int expected = 15;
		assertEquals(expected, number);
	}
	
	@Test
	public void example() {
		int firstSum = accumulator.accumulate(1, 2, 3);
		int secondSum = accumulator.accumulate(4);
		int total = accumulator.getTotal();
		int expected = 10;
		assertEquals(expected, total);
	}

	@Test
	public void negative() {
		int firstSum = accumulator.accumulate(1, 2, 3);
		int secondSum = accumulator.accumulate(-1, -2, -3);
		int total = accumulator.getTotal();
		int expected = 0;
		assertEquals(expected, total);
	}
	
	@Test
	public void single() {
		int number = accumulator.accumulate(12);
		int total = accumulator.getTotal();
		int expected = 12;
		assertEquals(expected, total);
	}
	
	@Test
	public void empty() {
		int firstSum = accumulator.accumulate();
		int secondSum = accumulator.accumulate();
		int total = accumulator.getTotal();
		int expected = 0;
		assertEquals(expected, total);
	}
	
	@Test
	public void reset() { 
		int firstSum = accumulator.accumulate(11, 22, 33);
		int secondSum = accumulator.accumulate(44, 55);
		int thirdSum = accumulator.accumulate(66, 77, 88, 99);
		int total = accumulator.getTotal();
		int expected = 495;
		assertEquals(expected, total);
		
		accumulator.reset();
		total = accumulator.getTotal();
		expected = 0;
		assertEquals(expected, total);
	}
}
