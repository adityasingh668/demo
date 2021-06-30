import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Web_table_filter {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("rice");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//tr//td[1]"));
		
		List<WebElement> filteredValue = veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		long ls = veggies.stream().filter(s->s.getText().contains("Rice")).count();
		System.out.println(ls);
		
		Assert.assertEquals(veggies.size(), filteredValue.size());
		

	}

}
