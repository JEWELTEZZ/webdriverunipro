package webdriverunipro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webobjectmodel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");
		
		WebElement more = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[2]/button/b"));
		more.click();
		
		
		Thread.sleep(1000);
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_SPACE);
	    robot.keyRelease(KeyEvent.VK_SPACE);
	    
	    WebElement ourproducts = driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/div/ul/li[2]/a"));
		ourproducts.click();
		
		Actions ac = new Actions (driver);
		WebElement live = driver.findElement(By.xpath("//*[@id=\"amp-img\"]"));
		ac.moveToElement(live).build().perform();
		
		WebElement appautomate = driver.findElement(By.xpath("//*[@id=\"nintendo\"]"));
		appautomate.click();
//		
//		Alert alert = driver.switchTo().alert();
//		//for close
//		alert.dismiss();
//		
		Thread.sleep(1000);
	    Robot robot1 = new Robot();
	    robot1.keyPress(KeyEvent.VK_SPACE);
	    robot1.keyRelease(KeyEvent.VK_SPACE);
	     
	    
	  
		
//		WebElement close = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[3]/button[2]"));
//		close.click();
//		
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
	}

}
