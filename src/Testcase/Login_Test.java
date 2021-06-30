package Testcase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectRepository.Rediffhomepage_PageFactory;
import objectRepository.Rediffloginpage;

public class Login_Test {
	
	@Test
	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");

		Rediffhomepage_PageFactory rh = new Rediffhomepage_PageFactory(driver);
		rh.Videoicon().click();
		driver.navigate().back();
		rh.Signin().click();
		
		Rediffloginpage rd = new Rediffloginpage(driver);
		
		rd.EmailId().sendKeys("adityasingh1728@gmail.com");
		rd.Password().sendKeys("password");
		rd.keepmesignedin().click();
		rd.Login().click();
		String a =rd.loginerror().getText();
		System.out.println(a);
		
	}
		
	}


