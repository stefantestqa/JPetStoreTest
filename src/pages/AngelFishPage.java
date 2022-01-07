package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AngelFishPage {
	WebDriver driver;
	WebElement smallAngelFish;
	WebElement largeAngelFish;
	WebElement addSmallAngelFishToCartButton;
	WebElement addLargeAngelFishToCartButton;
	
	
	
	public AngelFishPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getSmallAngelFish() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
	}
	public WebElement getLargeAngelFish() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
	}
	public WebElement getAddSmallAngelFishToCartButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a"));
	}
	public WebElement getAddLargeAngelFishToCartButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
	}
	
	public void clickOnTheSmallAngelFishAddButton() throws InterruptedException {
		this.getAddSmallAngelFishToCartButton().click();
		Thread.sleep(1000);
	}
	
	public void clickOnTheLargeAngelFishAddButton() throws InterruptedException{
		this.getAddLargeAngelFishToCartButton().click();
		Thread.sleep(1000);
	}
	
	
}

