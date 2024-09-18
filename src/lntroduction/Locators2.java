package lntroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		So in locators file we have seen many things like first we have gave the wrong credential and then click on 
//		forget password and then from there we got right password and after that we logged in that page
//		So now we will login by giving right user name and password

//		we are defining username in name variable and place of hard code will use this name 
		String name = "surabhi";

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\User\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		call that getPassword method here and store in password variable 
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
//		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
//		now use password dynamically
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
//		we will call the text by tag name locator
//		(<p style="color: rgb(27, 179, 102); font-size: 18px; text-align: center;">You are successfully logged in.</p>)
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello " + name + ",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();

	}

//	so in uper code we have gave the hardcode line no 25 password(driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");)
//	now we will give the password dynamically with the help of method as we have already seen in java basic course
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		// now we will get the whole text "Please use temporary password
		// 'rahulshettyacademy' to Login." but we want only rahulshettycademy as
		// password
//		so will store this text in a variable and then we will use split to split the string
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
//		now in index 1 Please use temporary password will come and on index 1 rahulshettyacademy' to Login. will be appear
//		so we again split index 1 with "'"  to get password, then rahulshettyacademy will be on index 0 and  to Login. will on index 1
		// 0 index = Please use temporary password
		// 1 index = rahulshettyacademy' to Login.

		// 0 index = rahulshettyacademy
		// 1 index = to Login.

		String password = passwordArray[1].split("'")[0];
		return password;

	}

}
