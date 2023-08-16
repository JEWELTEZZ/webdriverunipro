package webdriverunipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		
		 WebElement fooditem = driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		 fooditem.sendKeys("Apple");
		 
		 WebElement fooditem1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/div/div/div"));
		 fooditem1.click();
		 
		 WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		 submit.click();

	}

}
