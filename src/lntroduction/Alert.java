package lntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "Surabhi";
		System.getProperty("webdriver.chrome.chromedriver",
				"C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();// click on Alert

//		So any alert we can not access with the help of locator or anything because there is not any CSS or HTML code for this
//		If we will try with right click and inspect, nothing will happen
//		So there is a switch() method we will use, this switch method , first switch from text to alert and and will use accept() Method to accept 
//		that alert 	

		System.out.println(driver.switchTo().alert().getText());// to get alert text
		driver.switchTo().alert().accept();// click on Ok

		driver.findElement(By.id("confirmbtn")).click();// click on confirm
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();// when we want to cancel (if that is present) will use dismiss(); Method

//		There is pop-up like "Ok" and "Confirm" , If there will be "yes" "no", "accept" "Not accept" etc
//		For positive like for acceptance will use accept(); Method
//      For negative like cancel, no , etc will use dismiss(); Method
//		Unfortunately we don't have object available here to handle with driver.findElement, So that's why Selenium have raper alert class method
	}

}
