package week2.assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 WebElement elementemail= driver.findElement(By.xpath("//input[@id='username']"));
		    elementemail.sendKeys("Demosalesmanager");
		    WebElement elementpwd= driver.findElement(By.xpath("//input[@id='password']"));
		    elementpwd.sendKeys("crmsfa");

		    WebElement btnlogin= driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		    btnlogin.click();
			WebElement elementBtn1= driver.findElement(By.linkText("CRM/SFA"));
			elementBtn1.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement contacts= driver.findElement(By.xpath("//a[text()='Contacts']"));
			contacts.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement createCont=driver.findElement(By.xpath("//a[text()='Create Contact']"));
			
			createCont.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 WebElement firstname= driver.findElement(By.xpath("//input[@id='firstNameField']"));
			 firstname.sendKeys("fgdsg");
			 WebElement lastname= driver.findElement(By.xpath("//input[@id='lastNameField']"));
			 lastname.sendKeys("dgdg");
			 WebElement firstlocalname= driver.findElement(By.xpath("//input[@name='firstNameLocal']"));
			 firstlocalname.sendKeys("assdd");
			 WebElement lastlocalname= driver.findElement(By.xpath("//input[@name='lastNameLocal']"));
			 lastlocalname.sendKeys("asdlakshmi");
			 WebElement deptname= driver.findElement(By.xpath("//input[@name='departmentName']"));
			 deptname.sendKeys("EEE");
			 
			 WebElement desc= driver.findElement(By.id("createContactForm_description"));
			 desc.sendKeys("ECEdept");
			 WebElement email= driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']"));
			 email.sendKeys("egjhdept@gmail.com");
			 Select obj=new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
			 obj.selectByVisibleText("Alaska");
			 
			 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); 
			 driver.findElement(By.xpath("//a[text()='Edit']")).click();
			System.out.println(driver.findElement(By.id("sectionHeaderTitle_contacts")).getText());
			
			 WebElement description= driver.findElement(By.name("description"));
			 description.clear();
			 WebElement note= driver.findElement(By.name("importantNote"));
			 note.sendKeys("haihello");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
			 driver.findElement(By.xpath("//input[@value='Update']")).click();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
			 System.out.println("The title is :"+driver.getTitle());
			
			
			 
			
		
			
			
			
	}

}
