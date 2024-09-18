package lntroduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("wbdriver.driver.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		This manage().window().maximize(); is using for load the page in maximize form
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
//		we want to navigate from "https://www.google.com/" to ""https://rahulshettyacademy.com/locatorspractice/" so we are using navigate
//		There is very thin difference blw .get and .navigate method , Like get method will wait until page will be fully load and 
//		in navigate method if some picture and some text are loaded then it will be close because it does not wait to page fully load	
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");	
		
//		if we want to go back from rahulshettyacademy page to google page again then we will use -->
		driver.navigate().back();		
		
//		if we want to go forward again
		driver.navigate().forward();		
//		o/p will first google page will be open then navigate to rahulshettyacademy page and after that again will go back on google page and then 
//		go forword on rahullshettyacademy page again
		}

}
