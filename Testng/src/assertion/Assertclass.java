package assertion;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertclass {
	
	
	
	
	@Test
	
	public void ssert() {
		
		
		SoftAssert softAssert= new SoftAssert();
		
		System.out.println("A");
		softAssert.assertEquals(true, false);
		
		System.out.println("c");
		System.out.println("d");
		System.out.println("e");
		System.out.println("f");
		softAssert.assertAll();
		
		
	}
	
	

}
