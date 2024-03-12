package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_page {
	WebDriver driver;
	
	@Given("user opens chrome browser and enters simpleform url")
	public void user_opens_chrome_browser_and_enters_simpleform_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAN\\Documents\\Selenium Grid\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://v1.training-support.net/selenium/login-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Given("verify Title of that page")
	public void verify_title_of_that_page() {
		System.out.println(driver.getTitle());
	
	}

	@When("user should able to enter text in username field")
	public void user_should_able_to_enter_text_in_username_field() {
	    driver.findElement(By.id("username")).sendKeys("Admin");
	}

	@When("user should able to enter text in password field")
	public void user_should_able_to_enter_text_in_password_field() {
	    driver.findElement(By.id("password")).sendKeys("password");

	}

	@When("user should able to click login button")
	public void user_should_able_to_click_login_button() {
	  driver.findElement(By.xpath("//button[.='Log in']")).click();
	}

	@Then("after eneter invalid creditionals user should get invalid message")
	public void after_eneter_invalid_creditionals_user_should_get_invalid_message() {
	  System.out.println(driver.findElement(By.id("action-confirmation")).getText());
	}


}
