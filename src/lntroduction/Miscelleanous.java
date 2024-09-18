package lntroduction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// This manage() method maximize our browser  before execute the code
		
//		 There are many circumstances , we can achieve by Manage() Method like 
		driver.manage().deleteAllCookies();//->Delete all cookies of browser
//		driver.manage().deleteCookieNamed("");// -> if we know the cookie name we can use this 
//		driver.get("http:google.com");
		driver.get("https://google.com");
		
		
//		ScreenShot 
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D:\\Screenshot1.png"));//FileUtils is java function which will save screenshot to given path
//		C:\\Users\\User\\Desktop\\Screenshot"
		}

}
