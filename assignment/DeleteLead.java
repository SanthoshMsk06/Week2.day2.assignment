package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//launch the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager"); //username
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa"); //password
	     driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); //login button
	     driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click(); //Click Crm/Sfa link
	     driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click(); //Click Leads link
	     driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();   //Click Find leads
	     driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click(); //Click phone
	     driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("9894023583"); // Enter phone number
	     driver.findElement(By.xpath("//button[@id='ext-gen334']")).click(); //Click find leads 
         WebElement display = driver.findElement(By.xpath("//div[text()='No records to display']"));
         System.out.println(display.getText());
         driver.close();
	}

}
