package lntroduction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Surabhi Singh");
		driver.findElement(By.name("email")).sendKeys("Mahadev2344@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Mahakal@987");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select staticDropDowun = new Select(dropDown);
		staticDropDowun.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("15-05-2024");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		driver.quit();
		
		

	}

}
