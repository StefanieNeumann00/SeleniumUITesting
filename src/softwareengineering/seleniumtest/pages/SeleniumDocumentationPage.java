package softwareengineering.seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SeleniumDocumentationPage extends SeleniumBasePage{

	private static By LocatingElementsListElementXPath = By.id("m-documentationwebdriverlocating_elements");
	private static By LocatingElementsHeaderXPath = By.xpath("//*[text()='Locating elements']");
	
	public static void clickLocatingElements()
	{
		driver.findElement(LocatingElementsListElementXPath).click();
	}
	
	public static boolean findLocatingElementsHeader()
	{
		try
		{
			driver.findElement(LocatingElementsHeaderXPath);
		}
		catch (NoSuchElementException e)
		{
			return false;
		}
		return true;
	}
}
