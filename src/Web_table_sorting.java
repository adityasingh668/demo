import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Web_table_sorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Test whether the table is sorted or not?
		driver.findElement(By.cssSelector("th[aria-label*='Veg/fruit name']")).click();
		
		List<WebElement> elementList = driver.findElements(By.xpath("//tbody//tr//td[1]"));
		
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		
		List<String> price;
		
		do {
		List<WebElement> newElementList = driver.findElements(By.xpath("//tbody//tr//td[1]"));
		price = newElementList.stream().filter(s->s.getText().contains("Wheat")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) {
			driver.findElement(By.cssSelector("[aria-label=Next]")).click();
		}
		}while(price.size()<1);
		
			
	}
	
	private static String getVeggiePrice(WebElement s) {
		
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
