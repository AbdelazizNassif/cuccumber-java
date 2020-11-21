package StepDefs;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SwaggerLoginPage;
import pages.SwaggerLoginPage_PF;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwaggerLoginSteps_POM {
	
	public static WebDriver driver;
	SwaggerLoginPage_PF loginObj;
	private static int i = 0;
	
	@Given("user in login page of wagger web portal")
	public void user_in_login_page_of_wagger_web_portal() {
		System.out.println("inside step - user in login page of wagger web portal");
		WebDriverManager.chromedriver().setup();
		//Create driver object for Chrome
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		loginObj = new SwaggerLoginPage_PF(driver);
		
		driver.get("https://www.saucedemo.com/");
		i ++;
	}
	
	@When("^user enter valid (.*) and (.*) of wagger web portal$")
	public void user_enter_valid_username_and_password_of_wagger_web_portal(
			String userName, String password) 
	{

		loginObj.enterUserName(userName);
		loginObj.enterPassword(password);
	}

	@When("click login button of wagger web portal")
	public void click_login_button_of_wagger_web_portal() {
		loginObj.clickLoginBtn();
	}

	@Then("the user is navigated to the home page of wagger web portal")
	public void the_user_is_navigated_to_the_home_page_of_wagger_web_portal() {
	    Assert.assertTrue(driver.findElement(By.cssSelector("div.app_logo")).isDisplayed());
	    System.out.println("***********Value of i is: "  + i + " ***********");
	    driver.quit();
	}

}
