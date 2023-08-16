package webdriverunipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		

		driver.get("https://www.webdriveruniversity.com/Actions/index.html#");
		
		  WebElement sourceElement = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/p/b"));

	        // Find the target element to drop
	        WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

	        // Create an instance of Actions class
	        Actions actions = new Actions(driver);

	        // Perform drag and drop action
	        actions.dragAndDrop(sourceElement, targetElement).build().perform();
		
		 WebElement element = driver.findElement(By.cssSelector("#double-click > h2:nth-child(1)"));

	        // Create Actions object
	        Actions actions1 = new Actions(driver);

	        // Perform double click action
	        actions1.doubleClick(element).build().perform();
	        
	        Actions ac = new Actions (driver);
			WebElement homfirst = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
			ac.moveToElement(homfirst).build().perform();
					
			WebElement homthird = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));
			homthird.click();	
			
			Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[2]")));
           dropdown.selectByVisibleText("Link 1");
           
           WebElement dont = driver.findElement(By.cssSelector("#click-box"));

           // Create Actions object
           Actions actions2 = new Actions(driver);

           // Perform click-and-hold action
           actions2.clickAndHold(dont).build().perform();
            
	}

}
