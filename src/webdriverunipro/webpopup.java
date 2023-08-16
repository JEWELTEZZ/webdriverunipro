package webdriverunipro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpopup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		WebElement webclick = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/span/p"));
		webclick.click();
		
		 Alert alert = driver.switchTo().alert();

	        // Close the popup by accepting it
	        alert.accept();

	        // Switch back to the main window
	        driver.switchTo().defaultContent();	
	        
//       WebElement webclick1 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/span/p"));
//			webclick1.click();
//			
//			Thread.sleep(1000);
//		    Robot robot1 = new Robot();
//		    robot1.keyPress(KeyEvent.VK_SPACE);
//		    robot1.keyRelease(KeyEvent.VK_SPACE);	
//			 Alert alert1 = driver.switchTo().alert();
////
//		        // Close the popup by accepting it
//		        alert1.dismiss();
////			
//			WebElement closeButton = driver.findElement(By.cssSelector("button.btn"));
//			closeButton.dismiss();
		        
		        WebElement webclick2 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
				webclick2.click();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				WebElement clickme3 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/p"));
				clickme3.click();
				WebElement closeButton1 = driver.findElement(By.cssSelector("button.btn"));
				closeButton1.click();
				
				driver.navigate().back();
				
				WebElement webclick3 = driver.findElement(By.xpath("//*[@id=\"button4\"]"));
				webclick3.click();
				
				 Alert alert2 = driver.switchTo().alert();

			        // Close the popup by accepting it
			        alert2.accept();

			        // Switch back to the main window
			        driver.switchTo().defaultContent();	
				
				
	}

}
