package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FishPage;

public class AddToCartTest extends BaseTest {
	
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
	public void addOneProductToCart() throws InterruptedException {
		String actualText;
		String expectedText = excelReader.returnStringDataFromExcel("add product to cart", 7, 4);
		
		
		
		super.logInValidCredentials();
		mainPage.clickOnFishsIcon();
		fishPage.clickOnAngelFishButton();
		angelFishPage.clickOnTheLargeAngelFishAddButton();
		actualText = cartPage.productName();
		assertEquals(actualText, expectedText);
		
	}
	
}