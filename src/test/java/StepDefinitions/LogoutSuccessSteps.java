package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LogoutSuccessSteps {
	
	WebDriver driver=null;
//	public void verifyLoginPage() {
//		System.out.println("Hello World");
//	}
	@Given("browser is open5")
	public void browser_is_open5() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Users/CucumberSauceDemo/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}
	
	@Given("user is on login page5")
	public void user_is_on_login_page5() {
		driver.navigate().to("https://www.saucedemo.com/");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on login page");
	}

	@When("user enters standard_user and secret_sauce field")
	public void user_enters_standard_user_and_secret_sauce_field() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters standard_user and secret_sauce");
	}

	@When("click on login button5")
	public void click_on_login_button5() {
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
	}

	@Then("user is navigated to the home page5")
	public void user_is_navigated_to_the_home_page5() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to the home page");
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isDisplayed();


	}

	@When("user enters problem_user and secret_sauce field")
	public void user_enters_problem_user_and_secret_sauce_field() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters problem_user and secret_sauce");
	}

	@When("user enters performance_glitch_user and secret_sauce field")
	public void user_enters_performance_glitch_user_and_secret_sauce_field() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters performance_glitch_user and secret_sauce");
	}

	@When("user enters error_user and secret_sauce field")
	public void user_enters_error_user_and_secret_sauce_field() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("error_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters error_user and secret_sauce");
	}
	@When("user click menu button on top left")
	public void user_click_menu_button_on_top_left() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click menu button on top left");
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	}

	@When("user click logout menu")
	public void user_click_logout_menu() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click logout menu");
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}

	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to login page");
		driver.findElement(By.xpath("//input[@name='login-button']")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

	
}
