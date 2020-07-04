package com.fdmgroup;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;

	// Has to execute even before instance is created
	@BeforeAll
	// static- only way you can get framework even before initialize class
	// You can run static before instance is created
	static void beforeAllInit() {
		System.out.println("This needs to run before all");
	}

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@Test
	void test_Multiply() {
		// Act
		mathUtils.multiply(2, 5);
		// Assert
		int expected = 10;
		int actual = mathUtils.multiply(2, 5);
		assertEquals(expected, actual, "The add method should add two numbers");
	}

	@Test
	void test_Divide() {
		// Act and Assert
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(5, 0), "Divide by zero should throw");
	}

	@Test
	void test_ComputeCircleRadius() {
		// Act
		mathUtils.computeCircleArea(10);
		// Assert
		assertEquals((Math.PI * 100), mathUtils.computeCircleArea(10), "Should return right circle area");
	}

	@AfterEach
	void cleanUp() {
		System.out.println("Cleaned up after a test");
	}

}