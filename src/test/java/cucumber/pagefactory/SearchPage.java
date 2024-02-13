package cucumber.pagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
	public WebDriver driver;
	By searchBox=By.xpath("//*[@id=\"small-searchterms\"]");
	By searchButton=By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]");
    By login = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    By username = By.id("Email");
    By password = By.id("Password");
    By loginButton = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");	
    By Title=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div/div/div[1]/a");
	
    private String Username = "xemo@gmail.com";
    private String Password = "cnci898fnf9";
    
	public SearchPage() {
		super();
	}
	
	public void onLoginPage() {
		driver.findElement(login).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(username).sendKeys(Username);
        driver.findElement(password).sendKeys(Password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.findElement(loginButton).click();
	}
	public void searchProduct(String product) {
	
		driver.findElement(searchBox).sendKeys(product);
		driver.findElement(searchButton).click();
	}
	
	public void verifyTitle(String expectedTitle) {
		driver.findElement(Title).isDisplayed();
		
	}

}
