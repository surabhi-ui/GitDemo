package lntroduction;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
//		String[] iteamsNeeded = {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		String[] iteamsNeeded = {"Cucumber","Brocolli","Beetroot"};
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
