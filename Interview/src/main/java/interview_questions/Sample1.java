package interview_questions;

import org.openqa.grid.web.servlet.handler.SeleniumBasedRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//Get vs Navigate
		//driver.get(driver.getCurrentUrl()); // Get
		/*
		 * driver.navigate().to("https://www.google.com/"); //Navigate
		 * WebElement name=driver.findElement(By.name("q")); name.sendKeys("tiruchy");
		 * driver.navigate().refresh();
		 */
		
		//******************************************************************
		
		//Quit and Close()
		/*
		 * driver.navigate().to("http://www.leafground.com/pages/Button.html");
		 * WebElement name1=driver.findElement(By.id("home")); name1.click();
		 * Thread.sleep(3000); driver.close(); //driver.quit();
		 */	
	//********************************************************************	
		
		//Maximize the windows
		/*
		 * driver.navigate().to("http://www.leafground.com/pages/Button.html");
		 * driver.manage().window().maximize();
		 */
		
		//Dimension class
		
		/*
		 * Dimension dimension=new Dimension(1333,768);
		 * driver.manage().window().setSize(dimension);
		 * driver.navigate().to("http://www.leafground.com/pages/Button.html");
		 */
		
		//Chromeoptions
		
		/*
		 * ChromeOptions c=new ChromeOptions(); c.addArguments("--start-maximized");
		 * WebDriver driver1=new ChromeDriver(c);
		 * driver1.get("http://www.google.co.in");
		 */
		//***************************************************************************
		
		//--------Thread.sleep vs Selenium.setSpeed
		
		/*
		 * Thread.sleep1(3000); 
		 * Selenium.setSpeed(2000); //Not in use
		 */
		//****************************************************************************
		
		//---------Handle Authentication pop-ups
		driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
