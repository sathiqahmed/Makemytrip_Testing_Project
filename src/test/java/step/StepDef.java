package step;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	
	
	@Given("user enter in Google.co.in")
	public void user_enter_in_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("http://google.co.in");
		
	    throw new io.cucumber.java.PendingException();
	}

	@When("user is typig the search term {string}")
	public void user_is_typig_the_search_term(String string, CharSequence searchTerm) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(searchTerm);
	    throw new io.cucumber.java.PendingException();
	}

	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should see the search results")
	public void user_should_see_the_search_results() {
		
		boolean status = driver.findElement(By.partialLinkText("SRK")).isDisplayed();
		if(status) {
			System.out.println("Results Displayed..");
		}
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
