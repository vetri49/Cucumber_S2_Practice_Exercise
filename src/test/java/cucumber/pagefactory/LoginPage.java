package cucumber.pagefactory;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    By login = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    By username = By.id("Email");
    By password = By.id("Password");
    By button = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
    By userid = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    private String Username = "xemo@gmail.com";
    private String Password = "cnci898fnf9";

    public LoginPage() {
       
    }
    public void setDriver(WebDriver driver) {
    	this.driver=driver;
    }

    public void onLoginPage() {
        driver.findElement(login).click();
    }

    public void enterCredentials() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(username).sendKeys(Username);
        driver.findElement(password).sendKeys(Password);
    }

    public void verifyLogin() {
        driver.findElement(button).click();
        String expectResult = driver.findElement(userid).getText();
        assertEquals(Username, expectResult);
    }
}
