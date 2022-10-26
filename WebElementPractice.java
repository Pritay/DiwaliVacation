package WebdriverKeysPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPractice {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritay\\OneDrive\\Desktop\\Browsers Jar\\Chrome105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println(email);
		if(email.isDisplayed()==true) {
			email.sendKeys("pritaybadge04@gmail.com");
		}else {
			System.out.println("The element is not displayed");
		}
	}

}
