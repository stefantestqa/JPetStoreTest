package tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.AngelFishPage;
import pages.CartPage;
import pages.FishPage;
import pages.MainPage;
import pages.SignInPage;
import pages.WelcomePage;

public class BaseTest {
	
	WebDriver driver;
	WelcomePage welcomePage;
	SignInPage signInPage;
	MainPage mainPage;
	CartPage cartPage;
	FishPage fishPage;
	AngelFishPage angelFishPage;
	ExcelReader	excelReader;
	String webSiteUrl;
	
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
	this.driver = new ChromeDriver();
	excelReader = new ExcelReader(new File("data/JPSTestPlan.xlsx"));
	welcomePage = new WelcomePage(driver);
	mainPage = new MainPage(driver);
	signInPage = new SignInPage(driver);
	fishPage = new FishPage(driver);
	angelFishPage = new AngelFishPage(driver);
	cartPage = new CartPage(driver);
	driver.manage().window().maximize();
	webSiteUrl = excelReader.returnStringDataFromExcel("log in", 4, 2);
	
	}
	
	@AfterClass
	public void afterClass() {
		this.driver.close();

	}
	public void logInValidCredentials() throws InterruptedException {
		String username = excelReader.returnStringDataFromExcel("log in", 7, 2);
		String password = excelReader.returnStringDataFromExcel("log in", 8, 2);
		
		signInPage.insertUsername(username);
		signInPage.getPasswordInputField().clear();
		signInPage.insertPassword(password);
		signInPage.clickOnLogInButton();
		
	}
}	