package WebdriverKeysPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritay\\OneDrive\\Desktop\\Browsers Jar\\Chrome105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> winds = driver.getWindowHandles();
		Iterator<String> iterate = winds.iterator();
		String firstwind = iterate.next();
		System.out.println(firstwind);
		driver.switchTo().window(firstwind);
		driver.findElement(By.xpath("//a[@title='Facebook Lite for Android.']")).click();
		Set<String> windssecond = driver.getWindowHandles();
		Iterator<String> seciterate = windssecond.iterator();
		String secowinds = seciterate.next();
		System.out.println(secowinds);
//		System.out.println("Title of second window");
		driver.findElement(By.xpath("//a[@title='Learn more about Meta Pay']"));
		Set<String> thirdwinds = driver.getWindowHandles();
		Iterator<String> iter = thirdwinds.iterator();
		iterate.next();
		iter.next();
		
		
		
	}
}
