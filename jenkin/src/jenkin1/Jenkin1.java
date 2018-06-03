package jenkin1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jenkin1 {
	@Test 
	public void Jenkin() throws InterruptedException{		
	System.setProperty("webdriver.chrome.driver", "F:\\Vamshi\\browserdriver\\chromedriver.exe");	
	ChromeDriver dr=new ChromeDriver();	
	dr.get("https://www.facebook.com");
	Thread.sleep(2000);
	dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("vamshieee262@gmail.com");
	dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Arundathi@1");
	dr.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	//https://github.com/Vamshi1608/Facebook.git
	}	
}

