package com.SeleniumJava_Maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//-------- 1.single select drop down--------//

public class HandleHtmlDropdowns_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(4000);
		
		WebElement courseElement = driver.findElement(By.id("course")); // first we need to find the element, then only we can do operations on that element (EX: send keys to textbox/ getting elements etc..)
		Select courseNameDropdown = new Select(courseElement);  //creat obj/instance for 'Select' class. creating this class bcz we are working with Dropdowns.
																//inside 'Select' class it has child elements.
		List<WebElement> courseNameDropDownOptions = courseNameDropdown.getOptions(); //it will give list of webElements(java,python,.net)
		for(WebElement option : courseNameDropDownOptions) { //iterating and getting multiple options in console(one by one )
			System.out.println(option.getText());
		}
		
		courseNameDropdown.selectByIndex(1); //Java
		Thread.sleep(2000);
		courseNameDropdown.selectByValue("net"); //Dot Net
		Thread.sleep(2000);
		courseNameDropdown.selectByVisibleText("Javascript"); //Javascript
		
		 
//		courseNameDropdown.getFirstSelectedOption().getText(); // getting selected option(JAVA or python or dotnet)
		//-----or----
		String selectedTxt = courseNameDropdown.getFirstSelectedOption().getText();
		System.out.println("You have Selected this : "+selectedTxt);
	}
}
