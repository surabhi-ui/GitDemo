package lntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		Dropdown with select tag
//		there is one class name as select in selenium , Now will create object for this select class
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);//First write this line (for practice purpose)
// when we create object of select class this dropdown object will come with lots of methods available in Select class
		dropdown.selectByIndex(3);
//		to see which optiont we have selected there is another method
		System.out.println(dropdown.getFirstSelectedOption().getText());
		// output-->USD
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//output--->AED
		
		// we can select by value also
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//output---> INR
		
//		These are three different ways to select option from the static dropdown

		
	}

}
