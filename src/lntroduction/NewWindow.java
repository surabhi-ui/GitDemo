package lntroduction;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);// Selenium will open one new blank tab for us (now this driver has not any access or information about new Tab 
//		its only open a blank tab with the help of method, At the place of Tab if we will use WINDOW then it will open a new window for us
		
		 Set<String> handles = driver.getWindowHandles();
		 Iterator<String> it = handles.iterator();
		 String parentId = it.next();
		 String childId = it.next();
		 
//		 Switching windows and tabs
		 driver.switchTo().window(childId);// we have switched to child blank tab
		 driver.get("https://rahulshettyacademy.com/#/practice-project");// on that blank child tab now this url will be open
		 String userName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(5).getText();// we have find all the text and 
//		 in those we want to that text which is on 5 index
		 
		  driver.switchTo().window(parentId);// now we have came back to parent tab , so that send this text in name section
//		  driver.findElement(By.name("name")).sendKeys(userName);
		  
//		  SCREENSHOT
//		  now  selenium 4 is introduce a new feature which is -> We can take a screen shot of any section also , before we can take screenshot of full page
//		  now we can take samll section also
//		  Selenium 4 Features
		  WebElement name = driver.findElement(By.name("name"));
		  name.sendKeys(userName);
		 File src = name.getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(src,  new File("C:\\Users\\User\\Pictures\\Screenshots\\logo.png"));
//		 FileHandler.copy(file, new File("logo.png"));
//		 FileUtils.copyFile(file, new File("logo.png"));
//		 FileUtils.copyFile(file,  new File("C:\\Users\\User\\Pictures\\Screenshots\\logo.png"));
		 
//		 HEIGHT and WIDTH
//		 Selenium 4 Features to know the height and width of box edit box
//		  name edit box
		  System.out.println(name.getRect().getDimension().getHeight());//38
		  System.out.println(name.getRect().getDimension().getWidth());//1110
		  
//		  Email edit box
		  WebElement email = driver.findElement(By.name("email"));
		  System.out.println(email.getRect().getDimension().getHeight());
		  System.out.println(email.getRect().getDimension().getWidth());
		  
		 
		  
		  
		

	}

}
