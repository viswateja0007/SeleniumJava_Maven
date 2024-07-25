package com.SeleniumJava_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBasicHtmlControls {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(2000);
		WebElement hindichk= driver.findElement(By.id("hindichbx"));
		hindichk.click();  //check
		Thread.sleep(3000);
		
		if(hindichk.isSelected()) 
			hindichk.click();//uncheck, hindi box already selected. if you click again it will uncheck.
			
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText()); //for getting normal text we use 'getText()'
		
		driver.findElement(By.id("navigateHome")).click();
	}
}
