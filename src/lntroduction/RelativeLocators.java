package lntroduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Selenium 4 Features
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
//		now we want label of Name Edit Box section which is Name . So with the help of name edit box and above() locator we will try to find->
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		
//		We want to print label which is name and we will use nameEditBox , Now Name label is above the nameEditBox 
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

	}

}
