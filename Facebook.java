package week2.assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
			WebElement btncreateacct= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
			btncreateacct.click();
			
			        WebElement elementuser= driver.findElement(By.xpath("//input[@name='firstname']"));
					elementuser.sendKeys("xyz");
					
					WebElement elementlast= driver.findElement(By.xpath("//input[@name='lastname']"));
					elementlast.sendKeys("anbjn");
					
					WebElement elementemail= driver.findElement(By.xpath("//input[@name='reg_email__']"));
					elementemail.sendKeys("anbjn@abc.com");
	
					WebElement elementpwd= driver.findElement(By.xpath("//input[@id='password_step_input']"));
					elementpwd.sendKeys("anbssjn");
					
					
					Select fbday=new Select(driver.findElement(By.xpath("//select[@id='day']")));
					fbday.selectByValue("20");
					Select fbmon=new Select(driver.findElement(By.xpath("//select[@id='month']")));
					fbmon.selectByIndex(5);
					Select fbyear=new Select(driver.findElement(By.xpath("//select[@id='year']")));
					fbyear.selectByVisibleText("2011");

					WebElement radiobtn= driver.findElement(By.xpath("//input[@value='1']"));
					radiobtn.click();
					
					
					
					
		
		
		
	}

}
