package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LoginSuccessSteps {
	
	WebDriver driver=null;
//	public void verifyLoginPage() {
//		System.out.println("Hello World");
//	}
	@Given("browser is open")
	public void browser_is_open() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Users/CucumberSauceDemo/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://www.saucedemo.com/");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on login page");
	}

	@When("user enters standard_user and secret_sauce")
	public void user_enters_standard_user_and_secret_sauce() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters standard_user and secret_sauce");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to the home page");
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

	@When("user enters problem_user and secret_sauce")
	public void user_enters_problem_user_and_secret_sauce() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters problem_user and secret_sauce");
	}

	@When("user enters performance_glitch_user and secret_sauce")
	public void user_enters_performance_glitch_user_and_secret_sauce() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters performance_glitch_user and secret_sauce");
	}

	@When("user enters error_user and secret_sauce")
	public void user_enters_error_user_and_secret_sauce() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("error_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters error_user and secret_sauce");
	}
	@When("user enters standard_user and {string}")
	public void user_enters_standard_user_and(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters standard_user and {string}");
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
	}

	@Then("error message is displayed and user stay on login page")
	public void error_message_is_displayed_and_user_stay_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("error message is displayed and user stay on login page");
		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));

        // Get the text of the error message
        String errorMessageText = errorMessage.getText();

        // Check if the error message is displayed and has the expected text
        if (errorMessage.isDisplayed() && errorMessageText.contains("Epic sadface: Username and password do not match any user in this service")) {
            System.out.println("Error message is displayed: " + errorMessageText);
        } else {
            System.out.println("Error message is not displayed or does not contain the expected text.");
        }
        Thread.sleep(2000);
		driver.close();
        driver.quit();
	}
}
