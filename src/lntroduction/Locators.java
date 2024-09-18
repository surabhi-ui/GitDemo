package lntroduction;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		First we will invoke the chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Documents\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		implicitywait will wait for a while to check that msg like is msg will take at least 2 sec to load , selenium execute the 
//		and give result within milisec so that will a error 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
//		then we will hit that URL 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
//		then we will use ID to write 
//		Fist we will inspact that page and get locator like "Id", "name", "class name" etc and we will use sendkeys to write anything
//		like if we want to send user name "Surabhi" there we will use sendKeys
		driver.findElement(By.id("inputUsername")).sendKeys("surabhi");
		driver.findElement(By.name("inputPassword")).sendKeys("singh");
		
//		on action click we are not sending any key so will use Click method
//		If user name or password is incorrect it will shown on web page
		driver.findElement(By.className("signInBtn")).click();
		
//		driver.findElement(By.cssSelector("p.error")).getText())->this is for error msg -> System.out we are using to see
//        that error on console
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
//		So like previously we was providing wrong user name and password to learn the things
//		so that is showing error like Incorrect user name or password , so now we will use text link locator
//		to open link of forget password
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
//		now we will use Xpath locator(when forget password link will open then there are three section available in this url
//		User name , email, password 'jhon' is sending in user name section
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jhon");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jhon@gmail.com");
//		this will clear the email(this index method should be our last option , In general we will try to do with the unique value
//		if there is no any unique value the we will use this index method. this syntax for xpath locator)
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
//		then this email will fill in email section(This index syntax for css locator)
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("jhon@123gmail.com");
//		now we are learning some another way like we can use parent tag and child tag for set the data 
//		if there is no attribute , no class, no id , no name ect then we can use this(by Xpath)
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8528497295");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//		now we are learning some another way like we can use parent tag and child tag for set the data 
//		if there is no attribute , no class, no id , no name etc then we can use this(by CSS selector)
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());	
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(1000);
//		We have seen different different type of locator any one we can use according to given parameter
//		So  we have seen all the process like send the name password and it is incorrect then we have extract error massage and
//		then click on forget password and send values there and got the password and all that , Now we will login with the right
//		credential
		
//		Now we can send the value using  first four value of attribute also like if "type=password" and first alphabet is fix and 
//		other is changing after click on link so we will use with the help of regular expression(*) for cssSelector
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("surabhi");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
//		we are using regular expression for Xpath , It is lit bit tricky we have to use cantains(Parent and child method)
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();	
		
//		So now we have been successfully login on https://rahulshettyacademy.com/locatorspractice/
	}

}
