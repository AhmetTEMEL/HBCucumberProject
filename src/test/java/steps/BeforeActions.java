package steps;

import cucumber.api.java.Before;
import utils.SeleniumDriver;

public class BeforeActions extends SeleniumDriver {

	@Before
    public void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
        startWebDriver();
    }
}
