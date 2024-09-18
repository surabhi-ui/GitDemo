package lntroduction;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.cssSelector(".form-control:nth-child(1)")).click();		
		driver.findElement(By.xpath("//option[text()='Consultant']")).click();

		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> phones = driver.findElements(By.cssSelector(".card-footer .btn.btn-info"));	
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout"))z);

		for (int i = 0; i<phones.size(); i++) {
		
			phones.get(i).click();

			}
		driver.findElement(By.partialLinkText("Checkout")).click();




		}
	}



	

