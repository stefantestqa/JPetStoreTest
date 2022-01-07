package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	WebDriver driver;
	WebElement usernameInputField;
	WebElement passwordInputField;
	WebElement logInButton;
	WebElement credentialsErrorMessage;
	
	
	
	public SignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getUsernameInputField() {
		return this.driver.findElement(By.name("username"));
	}
	public WebElement getPasswordInputField() {
		return this.driver.findElement(By.name("password"));
	}
	public WebElement getLogInButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input"));
	}
	public WebElement getCredentialsErrorMessage() {
		return this.driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li"));
	}
	
	public void insertUsername(String username) throws InterruptedException {
		this.getUsernameInputField().sendKeys(username);
		Thread.sleep(1000);
	}
	
	public void insertPassword(String password) throws InterruptedException {
		this.getPasswordInputField().sendKeys(password);
		Thread.sleep(1000);
	}
	
	public void clickOnLogInButton() throws InterruptedException {
		this.getLogInButton().click();
		Thread.sleep(1000);
		
	}
	
	public String getCredentialsErrorMessageText() {
		return this.getCredentialsErrorMessage().getText();
	}
}
