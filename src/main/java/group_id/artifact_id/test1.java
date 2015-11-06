package group_id.artifact_id;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {
	
	protected static WebDriver driver;
	
	@Test
	public void  Test() {
		
		driver=new FirefoxDriver();
		
		driver.navigate().to("http://localhost:43198/wp-login.php");
		//driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.xpath("//label[@for=\"user_login\"]")).sendKeys("Kirill");
		driver.findElement(By.id("user_pass")).clear();
		driver.findElement(By.id("user_pass")).sendKeys("3B*nPyIvTTKdlNb2Zm");
		driver.findElement(By.className("submit")).click();
		
		driver.close();
		driver.quit();
	}

}
