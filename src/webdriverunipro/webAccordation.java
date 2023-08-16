package webdriverunipro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webAccordation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		
		Actions ac = new Actions (driver);
		WebElement live = driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
		ac.moveToElement(live).build().perform();
		
		WebElement appautomate = driver.findElement(By.xpath("//*[@id=\"automation-accordion\"]"));
		appautomate.click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);


	}

}
