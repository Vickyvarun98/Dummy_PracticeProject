package Contact;

import org.testng.annotations.Test;

public class contactTest {

	@Test(groups = "smoke")
	public void smokeTest() {
		System.out.println("Smoke Test for contact is executed.....");
		
	}
	@Test(groups = "regression")
	public void regressionTest() {
		System.out.println("Regression Test for contact is executed.....");
		
	}
}
