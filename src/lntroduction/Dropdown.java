package lntroduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		when we click on from box then all the city name will open to select , blow line code  for click on "*From" block
//		after this all the list of city will open to select
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
//		Then after we will select City Bangaluru form "*from" dropDown
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		
//		Now there is no need to give "*To" path because after selecting "*From" city another "*To" section will automatically open with the list of City(In this URL case , we can not Talk about General case)
//		We will wait for some time to open "*To" list of City 
		Thread.sleep(1000);
//		from "*To" DropDown to select City Chennai
//		driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();
		
//		Some client do not allow to use index method to search path Then we will use Parent Child Relationship Method
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'MAA']")).click();
		
//		After selecting destination place calendar is open automatically in this page, so now we will select current date 
//		current date have unique class name so that we have use , but if we want to select future date month year then there is different 
//		Lecture for that will learn after 
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();//.ClassName
		

	}

}
