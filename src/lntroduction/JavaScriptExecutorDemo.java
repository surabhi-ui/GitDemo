package lntroduction;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");//it takes two argument but 2nd argument is optional, There is a simple script in javaScript to scroll 
//		That will place as argument , WINDOW LEVEL SCROLLING
		
//       note--> on Console when we will write window.scrollBy(0,500) hit enter we can see how scrolling is happening , 
//		window.scrollBy(0,500)(This is script)
		
//		Now we want to scroll a particular table present in web page , For this basically we need to call DOM object, document(DOM object)
//		Just like we have CSS selector in selenium similarly there is a QuerySelector in JavaScript, In selenium we used driver,findElement()...
//		just like that in JavaScript we will use document.querySElector("");....
		
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");//TABLE LEVEL SCROLLING
		
//	   document.querySelector('.tableFixHead').scrollTop=5000 -> copy from console , 
//		when we will hit this document.querySelector(".tableFixHead").scrollTop=5000, we can see how table will highlight
		
//		now we want to print sum of last row of that component table
		List<WebElement>values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i=0; i<values.size();i++) {
//			values.get(i).getText();// now this will give string value , how can we add strings values so first we convert in integer
//			Integer.parseInt(values.get(i).getText());
			sum=sum+Integer.parseInt(values.get(i).getText());
		}
//		System.out.println(sum);->296
//		System.out.println(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText());-->	Total Amount Collected: 296	
		String total = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();//-->296 is in string
		Assert.assertEquals(sum,Integer.parseInt(total) );//->convert that total in integer and compare that both whatever we have done sum is 
//		equals to total given on page or not 
		
		
	}

}
