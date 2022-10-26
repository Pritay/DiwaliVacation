package WebdriverKeysPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractive {
	private static final String Takescreenshot = null;

	public static void main(String[]args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritay\\OneDrive\\Desktop\\Browsers Jar\\Chrome105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day);
		s.selectByVisibleText("4");
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	   Select sm = new Select(month);
	   sm.selectByIndex(8);
	   WebElement syrs = driver.findElement(By.xpath("//select[@id='year']"));
	  Select srg = new Select(syrs);
	  srg.selectByVisibleText("1994");
	  
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File drs = new File("E:\\Documents\\Automation Screenshot//facesign.png");
	 FileUtils.copyFile(src, drs);
	
	}
}
