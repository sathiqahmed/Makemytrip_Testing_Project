package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;


public class busfilter extends Base   {
	WebDriver driver;
	
public busfilter(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}	
		
@FindBy(xpath = "//span[@class='listingSprite acIcon appendRight11']") WebElement ac;
@FindBy(xpath = "//span[text()='Sleeper']") WebElement seattype;
@FindBy(xpath = "(//ul[@class='dropdownWrap'])[1]") WebElement singleseater;
@FindBy(xpath = "//input[@id='Pick up point']") WebElement pickup;
@FindBy(xpath = "(//ul[@class=\"dropdownWrap\"])[2]") WebElement pickclick;
@FindBy(xpath = "(//span[text()='6 PM to 11 PM'])[1]") WebElement pickuptime;
@FindBy(xpath = "//span[text()='Majestic']") WebElement drop;
@FindBy(xpath = "//li[text()='Cheapest']")	 WebElement cheapestclick;
@FindBy(xpath = "(//div[@class='busCardContainer ']//div[@class='busCard false'])[1]") WebElement lowfarebusclick;
@FindBy(xpath = "(//span[@data-testid='seat_horizontal_sleeper_available'])[15]") WebElement seatbook;
@FindBy(xpath = "(//span[text()='Guindy'])[2]") WebElement pickuploaction;
@FindBy(xpath ="//div[@class='cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active']//span[text()='Continue']") WebElement continueclick;
@FindBy(xpath = "(//span[text()='Majestic'])[2]") WebElement dropuplocation;


public WebElement getPickclick() {
	return pickclick;
}
public void setPickclick(WebElement pickclick) {
	this.pickclick = pickclick;
}
public WebElement getContinueclick() {
	return continueclick;
}
public void setContinueclick(WebElement continueclick) {
	this.continueclick = continueclick;
}
public WebElement getPickuploaction() {

	return pickuploaction;
}
public void setPickuploaction(WebElement pickuploaction) {
	this.pickuploaction = pickuploaction;
}
public WebElement getDropuplocation() {
	return dropuplocation;
}
public void setDropuplocation(WebElement dropuplocation) {
	this.dropuplocation = dropuplocation;
}

public WebElement getSeatbook() {
	return seatbook;
}
public void setSeatbook(WebElement seatbook) {
	this.seatbook = seatbook;
}
public WebElement getLowfarebusclick() {
	return lowfarebusclick;
}
public void setLowfarebusclick(WebElement lowfarebusclick) {
	this.lowfarebusclick = lowfarebusclick;
}
public WebElement getAc() {
	return ac;
}
public void setAc(WebElement ac) {
	this.ac = ac;
}
public WebElement getSeattype() {
	return seattype;
}
public void setSeattype(WebElement seattype) {
	this.seattype = seattype;
}
public WebElement getSingleseater() {
	return singleseater;
}
public void setSingleseater(WebElement singleseater) {
	this.singleseater = singleseater;
}
public WebElement getPickup() {
	return pickup;
}
public void setPickup(WebElement pickup) {
	this.pickup = pickup;
}
public WebElement getPickuptime() {
	return pickuptime;
}
public void setPickuptime(WebElement pickuptime) {
	this.pickuptime = pickuptime;
}
public WebElement getDrop() {
	return drop;
}
public void setDrop(WebElement drop) {
	this.drop = drop;
}
public WebElement getCheapestclick() {
	return cheapestclick;
}
public void setCheapestclick(WebElement cheapestclick) {
	this.cheapestclick = cheapestclick;
}

}
