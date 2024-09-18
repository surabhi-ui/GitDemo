package lntroduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		People generally say broken link but link will not be broken , thats broken URL will be there
//		First we click on link that URL which tied up with that link is not working that what we say
//		 Selenium alone will not help us to identify that broken link we need some Java method also to check that
//		Using Selenium first we will land on the page and where we have to verify broken links and we will scan all the links using selenium
//		for each link we will call getAttribute Method to pull up these URL, So this is Selenium duty and then we will use java method to call those URLs and get status code
//		If status code is > 400 that means that URL is not working--> The link which tied with URL that broken
		
	    String	url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");//tagname[attribute*='value']
	    URL url2 = new URL(url);
	   HttpURLConnection conn =  (HttpURLConnection) url2.openConnection();
	   
//	   HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();-> line no 29,30 n 31 (Trainer have written like this
//	   I was facing some issue to understand that properly thats why i have written in mu language , but latter i will sure check this again)
	   
//	   So we are making a call , there are different type of http method call we have (get,post,put,delete,next,hit ...etc), so we have to tell
//	   what kind of request method it is 
	   
	   conn.setRequestMethod("HEAD");
	   conn.connect();
	   
//	   now this will make a call to the URL and we will get response back, From the object what we openConnection(conn) with that object only we can
//	   set our request method [conn.setRequestMethod("Head");] , with that object only we make connection [ conn.connect();]
//	   and response also we can retrieve from that object(conn) only
//	   we want status code only with the help of that code we can check url is broken or not
	   
	   int resCode = conn.getResponseCode();//--> this method will give us code
	   System.out.println(resCode);//--> it will print the code which is 404 that means Link is broken 
	   
//	   This all done for single link , I will not write code in this file for all the links because, I keep this as a dish for understand better
//	   and do for all link in BrokenLinks2.java file
		

	}

}
