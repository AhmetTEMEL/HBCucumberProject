package steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utils.SeleniumDriver;

public class AfterActions extends SeleniumDriver{

    @After
    public void tearDown(Scenario scenario) {
    	

    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
          
         }
         tearDown();
    }
}
