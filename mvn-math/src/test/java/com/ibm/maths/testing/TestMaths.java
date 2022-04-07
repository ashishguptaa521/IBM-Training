package com.ibm.maths.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.math.Maths;

public class TestMaths {

	private static Maths maths;

	@BeforeAll
	public static void setup() {
		maths = new Maths();
	}

	@Test
	public void testSum() {
		assertEquals(15, maths.add(10, 5));
	}

	@Test
	public void testSubs() {
		assertEquals(5, maths.subs(10, 5));
	}

	@Test
	public void testDiv() {
		assertEquals(3, maths.div(9, 3));
	}

	@Test
	public void testZeroDiv() throws ArithmeticException {
		assertThrows(ArithmeticException.class, () -> maths.div(2, 0));
	}

	@Test
	public void testSquare() {
		assertEquals(16, maths.sqr(4));
	}

	@Test
	public void testWrongSquare() {
		assertNotEquals(10, maths.sqr(3));
	}
}
