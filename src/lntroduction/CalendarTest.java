package lntroduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String monthNumber = "6" ;
		String date ="15" ;
		String year = "2027";
		String[] expectedList = {monthNumber,date,year};
		driver.findElement(By.cssSelector(".react-date-picker__wrapper")).click();// From this click calendar will open 
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();//From this click month will open
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();//when again we will click on same place then year will open
		
//		So we want to select the year based on what we have declare "String year =  "2027";"
		driver.findElement(By.xpath("//button[(text()='"+year+"')]")).click();//avoid hard code and give variable for year select 2027 with the help
//		Concatenate method ("+")
		
//		if there is two class with space we need use one of them like class="react-calendar__tile react-calendar__year-view__months__month"
//		either this -> 'react-calendar__tile'  or this-> 'react-calendar__year-view__months__month'
//		If you have two classes separate with space we can not use css, we have to pick out of them
//		.react-calendar__year-view__months__month will give the all 12 months list but we want 6(june) so what we will do 
//	    month list will start from 0 not 1, we want to 6th month so , according to list June will be on 5 , monthNumber=6 , we will use
//		monthNumber-1 to get 5 position month which is June
		
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
//		in this we have avoided hard code use variable 
		
//		now we want to print that selected date/month/year , so if we are doing with locator it is showing // only because , for date date, month
//		and year declare in different different tag name like , Three sub html code here , that way we have to use loop
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i =0;i<actualList.size();i++) {
			System.out.println(actualList.get(i).getAttribute("value"));//getAttribute("value") because date, month and year has attribute 'value'
//			like value="15",value="6",value="2027"  thats why we used getAttribute()
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
			
		}
		driver.close();
	}

}
