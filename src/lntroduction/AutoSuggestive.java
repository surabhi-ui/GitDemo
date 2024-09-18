package lntroduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	Auto Suggestive Means Any drop down where we will write starting of some latter and all the suggestion of list which is start from that 
//Alphabet will show (Example- If we want to Select India , Then we will write Ind in AutoSelective DrpDown and all the name which will start 
//From Ind will shown like British Indian Ocean Territory, India,Indonesia etc)
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");//Click on box and send Ind in dropdown
		Thread.sleep(3000);
		
//		As we know FindElements returns Webdriver We will store in a list so that we can iterate each and every city name and what will be match
//		with India will click on that 
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));//ParentTagName[Attribute='Value'] ChildTageName
		
//		Now we will use Enhanced for look to iterate
		for(WebElement option: options)//now whatever city name present in "options" That will store in "option" variable one by one(iteration)
			{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		

		}
		

	}

