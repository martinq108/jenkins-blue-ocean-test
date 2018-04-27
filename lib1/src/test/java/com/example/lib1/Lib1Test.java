package com.example.lib1;

import org.junit.Assert;
import org.junit.Test;

public class Lib1Test {

	@Test
	public void testAdd1() {
		Assert.assertEquals(3, new Lib1().add(1, 2));
	}
	@Test
	public void testAdd2() {
		Assert.assertEquals(11, new Lib1().add(7, 4));
	}
}
