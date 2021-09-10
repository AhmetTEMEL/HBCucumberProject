package utils;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

    //initialize webdriver
    public WebDriver driver;
    public static ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>();

    //initialize timeouts
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;

    protected void openPage(String url) {
    	System.out.println(url);
        getDriver().get(url);
    }

    public static void setWebDriver(WebDriver driver) {
        webdriver.set(driver);
    }

    public static WebDriver getDriver() {
        return webdriver.get();
    }

    protected void startWebDriver() {
        WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        setWebDriver(driver);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    public  void tearDown() {
        if (getDriver() != null) {
            getDriver().close();
            getDriver().quit();
        }
    }

    public  void waitForPageToLoad()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /*    private  SeleniumDriver() {

        WebDriverManager.chromedriver().setup();

    	driver = new ChromeDriver();
        setWebDriver(driver);
        getDriver().manage().window().maximize();

        waitDriver = new WebDriverWait(getDriver(), TIMEOUT);
        getDriver().manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        String window=getDriver().getWindowHandle();
        System.out.println("Window ->"+window);

    }*/
    /*    public static void setUpDriver() {
       if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();

    }*/
 /*   public static WebDriverWait getWebDriverWait() {
        return waitDriver;
    }*/
}
