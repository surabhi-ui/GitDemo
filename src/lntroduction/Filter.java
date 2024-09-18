package lntroduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//		So in this we want to check that filter on page is working or not, If we will give rice on filter box then , rice will display  on the table below
		driver.findElement(By.id("search-field")).sendKeys("rice");//->search rice on filter box
		
//		we have used findElements because the list of rice in table we want , like if there is brown rice, white rice, rice , but we want only rice 
//		so if we will send rice so only rice column should display in table , If filter is not working properly and its broken somewhere, then only 
//		May we can find another items also
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));// veggies store the list of rice or only rice in list
		
//		Now we want to text so that we can check with contain method that rice is present in table or not 
		List<WebElement> filterRice = veggies.stream().filter(a->a.getText().contains("Rice")).collect(Collectors.toList());// This is list of rice 
		
//		In our case only rice is present but may be there could be multiple type of rice then contains will check every items in column for rice
//		so that rice we are storing in filterRice list , so basically in our case veggies list size and filterRice list size should be same so 
		Assert.assertEquals(veggies.size(),filterRice.size());
		
		

	}

}
