package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static WebDriver driver;
	public static WebDriverWait explicit;
	public static JavascriptExecutor js;
	public static Actions action;

		
	public static void Browser_launch() {
		driver = new ChromeDriver();
		action = new Actions(driver);
	}
	
	public static void Maximixe() {
		driver.manage().window().maximize();
	}
	
	public static void Get_URL(String Url) {
		driver.get(Url);
	}
	public void click(WebElement Element) {
		Element.click();

	}
	
	public static void implicitWait(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void explicitwait(WebElement element, int sec) {
	    explicit = new WebDriverWait(driver, Duration.ofSeconds(sec));
	    explicit.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public static void sendKeys(WebElement ele,String msg) {
		ele.sendKeys(msg);
		
	}
	public static void jsclick(WebElement ele1) {
		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()",ele1);
	}
	
	public static void scrollToWithMouse(WebElement ele2) {
	    Actions actions = new Actions(driver);
	    actions.moveToElement(ele2).perform(); // Moves mouse to element (auto-scrolls)
	} 
	
	
	public static void moveToElement(WebElement element) {
        action.moveToElement(element).perform();
        
	}
	public static void moveToElementAndClick(WebElement element) {
        action.moveToElement(element).click().perform();
   
        
	}
	public static void browserClose() {

		driver.close();
	}
	
	public static void takescreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\DELL\\eclipse-workspace\\CucumberTraining\\target\\ScreenShot\\FinalOutput.png");
		FileUtils.copyFile(src, target);
	}
	
}
	


