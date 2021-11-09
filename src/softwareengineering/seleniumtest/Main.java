package softwareengineering.seleniumtest;

import softwareengineering.seleniumtest.tests.SeleniumTest;

public class Main {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Stefanie\\Documents\\DHBW\\Vorlesungen\\Software Engineering\\UI Testing\\Installations\\chromedriver_win32\\chromedriver.exe");
		SeleniumTest.navigateToLocatingElementsDocumentationTest();
		SeleniumTest.searchWithLongInput();
		SeleniumTest.searchwithNoInput();
		SeleniumTest.searchWithNumberInput();
	}
}
