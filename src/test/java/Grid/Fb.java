package Grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fb 
{
	@Test
	public void test()
	{
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("Mujeeb");
	    driver.findElement(By.id("pass")).sendKeys("123453");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	    driver.close();
		
	}

}
