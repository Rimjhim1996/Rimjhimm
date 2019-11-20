package Demo2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo2a {
	WebDriver driver= null;
	
	@Given("User is open the application")
	public void user_is_open_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		driver.get(url);
		
		
	    
	}

	@When("User click on to logic link")
	public void user_click_on_to_logic_link() {
		driver.findElement(By.linkText("SignIn")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		
	   
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		driver.findElement(By.name("Login")).click();
		System.out.println("the page title is"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Home"));
	   
	}



}
