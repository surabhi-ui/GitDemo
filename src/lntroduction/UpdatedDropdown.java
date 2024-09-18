package lntroduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");//url
		
//		we want to select Passengers , This "divpaxinfo" id for click arrow to show options like  who's we want to choose adult, child etc
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
//		below line for click on '+' button to select no of adults
//		driver.findElement(By.id("hrefIncAdt")).click();
		//now we want to select for 5 adults and by default no starts from 1
		
//		we are learning while loop also there
//		int i = 1;
//		while(i<5) {	
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//			}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		output--> 1 Adult
		
		for(int i =1 ; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();	
			}
		
//		this line for click on done after adding no of adult so that we can go furthere
		driver.findElement(By.id("btnclosepaxoption")).click();
		
//		now 5 adult have selected in dropdown section, We can check to getText 
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		output--> 5 Adult
	}

}
