package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.When;

public class SwaggerLoginPage_PF {
	WebDriver driver;

	@FindBy(id="user-name")
	private WebElement userNameBox;
	
	@FindBy(id="password")
	private WebElement passwordBox;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	
	
	public SwaggerLoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String name)
	{
		userNameBox.sendKeys(name);
	}
	public void enterPassword(String password)
	{
		passwordBox.sendKeys(password);
	}
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	public void validLoginScenario(String name, String password)
	{
		enterUserName(name);
		enterPassword(password);
		clickLoginBtn();
	}
	
	
}
