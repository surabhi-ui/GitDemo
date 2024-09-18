package lntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.chromedriver", "C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
//		[see this lines in last
//		System.out.println(driver.findElements(By.tagName("iframe")).size());//this is another way first we will get how many frame present on 
//		web page and then we can proceed with the help of this 
//		driver.switchTo().frame(0);//so in this page we have only one frame so index will be 0, with the help on this we can also go inside frame
//		note-> we can also swicth the frame with the help of index
//		]
		
//		Unfortunately selenium don't have any knowledge of frames , If any content present in frame we can't access that as normal like
//		driver.findelemen with locators first we have to tell selenium about frames then after selenium will understand 
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));//select frame
		
//		driver.findElement(By.id("draggable")).click();//if we will not declare line no 17 , it will showing error because selenium will not be
//		able to connect with[driver.findElement(By.id("draggable")).click();] , first we have to tell that please go and search in frame
//		driver.findElement(By.id("drappable"));
		
		WebElement source = driver.findElement(By.id("draggable"));//box which we want to drag
		WebElement target = driver.findElement(By.id("droppable"));//box where we want to drop
		
//		now we will do drag and drop with actions inside the frame
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
//		After this if we want to perform outside the frame, web driver will not switch automatically , we have to tell selenium to came back on 
//		default content
		driver.switchTo().defaultContent();

	}

}
