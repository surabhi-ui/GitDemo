package lntroduction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		There is update in selenium like without using below line we can fetch the chrome browse , Like if we will not use this line
//		then selenium manager will automatically work , If we will use this line then selenium manager will not work , code will fetch chrome Browse
//		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
