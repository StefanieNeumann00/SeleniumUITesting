package softwareengineering.seleniumtest.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasePage {
	
	protected static WebDriver driver = new ChromeDriver();
	private static By searchFieldXPath = By.xpath("//*[@id=\"main_navbar\"]//input");
	
	@SuppressWarnings("deprecation")
	public static void navigateTo(String url)
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to(url);
	}
	
	public static void search(String input)
	{
		WebElement searchField = driver.findElement(searchFieldXPath);
		searchField.sendKeys("input");
		searchField.sendKeys(Keys.ENTER);
	}

}
