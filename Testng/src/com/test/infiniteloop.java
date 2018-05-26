package com.test;

import org.testng.annotations.Test;

public class infiniteloop {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void expect() {
		String h ="200u";
		Integer.parseInt(h);
	}
}
