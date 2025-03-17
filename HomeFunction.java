package PrinceCookingPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import TestBase.BaseClass;

public class HomeFunction extends BaseClass {
  @Test
  public void Function() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.name("uemail")).sendKeys("feroz@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("feroz");
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,400)", "");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='Get Started']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//h6[text()='Add to cart'])[1]")).click();
	  driver.findElement(By.xpath("(//a[@data-discover='true'])[1]")).click();
	  jse.executeScript("window.scrollBy(0,-400)", "");
	  driver.findElement(By.xpath("//button[text()='+']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.name("street")).sendKeys("Kolar");
	  driver.findElement(By.name("city")).sendKeys("Kolar");
	  driver.findElement(By.name("lm")).sendKeys("Kolar");
	  driver.findElement(By.name("state")).sendKeys("Kolar");
	  driver.findElement(By.name("delivery")).sendKeys("06 06 2023 07 07 AM");
	  jse.executeScript("window.scrollBy(0,200)", "");
	  driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	  Thread.sleep(2000);
  } 
}     
