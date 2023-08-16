package webdriverunipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webhidden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.webdriveruniversity.com/Hidden-Elements/index.html");
		
		WebElement webclick = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		webclick.click();
		
		WebElement closeButton = driver.findElement(By.cssSelector("#myModalMoveClick > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)"));
		closeButton.click();
//		 Alert alert = driver.switchTo().alert();
//
//	        // Close the popup by accepting it
//	        alert.accept();
//
//	        // Switch back to the main window
//	        driver.switchTo().defaultContent();	
	}

}
