
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

		public class Remote_test {

		public static void main(String[] args) throws MalformedURLException {
			
		//Automated- chrome, firefox, ie, safari

		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		
		//Web driver driver=new ChromeDriver();
		WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		driver.manage().window().maximize();
		driver.get("http://rediff.com");



		}

	}


