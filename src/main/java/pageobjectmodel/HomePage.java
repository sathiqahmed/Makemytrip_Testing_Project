package pageobjectmodel;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePage extends Base {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
@FindBy(xpath = "//span[@class='commonModal__close']") WebElement Popup_Close;
@FindBy(xpath = "//li[@class='menu_Buses']//a[@class='headerIcons makeFlex hrtlCenter column']") WebElement busclick;
@FindBy(xpath = "//label[@for='fromCity']") WebElement fromclick;
@FindBy(xpath = "//input[@title='From']") WebElement fromcity;
@FindBy(xpath = "//li[@id='react-autowhatever-1-section-0-item-0']") WebElement fromcityclick;
@FindBy(xpath = "//input[@placeholder='To']") WebElement to;
@FindBy(xpath = "//li[@id='react-autowhatever-1-section-0-item-0']") WebElement toclick;
@FindBy(xpath = "//div[@aria-label='Fri Apr 18 2025']") WebElement datechoose;
@FindBy(xpath = "//button[@id='search_button']") WebElement search;


public WebElement getPopup_Close() {
	return Popup_Close;
}	
public WebElement getBusclick() {
	return busclick;
}
public void setBusclick(WebElement busclick) {
	this.busclick = busclick;
}	
public WebElement getFromclick() {
	return fromclick;
}
public void setFromclick(WebElement fromclick) {
	this.fromclick = fromclick;
}
public void setFromcity(WebElement fromcity) {
	this.fromcity = fromcity;
}
public WebElement getFromcity() {
	return fromcity;
}
public WebElement getFromcityclick() {
	return fromcityclick;
}

public WebElement getTo() {
	return to;
}
public void setFromcityclick(WebElement fromcityclick) {
	this.fromcityclick = fromcityclick;
}

public WebElement getToclick() {
	return toclick;
}
public WebElement getDatechoose() {
	return datechoose;
}
public void setDatechoose(WebElement datechoose) {
	this.datechoose = datechoose;
}

public WebElement getSearch() {
	return search;
}
public void setSearch(WebElement search) {
	this.search = search;
}



}






