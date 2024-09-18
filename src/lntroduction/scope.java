package lntroduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		In this we are count all the links present on web page , As we know HTML discipline all the link start from anchor tag "a"
//		with the help of anchor tag we will count the link 
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//		now we want to count the link which is present in footer section , so this id [id="gf-BIG"] has all the access of footer , when we select 
//		this id it will explore  the footer, now we will create a mini driver(WebElement), out of all the page that mini driver plays the role of driver for
//		all the footer section 
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
//		now this "footerdriver" will play a role of main driver for this footer section
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
//		In footer section there is four column,I want to count link of 1st column 
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));//this has access of all the link of 1st column
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
//		Click on each link of column and check if the pages are opening
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)//int i = 1(because first link has nothing
		{
			
			String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);// this will open all the link (present in first column) in different-2 tabs
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000L);
		}
//			we want to print title of every tab
			 Set<String> abc = driver.getWindowHandles();
			 Iterator<String> it= abc.iterator();
			 while(it.hasNext()) {
				 driver.switchTo().window(it.next());
				 System.out.println(driver.getTitle());
			 }
			
		}
		
		
	}

