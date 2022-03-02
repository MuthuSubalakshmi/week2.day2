package week2.assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://acme-test.uipath.com/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    WebElement elementemail= driver.findElement(By.xpath("//input[@id='email']"));
		    elementemail.sendKeys("kumar.testleaf@gmail.com");
		    WebElement elementpwd= driver.findElement(By.xpath("//input[@id='password']"));
		    elementpwd.sendKeys("leaf@12");
		    
		
		    WebElement btnlogin= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		    btnlogin.click();
			String title=driver.getTitle();
			System.out.println(title);
			WebElement btnlogout= driver.findElement(By.xpath("//a[text()='Log Out']"));
			btnlogout.click();
			
			driver.close();
		    
		 
		
	}

}
