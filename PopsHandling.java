package WebdriverKeysPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopsHandling {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritay\\OneDrive\\Desktop\\Browsers Jar\\Chrome105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String wh = driver.getWindowHandle();
		System.out.println(wh);
	}

}
