package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;


public class FilterProductSuccessSteps {
	
	WebDriver driver=null;
//	public void verifyLoginPage() {
//		System.out.println("Hello World");
//	}
	@Given("browser is open2")
	public void browser_is_open2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Users/CucumberSauceDemo/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}
	
	@Given("user is on login page2")
	public void user_is_on_login_page2() {
		driver.navigate().to("https://www.saucedemo.com/");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on login page");
	}

	@When("user enters standard_user and secret_sauce2")
	public void user_enters_standard_user_and_secret_sauce2() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters standard_user and secret_sauce");
	}

	@When("click on login button2")
	public void click_on_login_button2() {
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
	}

	@Then("user is navigated to the home page2")
	public void user_is_navigated_to_the_home_page2() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to the home page");
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isDisplayed();


	}

	@When("user click filter combo box")
	public void user_click_filter_combo_box() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click filter combo box");
		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();


	}

	@When("user click combo box option price \\(low to high)")
	public void user_click_combo_box_option_price_low_to_high() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click combo box option price \\\\(low to high)");
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select = new Select(dropdown);

        // Select the option with the value "hilo" (assuming "Price (high to low)" has a value of "hilo")
        select.selectByValue("lohi");
//		driver.findElement(By.xpath("//option[@value='Price (high to low)']")).click();
	}

	@Then("the product will displayed sort by price low to high")
	public void the_product_will_displayed_sort_by_price_low_to_high() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));

        Select select = new Select(dropdown);

        // Get the currently selected option
        WebElement selectedOption = select.getFirstSelectedOption();

        // Get the text of the selected option
        String selectedOptionValue = selectedOption.getAttribute("value");

        // Check if the selected value is "lohi"
        if ("lohi".equals(selectedOptionValue)) {
            System.out.println("The selected value is 'lohi'.");
        } else {
            System.out.println("The selected value is not 'lohi'.");
        }
        Thread.sleep(2000);
		driver.close();
        driver.quit();
	}
}
