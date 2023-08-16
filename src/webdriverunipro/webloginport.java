package webdriverunipro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webloginport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
		username.sendKeys("jewel");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123pass");
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		login.click();
		
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		


	}

}
