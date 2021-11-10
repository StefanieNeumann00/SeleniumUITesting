package softwareengineering.seleniumtest;

import softwareengineering.seleniumtest.tests.SeleniumTest;

public class Main {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		SeleniumTest.navigateToLocatingElementsDocumentationTest();
		SeleniumTest.searchWithLongInput();
		SeleniumTest.searchwithNoInput();
		SeleniumTest.searchWithNumberInput();
	}
}
