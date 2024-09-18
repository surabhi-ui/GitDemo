package lntroduction;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class base1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//Implicit wait
		
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));//Explicit Wait
	
		String[] iteamsNeeded = {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, iteamsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
//		Thread.sleep(3000);(If we did not use implicit wait and used thread.sleep then what will happen
//		code will fail after applying the coupon because after coupon the page is taking some time to show that text "Code applied ..!"
//		Implicit wait apply at global level so that will applicable at every line of code whenever page will take some time to load it will wait 
//		first 5 second and then fail)
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));//Explicit wait
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");	
		driver.findElement(By.cssSelector("button.promoBtn")).click();

//		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));//Explicit Wait
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
//		base1 b = new base1();
//		b.addItems(driver, iteamsNeeded);(no need to create object we have knew that if in method use "static" it can call method without creating object)

	}
	public static void addItems(WebDriver driver,String[] iteamsNeeded) {
		
		 int j=0;
//		String[] iteamsNeeded = {"Cucumber","Brocolli","Beetroot"};
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i =0;i<products.size();i++)
		{
			List<String> iteamsNeededList = Arrays.asList(iteamsNeeded);
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			if(iteamsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==iteamsNeeded.length) {
					break;
				}
			}
		}

		
	}

}
