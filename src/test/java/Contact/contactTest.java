package Contact;

import org.testng.annotations.Test;

public class contactTest {
	
	
	
	@Test(groups = {"smoke","regression"})
	public void getData_Test() {
//		String URL = System.getProperty("url");
//		String BROWSER = System.getProperty("browser");
//		String USERNAME = System.getProperty("username");
//		String PASSWORD = System.getProperty("password");
//		System.out.println(URL);
//		System.out.println(BROWSER);
//		System.out.println(USERNAME);
//		System.out.println(PASSWORD);
		System.out.println("Hii");
		
	}

	@Test(groups = "smoke")
	public void smokeTest() {
		System.out.println("Smoke Test for contact is executed.....");
		
		
	}
	@Test(groups = "regression")
	public void regressionTest() {
		System.out.println("Regression Test for contact is executed.....");
		
	}
}
