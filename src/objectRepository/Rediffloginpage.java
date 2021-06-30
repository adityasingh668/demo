package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {

	WebDriver driver;
	public Rediffloginpage (WebDriver driver) {
		this.driver=driver;
	}
	
	By Username = By.cssSelector("[name=login]");
	By Password = By.id("password");
	By Signin = By.xpath("//input[@type='submit']");
	By keepmesignedin = By.xpath("//input[@type='checkbox']");
	By loginerror = By.cssSelector("[class='div_login_error']");
	

	public WebElement EmailId() {
		return driver.findElement(Username);
	}
	
	public WebElement Password() {
		return driver.findElement(Password);
	}
	
	public WebElement Login() {
		return driver.findElement(Signin);
	}
	
	public WebElement keepmesignedin() {
		return driver.findElement(keepmesignedin);
	}
	
	public WebElement loginerror() {
		return driver.findElement(loginerror);
	}
	

}
