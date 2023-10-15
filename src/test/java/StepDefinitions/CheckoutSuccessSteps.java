package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;


public class CheckoutSuccessSteps {
	
	WebDriver driver=null;
//	public void verifyLoginPage() {
//		System.out.println("Hello World");
//	}
	@Given("browser is open4")
	public void browser_is_open4() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Users/CucumberSauceDemo/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}
	
	@Given("user is on login page4")
	public void user_is_on_login_page4() {
		driver.navigate().to("https://www.saucedemo.com/");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on login page");
	}

	@When("user enters standard_user and secret_sauce4")
	public void user_enters_standard_user_and_secret_sauce4() {
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters standard_user and secret_sauce");
	}

	@When("click on login button4")
	public void click_on_login_button4() {
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
	}

	@Then("user is navigated to the home page4")
	public void user_is_navigated_to_the_home_page4() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to the home page");
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isDisplayed();


	}


	@When("user click button add to cart of Sauce Labs Backpack2")
	public void user_click_button_add_to_cart_of_sauce_labs_backpack2() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
		System.out.println("user click button add to cart of Sauce Labs Backpack");
	}

	@Then("Cart icon on top right will displayed {int} item on cart2")
	public void cart_icon_on_top_right_will_displayed_item_on_cart2(Integer int1) {
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

	@When("user click cart icon on top right2")
	public void user_click_cart_icon_on_top_right2() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click cart icon on top right");
	}

	@Then("user is navigated to cart page2")
	public void user_is_navigated_to_cart_page2() {
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

	@Then("Cart page will display {int} Sauce Labs Backpack in cart2")
	public void cart_page_will_display_sauce_labs_backpack_in_cart2(Integer int1) {
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

	}
	@When("user click button Checkout")
	public void user_click_button_checkout() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click button Checkout");
		driver.findElement(By.xpath("//button[@name='checkout']")).click();
	}

	@Then("user is navigated to checkout step one page")
	public void user_is_navigated_to_checkout_step_one_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to checkout step one page");
        WebElement spanElement = driver.findElement(By.xpath("//span[@class='title']"));

        // Check if the span element is displayed
        if (spanElement.isDisplayed()) {
            System.out.println("The span element is displayed.");

            // Get the text content of the span element
            String spanText = spanElement.getText();

            // Check if the text content is "Checkout: Your Information"
            if ("Checkout: Your Information".equals(spanText)) {
                System.out.println("The span text is 'Checkout: Your Information'.");
            } else {
                System.out.println("The span text is not 'Checkout: Your Information'. It is: " + spanText);
            }
        } else {
            System.out.println("The span element is not displayed.");
        }
	}

	@When("user fill first name, last name, zip code")
	public void user_fill_first_name_last_name_zip_code() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user fill first name, last name, zip code");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("testfirstname");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("testlastname");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("1234");
	}

	@When("user click button Continue")
	public void user_click_button_continue() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click button Continue");
		driver.findElement(By.xpath("//input[@name='continue']")).click();
	}

	@Then("user is navigated to checkout step two page")
	public void user_is_navigated_to_checkout_step_two_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to checkout step two page");
        WebElement spanElement = driver.findElement(By.xpath("//span[@class='title']"));

        // Check if the span element is displayed
        if (spanElement.isDisplayed()) {
            System.out.println("The span element is displayed.");

            // Get the text content of the span element
            String spanText = spanElement.getText();

            // Check if the text content is "Checkout: Overview"
            if ("Checkout: Overview".equals(spanText)) {
                System.out.println("The span text is 'Checkout: Overview'.");
            } else {
                System.out.println("The span text is not 'Checkout: Overview'. It is: " + spanText);
            }
        } else {
            System.out.println("The span element is not displayed.");
        }
	}

	@When("user click button Finish")
	public void user_click_button_finish() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click button Finish");
		driver.findElement(By.xpath("//button[@name='finish']")).click();
	}

	@Then("user is navigated to checkout complete page and message Thank you for your order! displayed")
	public void user_is_navigated_to_checkout_complete_page_and_message_thank_you_for_your_order_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to checkout complete page and message Thank you for your order! displayed");
        WebElement spanElement = driver.findElement(By.xpath("//span[@class='title']"));
        WebElement spanElement2 = driver.findElement(By.xpath("//h2[@class='complete-header']"));

        // Check if the span element is displayed
        if (spanElement.isDisplayed()&& spanElement2.isDisplayed()) {
            System.out.println("The elements is displayed.");

            // Get the text content of the span element
            String spanText = spanElement.getText();
            String spanText2 = spanElement2.getText();

            // Check if the text content is "Checkout: Complete!"
            if ("Checkout: Complete!".equals(spanText)&&"Thank you for your order!".equals(spanText2)) {
                System.out.println("Checkout Complete");
            } else {
            	 System.out.println("Checkout Failed");
            }
        } else {
        	System.out.println("Checkout Failed");
        }
        Thread.sleep(2000);
		driver.close();
        driver.quit();
	}
}
