package com.example.lib2;

import org.junit.Assert;
import org.junit.Test;

public class Lib2Test {

	@Test
	public void testMultiply1() {
		Assert.assertEquals(35, new Lib2().multiply(5, 7));
	}
	@Test
	public void testMultiply2() {
		Assert.assertEquals(42, new Lib2().multiply(7, 6));
	}
}
