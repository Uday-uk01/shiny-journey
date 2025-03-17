package PrinceCookingPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestBase.BaseClass;

public class HomeRegistration extends BaseClass{
  @Test
  public void Navtest() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.xpath("//a[text()='Register']")).click();
	  driver.findElement(By.name("name")).sendKeys("feroz");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[contains(@name,'uemail')]")).sendKeys("feroz@gmail.com");
	  driver.findElement(By.name("address")).sendKeys("# cross Near RV school ");
	  driver.findElement(By.name("password")).sendKeys("feroz");
	  driver.findElement(By.xpath("//button[text()='Register']")).click();
	  Thread.sleep(3000);
  }
}
