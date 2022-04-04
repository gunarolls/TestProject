package org.testng;

import org.testng.annotations.Test;

public class ClassA {

	@Test
	private void tc1() {
		System.out.println("Method 1");
	}

	@Test
	private void tc2() {
		System.out.println("Method 2");
	}

	@Test
	private void tc3() {
		Assert.assertEquals("verify login", false);
		System.out.println("Method 3");

	}

}
