package lntroduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> actualList = driver.findElements(By.xpath("//tr/td[1]"));

		 List<String> originalList = actualList.stream().map(s->s.getText()).collect(Collectors.toList());

		 List<String> expectedList = originalList.stream().sorted().collect(Collectors.toList());
		 Assert.assertTrue(originalList.equals(expectedList));	
		 
//		 As this all code has taken from LiveDemo1.Java file to understand one scenario that is ---> Pagination
//		 so like we have done this for a single vegetable name that is "beans" which is present in first page if it will not 
//		 be present on 1st page and may be on 2nd or other page how we will do that-->
// we can use size of price , if size of price list  will be < 1 then we will proceed to search further if size of price list > 1
//		 that means our search has been get
//		 Explanation--> like if "beans" will find value then there will one value in list n size of list will be 1
//		 if not find its value then list is empty and size will be < 1 
		 
//		 Like we want to search for "rice" it is not present on 1 page so we will use if [ if(price.size()<1)] and if it will not on find on 2 page 
//		 also then we have to go further for rice , so we will use do while loop 
		 List<String>price;//while condition is showing error because price is defined inside the do loop , so we have declare here and remove 
//		 List<String> from price inside the do loop
		 do {
			 
//			 when we will move on next page we have to grape name of vegetable again so
			 List<WebElement> pagination = driver.findElements(By.xpath("//tr/td[1]"));
			 price = pagination.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
			 price.forEach(a->System.out.println(a));
			  if(price.size()<1) {
				  driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				  } 
			  }while(price.size()<1);
	
	}

	private static String getPriceVeggie(WebElement s) {
	
		String priceOfrice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceOfrice;
		}

	}

