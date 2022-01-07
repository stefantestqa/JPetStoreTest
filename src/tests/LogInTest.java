package tests;

import static org.testng.Assert.assertEquals;

import javax.print.DocFlavor.INPUT_STREAM;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
	@BeforeMethod
	public void name() throws InterruptedException {
		super.driver.navigate().to(webSiteUrl);
		Thread.sleep(1000);
		welcomePage.clickEnterTheStore();
		Thread.sleep(1000);
		mainPage.clickOnSignInButton();
		Thread.sleep(1000);
		
	}
	@Test
	public void logInValidCredentials() throws InterruptedException {
		String username = excelReader.returnStringDataFromExcel("log in", 7, 2);
		String password = excelReader.returnStringDataFromExcel("log in", 8, 2);
		String expectedText = excelReader.returnStringDataFromExcel("log in", 12, 3);
		String actualtext;
		
		signInPage.insertUsername(username);
		signInPage.getPasswordInputField().clear();
		signInPage.insertPassword(password);
		signInPage.clickOnLogInButton();
		actualtext = mainPage.getGreetingsMessageText();
		assertEquals(actualtext, expectedText);
		
	}
}
