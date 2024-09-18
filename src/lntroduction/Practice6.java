package lntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		//div[@id='checkbox-example']/fieldset/label[2]
		String text = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement  staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByVisibleText(text);
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(5000);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		if(alert.contains(text)){
			System.out.println("Successfully");	
		}
		else
		{
			System.out.println("Something went wrong here");
		}
		
	}

}
