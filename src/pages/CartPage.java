package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;
	WebElement productName;
	WebElement productQuantityBox;
	
	
	public CartPage(WebDriver driver) {
		super();
		this.driver = driver;
	}


	public WebElement getProductName() {
		return this.driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[3]"));
	}


	public WebElement getProductQuantityBox() {
		return this.driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input"));
	}
	
	public String productName () {
		return this.getProductName().getText();
	}
	
	public int productQuantity() {
		String numberString = this.getProductQuantityBox().getText();
		int numberInt = Integer.parseInt(numberString);
		return numberInt;
	}
}
