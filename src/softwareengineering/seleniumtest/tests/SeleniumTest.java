package softwareengineering.seleniumtest.tests;

import java.util.logging.Level;
import java.util.logging.Logger;

import softwareengineering.seleniumtest.pages.SeleniumBasePage;
import softwareengineering.seleniumtest.pages.SeleniumDocumentationPage;
import softwareengineering.seleniumtest.pages.SeleniumHomePage;
import softwareengineering.seleniumtest.pages.SeleniumSearchPage;

public class SeleniumTest {

	static Logger logger = Logger.getLogger(SeleniumTest.class.getName());

	public static void navigateToLocatingElementsDocumentationTest() {

		logger.log(Level.INFO, "starting navigateToLocatingElementsDocumentationTest test case");

		SeleniumHomePage.navigateTo("https://www.selenium.dev/");
		SeleniumHomePage.clickWebDriverReadMore();
		SeleniumDocumentationPage.clickLocatingElements();
		
		boolean elementFound = SeleniumDocumentationPage.findLocatingElementsHeader();

		assert elementFound == true: "Test case failed due to assertion error: Could not find 'Locating elements' header.";

		logger.log(Level.INFO, "finished test case navigateToLocatingElementsDocumentationTest");
	}

	public static void searchFieldTest(String input) {

		SeleniumHomePage.navigateTo("https://www.selenium.dev/");
		SeleniumBasePage.search(input);
		
		boolean elementFound = SeleniumSearchPage.findSearchResultHeader();
		assert  elementFound == true: "Test case failed: Could not find 'Search Result' header.";
	}

	public static void searchwithNoInput() {

		logger.log(Level.INFO, "starting searchwithNoInput test case");

		searchFieldTest("");

		logger.log(Level.INFO, "finished test case searchwithNoInput");
	}

	public static void searchWithLongInput() {

		logger.log(Level.INFO, "starting searchWithLongInput test case");

		searchFieldTest(
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

		logger.log(Level.INFO, "finished test case searchWithLongInput");
	}

	public static void searchWithNumberInput() {

		logger.log(Level.INFO, "starting searchWithNumberInput test case");

		searchFieldTest("368789798579");

		logger.log(Level.INFO, "finished test case searchWithNumberInput");
	}
}
