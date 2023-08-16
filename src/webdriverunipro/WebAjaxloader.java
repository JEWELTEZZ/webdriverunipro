package webdriverunipro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAjaxloader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		

			driver.get("https://www.webdriveruniversity.com/Ajax-Loader/index.html");
			 WebElement button = driver.findElement(By.xpath("//p[@id='button1']/button"));
		        button.click();

		        // Wait until the AJAX loader is displayed
		       // WebDriverWait wait = new WebDriverWait(driver, 10);
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		        WebElement loader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loader")));

		        // Wait until the AJAX loader is hidden
		        wait.until(ExpectedConditions.invisibilityOf(loader));

		        // Get the text of the loaded content
		        WebElement loadedContent = driver.findElement(By.id("content"));
		        String contentText = loadedContent.getText();
		        System.out.println("Loaded Content: " + contentText);	
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		//WebDriverWait wait = new WebDriverWait(driver, 10);
//       // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/span/p")));
//		
//		WebElement clickme = driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/p"));
//		clickme.click();
//		WebElement closeButton = driver.findElement(By.cssSelector("button.btn"));
//		closeButton.click();

		//WebElement close = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button"));
		//close.click();
		
//        try {
//            Alert alert = driver.switchTo().alert();
//            alert.accept(); // Close the pop-up
//        } catch (Exception e) {
//            // No alert present, continue with the rest of the code
//        }
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		// driver.switchTo().defaultContent();

	}

}
