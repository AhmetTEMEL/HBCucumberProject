package steps;

import cucumber.api.java.Before;
import utils.SeleniumDriver;

import static utils.SeleniumDriver.dr;
import static utils.SeleniumDriver.getDriver;

public class BeforeActions extends SeleniumDriver {

	@Before
    public void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
        startWebDriver();
    }
}
