package lntroduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//In this URL there are a table which have fruits name but not in sorting order, when we will click on Veg/fruit Name then it will be sort the fruit name
//Basically our task is to verify that fruits name present in first column is sorted order or not , First we will create algorithm for this
//Then will try to execute and write code with the help of algorithm
		
//		Algorithm------>
//		1)->Click on column
//		2)->Capture all web Element into list (web Element that fruits name)
//		3)->Capture text of all web Elements into new list(Original)
//		4)->Sort on original list of step 3 --> sorted list
//		5)-->Compare original list vs sorted list
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> actualList = driver.findElements(By.xpath("//tr/td[1]"));
		
//		we can get text from for loop also but we will use stream for optimize code
//		for(int i=0;i<actualList.size();i++) {
//			System.out.println(actualList.get(i).getText());
//		} 
		 List<String> originalList = actualList.stream().map(s->s.getText()).collect(Collectors.toList());//---> this is our actual list where
//		 we did not apply sorting till now , when we will apply sorting that is our expected list n we will compare both
		 
		 List<String> expectedList = originalList.stream().sorted().collect(Collectors.toList());
		 Assert.assertTrue(originalList.equals(expectedList));		 

//		 next is we want to print price of "Beans"
//		 Algorithm---->\
//		 scan the name column with getText "Beans"-> print price
		  List<String>price = actualList.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceVeggie(s)).collect(Collectors.toList());
		  price.forEach(s->System.out.println(s));
	}

	private static String getPriceVeggie(WebElement s) {
		
//		AS we know all the Vegetable name is stored in actualList at line 32 so now we have to find its price which is its sibling 
//		we will not use driver,because it will be use , driver will scanning the items from scratch for sibling will use "s"
		String priceOfBeans = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceOfBeans;
		}
}
