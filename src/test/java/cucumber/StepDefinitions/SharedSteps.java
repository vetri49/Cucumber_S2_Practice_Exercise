package cucumber.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedSteps {
    private WebDriver driver;

    public SharedSteps() {
       
    }

    public WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com");
    }

    @After
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
