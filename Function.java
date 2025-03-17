package PrinceCookingPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import TestBase.BaseClass;

public class Function extends BaseClass{
  @Test
  public void Homefunction() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.name("uemail")).sendKeys("feroz@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("feroz");
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  Thread.sleep(5000);
	  JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("window.scrollBy(0,800)", "");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[text()='›']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[text()='›']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[text()='›']")).click();
	  Thread.sleep(2000); 
	  driver.findElement(By.xpath("//img[contains(@alt,'Biryani')]")).click();    
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[contains(@alt,'Others')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[contains(@alt,'Bread')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[contains(@alt,'Gravy')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[text()='‹']")).click();
	  driver.findElement(By.xpath("//button[text()='‹']")).click();
	  driver.findElement(By.xpath("//img[contains(@alt,'Sweets')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//img[contains(@alt,'Chicken')]")).click();
	  Thread.sleep(2000);  
	  
	  Actions act=new Actions(driver);
	  
	  act.sendKeys(Keys.CONTROL).build();
	  act.sendKeys(Keys.SHIFT).build();
	  act.sendKeys("S").perform();
	  Thread.sleep(2000);
	  
  }
}
