package lntroduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("table[class='gf-t'] a"));
		SoftAssert a = new SoftAssert();
		
	   for(WebElement link:links){
		   
		   String	url = link.getAttribute("href");//tagname[attribute*='value']
		   URL url2 = new URL(url);
		   HttpURLConnection conn =  (HttpURLConnection) url2.openConnection();
		   conn.setRequestMethod("HEAD");
		   conn.connect();
		   
		   int resCode = conn.getResponseCode();
		   System.out.println(resCode);
		  
//		   if(resCode > 400){
//			   System.out.println("The link with text " + link.getText()+" is broken with code " + resCode);
//			   Assert.assertTrue(false);
//			   
//		   }
		   
		   a.assertTrue(resCode<400, "The link with text " + link.getText()+" is broken with code " + resCode);
		   
	   }
	   a.assertAll();

	}

}
