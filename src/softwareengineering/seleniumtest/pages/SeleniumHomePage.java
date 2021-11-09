package softwareengineering.seleniumtest.pages;

import org.openqa.selenium.By;

public class SeleniumHomePage extends SeleniumBasePage{
	
	private static By WebDriverReadMoreElementXPath = By.xpath("/html/body/div/main/section[2]/div/div/div[1]/div/div[2]/div/a");
	
	public static void clickWebDriverReadMore()
	{
		driver.findElement(WebDriverReadMoreElementXPath).click();
	}

}
