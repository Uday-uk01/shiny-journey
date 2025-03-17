package PrinceCookingPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestBase.BaseClass;

public class HomeLogin extends BaseClass{
  @Test
  public void Login() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Login']")).click();
	  driver.findElement(By.name("uemail")).sendKeys("feroz@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("feroz");
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  Thread.sleep(2000);
  }
}
