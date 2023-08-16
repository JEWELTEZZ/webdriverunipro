package webdriverunipro;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webbuttonclickclz {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		
		WebElement webclick = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div[1]/div/div[2]/span/p"));
		webclick.click();
		
		WebElement closeButton = driver.findElement(By.cssSelector(".modal-md > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)"));
		closeButton.click();
		
//		Thread.sleep(1000);
//	    Robot robot = new Robot();
//	    robot.keyPress(KeyEvent.VK_SPACE);
//	    robot.keyRelease(KeyEvent.VK_SPACE);
		
		
//		Alert alert = driver.switchTo().alert();
//		//for close
//		alert.dismiss();
		//for submit
		//alert.accept();
		
		
		//String mainWindow = driver.getWindowHandle();

		// Perform actions to open the popup window

		// Switch to the popup window
//		for (String windowHandle : driver.getWindowHandles()) {
//		    driver.switchTo().window(windowHandle);
//		}
//
//		// Perform actions on the popup window if needed
//
//		// Close the popup window
//		driver.close();
//
//		// Switch back to the main window
//		driver.switchTo().window(mainWindow);

		
//		WebElement javaclick = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
//		javaclick.click();
//		
//		WebElement actionclick = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
//		actionclick.click();

	}

}
