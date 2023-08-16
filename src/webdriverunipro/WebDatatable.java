package webdriverunipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDatatable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.webdriveruniversity.com/Data-Table/index.html");
		
		 WebElement firstNameInput = driver.findElement(By.xpath("/html/body/div/div[2]/div/form/input[1]"));
		 firstNameInput.sendKeys("John");
		 
		 WebElement lastNameInput = driver.findElement(By.xpath("/html/body/div/div[2]/div/form/input[2]"));
		 lastNameInput.sendKeys("wick");
		 
		 WebElement Input = driver.findElement(By.xpath("/html/body/div/div[2]/div/form/textarea"));
		 Input.sendKeys("this is a input");
		 
		 WebElement submit = driver.findElement(By.xpath("/html/body/div/div[7]/div/div[1]/input[2]"));
		 submit.click();
		 
		 
		 
		 
		 

	}

}
