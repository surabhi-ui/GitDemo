package lntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");//url
		
//		Select checkBox 
		
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());// return false
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();//We have selected one check box(Senior Citizen)
		
//		We want to know weather our chcek box is selected or not, So there is one Method in selenium known as "isSelected" to check this
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());// Return True
		
//		All the upper System.out.print code was for practice now we will use Assert to verify that 
//		if the inside value return Boolean respective of method then code will run and will not through any error
//		If Method is assertTrue and it will return false then code will through an error
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
				
//		Now we want to know How many chcekBox available on this page, So first we will find a common locator in all the checkBox
//		We can check on CroPath , There is type="checkbox" is common in every checkBox I have verified on CroPath
//      Here we use findElements Because if we Write element , Its will pick one from Top not all the Check Boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
//		radio button
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));//It will print style attribute value before click on Round Trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//select round trip
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));//It will print style attribute value after click on Round Trip
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
//			.contains check whether "1" is present in style attribute value or not if present , If condition will execute if not then else condition 
//			will execute
		{
			System.out.println("is Enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		

	}

}
