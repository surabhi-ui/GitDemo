package lntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(50000);
	
		 WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
//		As we used select class to achieved static dropDown , Similarly we will use action class to achieve all the actions
//      In this Amazon site when we will move our cursor at "Hell sign in account & list " icon, it will automatically open all the content no need
//		to click on any button or any things just move cursor at the point , So here we are using Action class
		 
		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();//instead of this we will use move
//		variable for flexibility.
		
//		".build" means "a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")))" is ready to execute but it will not 
//		execute, when we will use .performance(), Then this will be execute (.built()->now  ready to execute, .performance()-->now  will execute)
//		For right click -> use ".contextClick()" Method in actions class
		a.moveToElement(move).contextClick().build().perform();

//      for composite action , If we want to send key in Capital latter then , will use .keyDown method and inside this "keys.SHIFT", .SHIFT Method
//		Press the shift for capita latter and then we will send our key , we will send key in small latter ".SHIFT" method will convert in capital
//		If we want to select this hello string which we are sending {I checked on Amazon site we i am doing double click on text(hello) it is selected} 
//		,So now we will use ".doubleClick()"  Method to select hello
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		

	}

}
