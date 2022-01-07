package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FishPage {
	WebDriver driver;
	WebElement angelFish;
	WebElement tigerShark;
	WebElement koiFish;
	WebElement goldFish;
	
	
	
	public FishPage(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public WebElement getAngelFish() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));

	}	

	public WebElement getTigerShark() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a"));
	}



	public WebElement getKoiFish() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[4]/td[1]/a"));
	}



	public WebElement getGoldFish() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[5]/td[1]/a"));
	}
	
	public void clickOnAngelFishButton() throws InterruptedException {
		this.getAngelFish().click();
		Thread.sleep(1000);
	}
	
	public void clickOnTigerFishButton() throws InterruptedException {
		this.getTigerShark().click();
		Thread.sleep(1000);
	}
	
	public void clickOnKoiFishButton() throws InterruptedException {
		this.getKoiFish().click();
		Thread.sleep(1000);
	}
	
	public void clickOnGoldFishButton() throws InterruptedException {
		this.getGoldFish().click();
		Thread.sleep(1000);
	}
}
