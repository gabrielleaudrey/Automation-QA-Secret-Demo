package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;


public class AddToCartSuccessSteps {
	
	WebDriver driver=null;
//	public void verifyLoginPage() {
//		System.out.println("Hello World");
//	}
	@Given("browser is open3")
	public void browser_is_open3() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Users/CucumberSauceDemo/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}
	
	@Given("user is on login page3")
	public void user_is_on_login_page3() {
		driver.navigate().to("https://www.saucedemo.com/");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on login page");
	}

	@When("user enters standard_user and secret_sauce3")
	public void user_enters_standard_user_and_secret_sauce3() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters standard_user and secret_sauce");
	}

	@When("click on login button3")
	public void click_on_login_button3() {
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
	}

	@Then("user is navigated to the home page3")
	public void user_is_navigated_to_the_home_page3() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to the home page");
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isDisplayed();


	}


	@When("user click button add to cart of Sauce Labs Backpack")
	public void user_click_button_add_to_cart_of_sauce_labs_backpack() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
		System.out.println("user click button add to cart of Sauce Labs Backpack");
	}

	@Then("Cart icon on top right will displayed {int} item on cart")
	public void cart_icon_on_top_right_will_displayed_item_on_cart(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cart icon on top right will displayed {int} item on cart");
//		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).isDisplayed();
        WebElement spanElement = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));

        // Check if the span element is displayed
        if (spanElement.isDisplayed()) {
            System.out.println("The span element is displayed.");

            // Get the text content of the span element
            String spanText = spanElement.getText();

            // Check if the text content is not null
            if (spanText != null && !spanText.isEmpty()) {
                System.out.println("The span text is not null: " + spanText);
            } else {
                System.out.println("The span text is null or empty.");
            }
        } else {
            System.out.println("The span element is not displayed.");
        }
	}

	@When("user click cart icon on top right")
	public void user_click_cart_icon_on_top_right() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click cart icon on top right");
	}

	@Then("user is navigated to cart page")
	public void user_is_navigated_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to cart page");
        WebElement spanElement = driver.findElement(By.xpath("//span[@class='title']"));

        // Check if the span element is displayed
        if (spanElement.isDisplayed()) {
            System.out.println("The span element is displayed.");

            // Get the text content of the span element
            String spanText = spanElement.getText();

            // Check if the text content is "Your Cart"
            if ("Your Cart".equals(spanText)) {
                System.out.println("The span text is 'Your Cart'.");
            } else {
                System.out.println("The span text is not 'Your Cart'. It is: " + spanText);
            }
        } else {
            System.out.println("The span element is not displayed.");
        }
		
	}

	@Then("Cart page will display {int} Sauce Labs Backpack in cart")
	public void cart_page_will_display_sauce_labs_backpack_in_cart(Integer int1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cart page will display {int} Sauce Labs Backpack in cart");
        WebElement spanElement = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));

     // Check if the span element is displayed
        if (spanElement.isDisplayed()) {
            System.out.println("The span element is displayed.");

            // Get the text content of the span element
            String spanText = spanElement.getText();

            // Check if the text content is "Your Cart"
            if ("Sauce Labs Backpack".equals(spanText)) {
                System.out.println("The span text is 'Sauce Labs Backpack'.");
            } else {
                System.out.println("The span text is not 'Sauce Labs Backpack'. It is: " + spanText);
            }
        } else {
            System.out.println("The span element is not displayed.");
        }
		Thread.sleep(2000);
		driver.close();
        driver.quit();
	}
}
