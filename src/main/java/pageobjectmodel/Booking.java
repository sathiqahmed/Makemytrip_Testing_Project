package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Booking extends Base {
	

public Booking(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
	}

@FindBy(xpath = "//input[@id='fname']") WebElement fname;
@FindBy(xpath = "//input[@id='age']") WebElement age;
@FindBy(xpath = "//div[@class='maleTab ']") WebElement gender;
@FindBy(xpath = " //input[@type='email']") WebElement email;
@FindBy(xpath = "//input[@id='mobileNumber']") WebElement mnumber;
@FindBy(xpath = "//span[@class='checkboxWpr']") WebElement pinselect;
@FindBy(xpath = "//div[@class='paymentBtn whiteText latoBold font16 capText']") WebElement contnue;

public WebElement getFname() {
	return fname;
}
public void setFname(WebElement fname) {
	this.fname = fname;
}
public WebElement getAge() {
	return age;
}
public void setAge(WebElement age) {
	this.age = age;
}
public WebElement getGender() {
	return gender;
}
public void setGender(WebElement gender) {
	this.gender = gender;
}
public WebElement getEmail() {
	return email;
}
public void setEmail(WebElement email) {
	this.email = email;
}
public WebElement getMnumber() {
	return mnumber;
}
public void setMnumber(WebElement mnumber) {
	this.mnumber = mnumber;
}
public WebElement getPinselect() {
	return pinselect;
}
public void setPinselect(WebElement pinselect) {
	this.pinselect = pinselect;
}
public WebElement getContnue() {
	return contnue;
}
public void setContnue(WebElement contnue) {
	this.contnue = contnue;
}




}