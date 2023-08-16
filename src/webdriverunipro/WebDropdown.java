package webdriverunipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		 Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));

	        // Select the desired option by its visible text
	        dropdown.selectByVisibleText("Python");
	        Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")));
            dropdown1.selectByVisibleText("Maven");
            
            Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
            dropdown2.selectByVisibleText("CSS");
//            
//            Select checkbox = new Select(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input")));
//            checkbox.
            
            WebElement checkbox = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/label[1]/input"));

            // Check if the checkbox is already selected
            if (!checkbox.isSelected()) {
                // If not selected, click on it to select
                checkbox.click();
                
                WebElement checkbox1 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/label[3]/input"));

 
                if (checkbox1.isSelected()) {
                    
                    checkbox1.click();
                }
                    WebElement radio = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/form/input[2]"));

                    
                    if (!radio.isSelected()) {
                        
                        radio.click();
                    } 
                    
                  WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div[5]/div/div/form/input[1]"));

                    
                    if (!radio1.isSelected()) {
                        
                        radio1.click();
                    } 
                    
                 
                    Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]")));
                    dropdown3.selectByVisibleText("Apple");
                       
            }
            
            


	}

            }
