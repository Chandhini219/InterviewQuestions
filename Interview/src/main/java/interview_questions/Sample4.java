package interview_questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) throws AWTException {
		
		//Print the google suggestions
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.google.co.in");
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//Search elements
		
		//WebElement name=driver.findElement(By.name("q"));
		//name.sendKeys("Tiruchy \n");              //Using SendKeys
        //name.sendKeys("Oracle" +Keys.ENTER);
		//name.sendKeys("Pollachi");
		//name.submit();
		/*Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
		
		//-------------------SendKeys Without Selenium--------------------------------------------
		
		// Robot class,sendkeys, activeElement
		
		/* JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].value='Pollachi'", name); */
		
		/*driver.switchTo().activeElement();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER); */
		
		//---------------select all check boxes------------
		
		List<WebElement> cb=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement element : cb) {
			element.click();
			
		}
	}

}
