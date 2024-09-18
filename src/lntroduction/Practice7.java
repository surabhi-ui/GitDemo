package lntroduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		WebElement table = driver.findElement(By.xpath("//table[@class='table-display']"));//first i have select that table which row and column no 
//		have to count 
		List<WebElement> rowList =  table.findElements(By.tagName("tr"));//no of rows 
		System.out.println(rowList.size());//print no of rows 
		
		List<WebElement> columnList = table.findElements(By.tagName("th"));//no of column
		System.out.println(columnList.size());//print no of columns
		
		WebElement secondRow = table.findElement(By.xpath("//table/tbody/tr[2]"));
		System.out.println(secondRow.getText());
		
	}

}
