package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
	     driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("Santhosh"); //Enter first name 
	     driver.findElement(By.xpath("//button[@id='ext-gen334']")).click(); //Click find leads
	     driver.findElement(By.xpath("//a[contains(text(),'10366')]")).click(); // Click on first resulting lead
	    System.out.println(driver.getTitle()); //Verify the title page
	    driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click(); //Click Edit
	    driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear(); //Clear the old company name
	    driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Gratitude farms"); //Update the new company name
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click(); //Click Update button
	    WebElement display = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")); //Verify the updated company name
	    System.out.println(display.getText());
	    driver.close(); //close the browser
	    
	}
}
