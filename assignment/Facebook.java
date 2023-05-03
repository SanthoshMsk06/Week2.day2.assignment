package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import selenium.creation.SelectClass;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); //Launch the chromebrowser
        driver.get("https://en-gb.facebook.com/");  //Load the URL
        driver.manage().window().maximize(); //Maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //Add implicit wait
        driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click(); //Click on Create New Account button
        //Enter the first name
        driver.findElement(By.xpath("(//input [@type='text'])[2]")).sendKeys("Santhosh Kumar");
        //Enter the last name
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Muniyan");
        //Enter the mobile number
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9944845881");
        // Enterthe password
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("9894023583");
        
        //Handle all the three drop downs
        WebElement dd = driver.findElement(By.id("day"));
        Select options=new Select(dd);      
        options.selectByValue("6");
        
        WebElement month = driver.findElement(By.id("month"));
        Select mm=new Select(month);
        mm.selectByVisibleText("Sep");
      
        WebElement year = driver.findElement(By.id("year"));
        Select yy=new Select(year);
        yy.selectByValue("1997");
      
      //Select the radio button "Female"       
        driver.findElement(By.xpath("//input[@type='radio']")).click();

	} 

}
