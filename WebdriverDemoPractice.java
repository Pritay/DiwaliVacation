package WebdriverKeysPractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverDemoPractice {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritay\\OneDrive\\Desktop\\Browsers Jar\\Chrome105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
//		driver.get("https://www.google.co.in/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.navigate().back();
//		Dimension d = new Dimension(100,400);
//		driver.manage().window().setSize(d);
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		Point p = new Point(100,400);
//		driver.manage().window().setPosition(p);
		String expectedtitle="facebook";
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equalsIgnoreCase(actualtitle)) {
			System.out.println("Test Case is pass");
		}else {
			System.out.println("Test Case fail");
		}
		
	}

}
