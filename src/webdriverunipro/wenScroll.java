package webdriverunipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wenScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Scrolling/index.html");
		
	//	WebElement newtodo = driver.findElement(By.xpath(""));
	//	newtodo.sendKeys("my new todo");
		
		Actions ac = new Actions (driver);
		WebElement live = driver.findElement(By.xpath("//*[@id=\"zone1\"]"));
		ac.moveToElement(live).build().perform();
		
		WebElement appautomate = driver.findElement(By.xpath("//*[@id=\"zone2-entries\"]"));
		appautomate.click();
		
		WebElement appautomate1 = driver.findElement(By.xpath("//*[@id=\"zone3-entries\"]"));
		appautomate1.click();
		
		WebElement appautomate2 = driver.findElement(By.xpath("//*[@id=\"zone2-entries\"]"));
		appautomate2.click();
		
		WebElement appautomate3 = driver.findElement(By.xpath("//*[@id=\"zone3-entries\"]"));
		appautomate3.click();
		WebElement appautomate4 = driver.findElement(By.xpath("//*[@id=\"zone2-entries\"]"));
		appautomate4.click();
		
		WebElement appautomate5 = driver.findElement(By.xpath("//*[@id=\"zone3-entries\"]"));
		appautomate5.click();

	}

}
