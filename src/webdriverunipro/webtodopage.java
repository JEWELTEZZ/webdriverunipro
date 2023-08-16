package webdriverunipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class webtodopage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		
		WebElement newtodo = driver.findElement(By.xpath("/html/body/div/input"));
		newtodo.sendKeys("my new todo");
		
		Actions ac = new Actions (driver);
		WebElement live = driver.findElement(By.xpath("/html/body/div/ul/li[1]/span/i"));
		ac.moveToElement(live).build().perform();
		
		WebElement appautomate = driver.findElement(By.xpath("/html/body/div/ul/li[3]/span/i"));
		appautomate.click();

	}

}
