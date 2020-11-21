package StepDefsHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch extends DriverClass{

	

	@Before
	public void browserSetUp() {
		System.out.println("BROWSER SET UP");
		WebDriverManager.chromedriver().setup();
		//Create driver object for Chrome
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@After
	public void scenarioTearDown() {
		System.out.println("SCENARIO TEAR DOWN");
		driver.quit();
	}

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("inside step - browser is open");
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("inside step - user is on google search page");
		driver.get("https://www.google.com/");
	}

	@When("user search for text")
	public void user_search_for_text() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("inside step - user search for text");
		driver.findElement(By.name("q")).sendKeys("selenium");
	}

	@When("user hits enter")
	public void user_hits_enter() {
		System.out.println("inside step - user hits enter");
		driver.findElement(By.name("q")).submit();
	}

	@Then("the user is navigated to the search results")
	public void the_user_is_navigated_to_the_search_results() {
		System.out.println("inside step - the user is navigated to the search results");
		Assert.assertTrue(driver.getTitle().contains("selenium"));

	}


}
