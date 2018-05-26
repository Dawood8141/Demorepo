package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	
	@Test(invocationCount=7)
			
	public void Inb() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	
	
	
	
	
	
}
