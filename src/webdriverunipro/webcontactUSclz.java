package webdriverunipro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webcontactUSclz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\One Team\\Automation\\chromedriver_win32\\chromedriver.exe");;
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://webdriveruniversity.com/");
		WebElement Contactus = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/a/div/div[1]/h1"));
	Contactus.click();
        WebElement firstNameInput = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
        WebElement lastNameInput = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
        WebElement commentsTextarea = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
        WebElement submitButton = driver.findElement(By.id("contact_form_submit"));

        // Fill in the form fields
        firstNameInput.sendKeys("John");
        lastNameInput.sendKeys("Doe");
        emailInput.sendKeys("johndoe@example.com");
        commentsTextarea.sendKeys("This is a test message.");

        // Submit the form
        submitButton.click();

        // Wait for a few seconds to see the result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
//		WebElement Contactus = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/a/div/div[1]/h1"));
//		Contactus.click();
//		
//		WebElement firstname = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[1]"));
//		firstname.sendKeys("jewel");
//		
//		WebElement lastname = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[2]"));
//		lastname.sendKeys("tess");
//		
//		WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[3]"));
//		email.sendKeys("123@gmail.com");
//		
//		WebElement comment = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/textarea"));
//		comment.sendKeys("this is a comment");
//		
//		WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/div/input[2]"));
//		submit.click();
//		
//		

		

	}

}
