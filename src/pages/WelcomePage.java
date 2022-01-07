package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomePage {
	WebDriver driver;
	WebElement enterTheStoreButton;
	
	
	
	public WelcomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEnterTheStoreButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a"));
	}
	
	public void clickEnterTheStore() throws InterruptedException {
		this.getEnterTheStoreButton().click();
		Thread.sleep(1000);
	}
	

}

