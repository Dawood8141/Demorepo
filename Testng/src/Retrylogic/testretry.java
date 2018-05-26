package Retrylogic;

import org.junit.Assert;
import org.testng.annotations.Test;

public class testretry {
	
	
	@Test(retryAnalyzer=Retrylogic.retryanalyzer.class)
	public void remit() {
		Assert.assertEquals(true, false);
	}
	
	
	
	
	
	

}
