package Organisation;

import org.testng.annotations.Test;

public class OrganisationTest {
	
	@Test(groups = "smoke")
	public void smokeTest() {
		System.out.println("Smoke Test for organisation is executed.....");
		
	}
	@Test(groups = "regression")
	public void regressionTest() {
		System.out.println("Regression Test for organisation is executed.....");
		
	}

}
