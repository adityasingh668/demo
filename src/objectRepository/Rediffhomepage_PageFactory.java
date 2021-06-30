package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediffhomepage_PageFactory {

	WebDriver driver;
	public Rediffhomepage_PageFactory (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="[class='signin']")
	WebElement Signin;
	
	@FindBy(css="[class='vdicon']")
	WebElement Videoicon;
	
	public WebElement Signin() {
		return Signin;
	}
	public WebElement Videoicon() {
		return Videoicon;
	}
	
	

}
