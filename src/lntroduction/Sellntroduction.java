package lntroduction;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Sellntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
       //Chrome -> ChromeDriver -> Methods 	
		
//		if we are not using selenium manager to automate on browser then we will go with this step System.setProperty-->
//		for Chrome
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
//		 for firefox
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Documents\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		For Microsoft edge
		System.setProperty("webdriver.edge.driver","C:\\Users\\User\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
//		if we want to hit any url then we will use get method
//		URl must be in string in " "
		driver.get("https://www.udemy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		to close the Browser First will show the information on browse and then will close the browse
//		driver.close();		
//		There is another method to close the browser 
		driver.quit();

	}

}
