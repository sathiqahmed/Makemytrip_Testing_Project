package step;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.util.NoSuchElementException;

import base.Base;
import io.cucumber.java.en.*;
import pageobjectmodel.Booking;
//import net.bytebuddy.agent.builder.AgentBuilder.PatchMode.Handler.ForPatchWithOverlap;
import pageobjectmodel.HomePage;
import pageobjectmodel.busfilter;
public class Make_My_Trip_Steps extends Base {
	HomePage obj;
	busfilter objj;
	Booking objjj;
	
	@Given("User opens the MakeMyTrip HomePage")
	public void user_opens_the_make_my_trip_home_page() {
		Browser_launch();
		Maximixe();
		Get_URL("https://www.makemytrip.com/");
	 
	}
	
	@When("Popup occur..Close the popup..")
	public void popup_occur_close_the_popup() {
		
		obj = new HomePage(driver);
		objj = new busfilter(driver);
		objjj = new Booking(driver);
	//jsclick(obj.getPopup_Close());
	explicitwait(obj.getPopup_Close(), 10);
	click(obj.getPopup_Close());
	}
	

	@When("User clicks on the {string} section")
	public void user_clicks_on_the_section(String string) {
		click(obj.getBusclick());
		
	   
	}

	@When("User selects {string} as the source city")
	public void user_selects_as_the_source_city(String string) throws InterruptedException {
		Thread.sleep(2000);
		click(obj.getFromclick());
		Thread.sleep(2000);
		sendKeys(obj.getFromcity(), "chennai");
		Thread.sleep(2000);
		click(obj.getFromcityclick());
			
	    
	}

	@When("User selects {string} as the destination city")
	public void user_selects_as_the_destination_city(String string) {
		explicitwait(obj.getTo(), 10);
		sendKeys(obj.getTo(), "Bangalore");
		explicitwait(obj.getToclick(), 10);
		click(obj.getToclick());
		
	  
	}

	@When("User chooses {string} as the departure date")
	public void user_chooses_as_the_departure_date(String string) {
		click(obj.getDatechoose());
	}

	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) throws InterruptedException {
		click(obj.getSearch());
		Thread.sleep(2000);
	   
	}

	@Then("User should see a list of available buses")
	public void user_should_see_a_list_of_available_buses() {
	   System.out.println("These are available buses");
	}

	@When("User filters the results by {string}")
	public void user_filters_the_results_by(String filterType) throws InterruptedException {
		try {
	        click(objj.getAc()); // You can also use scrollToElement(objj.getAc()) before clicking
	        click(objj.getSeattype());
	        click(objj.getSingleseater());
	        Thread.sleep(2000);
	    } catch (NoSuchElementException e) {
	        System.out.println("Element not found while applying filter: " + filterType);
	        e.printStackTrace();
	    } catch (Exception e) {
	        System.out.println("Unexpected error occurred: " + e.getMessage());
	        e.printStackTrace();
	    }
		
	}
	

	@When("User selects preferred pickup Point as {string}")
	public void user_selects_preferred_pickup_point_as(String string) {
		scrollToWithMouse(objj.getPickup());
		click(objj.getPickup());
		sendKeys(objj.getPickup(), "guindy");
		click(objj.getPickclick());
		
		
	}

	@When("User filters the results by departure time between {string} and {string}")
	public void user_filters_the_results_by_departure_time_between_and(String string, String string2) {
		click(objj.getPickuptime());
	}

	@When("User selects preferred drop Point as {string}")
	public void user_selects_preferred_drop_point_as(String string) {
		scrollToWithMouse(objj.getDrop());
		click(objj.getDrop());
	}

	@Then("User sorts the results by lowest fare")
	public void user_sorts_the_results_by_lowest_fare() {
		scrollToWithMouse(objj.getCheapestclick());
		click(objj.getCheapestclick());
	}

	@Then("User selects the bus with the lowest fare")
	public void user_selects_the_bus_with_the_lowest_fare() {
		scrollToWithMouse(objj.getLowfarebusclick());
		click(objj.getLowfarebusclick());
	}

	@Then("User selects a sleeper seat")
	public void user_selects_a_sleeper_seat() {
		explicitwait(objj.getSeatbook(), 10);
		click(objj.getSeatbook());
	}

	@Then("User selects pickup location as {string}")
	public void user_selects_pickup_location_as(String string) {
		click(objj.getPickuploaction());
	}

	@Then("User selects drop location as {string}")
	public void user_selects_drop_location_as(String string) {
		click(objj.getDropuplocation());
	}

	@Then("User clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
		click(objj.getContinueclick());
	}

	@Then("User fills in traveller details with name {string}, age {string}, gender {string},Email {string},Pincode {string}")
	public void user_fills_in_traveller_details_with_name_age_gender_email_pincode(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
		explicitwait(objjj.getFname(), 10);
		scrollToWithMouse(objjj.getFname());
		click(objjj.getFname());
		sendKeys(objjj.getFname(), "Sathiq Ahmed");
		click(objjj.getAge());
		sendKeys(objjj.getAge(), "29");
		click(objjj.getGender());
		click(objjj.getEmail());
		sendKeys(objjj.getEmail(), "sathiq.vdart@gmail.com");
		click(objjj.getMnumber());
		sendKeys(objjj.getMnumber(), "9876543210");
		scrollToWithMouse(objjj.getPinselect());
		click(objjj.getPinselect());
		scrollToWithMouse(objjj.getContnue());
		click(objjj.getContnue());	
		Thread.sleep(2000);

						
	}

	@Then("Booking summary should be displayed")
	public void booking_summary_should_be_displayed() throws IOException {
		System.out.println("Booking Payment Page Opened.....");
		takescreenshot();
		browserClose();
	}


}
