package interview_questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.PageFactory;

public class Sample2 {
	static WebElement q;

	public static void main(String[] args) throws AWTException {


		//Launching browser without using setproperty
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		//-------------------------------------------------------------	
		//Find elements without using find element options

		driver.switchTo().activeElement().sendKeys("Tiruchy \n");
		/*
		 * PageFactory.initElements(driver,Sample2.class); q.sendKeys("Tiruchy \n");
		 */

		//---------------------------------------------------------

		//Different ways to refresh

		//driver.navigate().refresh(); //using refresh commands
		//driver.get(driver.getCurrentUrl()); //Using getCurrentUrl

		/*
		 * JavascriptExecutor execute=(JavascriptExecutor) driver; //Using
		 * JavascriptExecutor execute.executeScript("location.reload()");
		 */
		
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		//---------------------------------------------------------


	}

}
