package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement cartIcon;
	WebElement signInButton;
	WebElement greetingsMessage;
	WebElement fishIcon;
	WebElement dogsIcon;
	WebElement catsIcon;
	WebElement reptilesIcon;
	WebElement birdsIcon;
	WebElement searchInputField;
	WebElement searchButton;
	
	
	
	
	
	public MainPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getCartIcon() {
		return this.driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]/img"));
	}
	public WebElement getSignInButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]"));
	}
	public WebElement getFishIcon() {
		return this.driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[2]"));
	}
	public WebElement getDogsIcon() {
		return this.driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[3]"));
	}
	public WebElement getCatsIcon() {
		return this.driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[5]"));
	}
	public WebElement getReptilesIcon() {
		return this.driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[4]"));
	}
	public WebElement getBirdsIcon() {
		return this.driver.findElement(By.xpath("//*[@id=\"MainImageContent\"]/map/area[6]"));
	}
	
	public WebElement getGreetingsMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"WelcomeContent\"]"));
		
	}
	
	public void clickOnCartIcon() throws InterruptedException {
		 this.getCartIcon().click();
		Thread.sleep(1000);
	}
	
	public void name() {
		
	}
	
	public void clickOnSignInButton() throws InterruptedException {
		 this.getSignInButton().click();
		Thread.sleep(1000);
		
	}
	
	public void clickOnFishsIcon() throws InterruptedException {
		this.getFishIcon().click();
		Thread.sleep(1000);
		
	}
	public void clickOnDogsIcon() throws InterruptedException {
		this.getDogsIcon().click();
		Thread.sleep(1000);
		
	}
	
	public void clickOnCatsIcon() throws InterruptedException {
		this.getCatsIcon().click();
		Thread.sleep(1000);
	}
	
	public void clickOnReptilesIcon() throws InterruptedException {
		this.getReptilesIcon().click();
		Thread.sleep(1000);
		
	}
	
	public void clickOnBirdsIcon() throws InterruptedException {
		this.getBirdsIcon().click();
		Thread.sleep(1000);
		
	}
	
	public String getGreetingsMessageText() {
		return this.getGreetingsMessage().getText();
		
	}
	
	public int returnQuantityFromCartIcon() {
		String numberString = this.getCartIcon().getText();
		if (numberString.equalsIgnoreCase("")) {
			return 0;
		}else {
			int numberInt = Integer.parseInt(numberString);
			return Integer.parseInt(numberString);
	
	
		
		}
	}
}	