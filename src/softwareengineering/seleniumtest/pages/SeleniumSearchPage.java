package softwareengineering.seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SeleniumSearchPage extends SeleniumBasePage
{
	private static By searchResultHeaderXPath = By.xpath("//*[text()='Search Results']");
	
	public static boolean findSearchResultHeader()
	{
		try
		{
			driver.findElement(searchResultHeaderXPath);
		}
		catch (NoSuchElementException e)
		{
			return false;
		}
		return true;
	}
}
