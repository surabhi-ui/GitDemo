package lntroduction;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		first we will hit this url to open and now we want to open a link in this page who's locator ".blinkingText"
//		( because we want to email id from this link to send in user name for practice)
//		this is our parent window and whatever link will be open with "driver.findElement(By.cssSelector(".blinkingText")).click();" , This will
//		our child window , 
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
//		so this getWindowHandles method store all the windows and their  id(in set string form)  
//		which will be open through this "driver.get("https://rahulshettyacademy.com/loginpagePractise/");"
		Set<String> windows = driver.getWindowHandles();//[parent window id,child window id]
		
//		our goal is pull these id from line no 28 data structure, For that we will call a method name as iterator	
//		now this "it" variable go to extract value present in set collection
		Iterator<String> it = windows.iterator();
		
//		so next method default go with 0th index item and if we want to first child window then we have to do one next method again
//		if we want to go on 3rd child window then we have to use 3 next method
//		{1 next->parent(0th index), 2 next->second child window(1), 3 next->third child window (3)}
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);	
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());	
//		if we will not use window switch then what will  be happen, The code will try to search this getText value from first parent window 
//		and through error, (We want email id from child window which we will use for user name thats why doing this)
		
		 String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//		 we want to send this email id in user name section which is on parent window, so first we will go on parent window and sent the email
		 
		 driver.switchTo().window(parentId);
		 driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
