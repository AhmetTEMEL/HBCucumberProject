package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.ExtentCucumberHelper;

@CucumberOptions(
        plugin = {"pretty", "html:target/hepsiburada/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = "src/test/resources/FeatureFiles/AddToCart.feature",
        glue = "steps",
        tags = {"@Add-To-Cart-Authanticated"}
)
public class AddToCartTest {
    @BeforeClass
    public static void setup() {
        ExtentCucumberHelper.setUpFormatter();
    }

    @Test
    public void runCukes(){
        new TestNGCucumberRunner(getClass()).runCukes();
    }
}