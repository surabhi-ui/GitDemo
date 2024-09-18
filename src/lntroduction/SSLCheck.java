package lntroduction;


//import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
//		Some time in real time project we need to use proxy , So there is a class for Proxy
//		Proxy proxy = new Proxy();// This proxy object will come with many methods we can use according to our requirement
//		proxy.setHttpProxy("");//This http will be provided my our team ,we will declare as String and then 
//		options.setCapability("proxy", proxy);//Here will will provide proxy abject as 2nd argument so that our browser can understand and set this proxy
//		options.addExtensions();//We can add extensions in our chrome browser , We have to first download that file and give there path here
		
//		for more methods of options we can check on this link https://developer.chrome.com/docs/chromedriver/capabilities
//		If any file we want to download at specific location from our automated browser then 
//		ChromeOptions options = new ChromeOptions();
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("download.default_directory", "/directory/path");--> Here we will provide path where we want to download all the files
//		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.chromedriver","C:\\Users\\User\\Documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
