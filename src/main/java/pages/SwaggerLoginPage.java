package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class SwaggerLoginPage {
	
	WebDriver driver;
	private By userNameBox = By.id("user-name");
	private By passwordBox = By.id("password");
	private By loginBtn = By.id("login-button");
	
	
	public SwaggerLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String name)
	{
		driver.findElement(userNameBox).sendKeys(name);
	}
	public void enterPassword(String password)
	{
		driver.findElement(passwordBox).sendKeys(password);
	}
	public void clickLoginBtn()
	{
		driver.findElement(loginBtn).click();
	}
	public void validLoginScenario(String name, String password)
	{
		enterUserName(name);
		enterPassword(password);
		clickLoginBtn();
	}
	
	
}
