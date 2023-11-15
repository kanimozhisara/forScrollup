package com.test;

import org.openqa.selenium.By;

public class CssSlector2 extends Base {

	public static void main(String[] args) throws InterruptedException {
		browserLaunch("https://adactinhotelapp.com/");

		// className tagName.className
//		driver.findElement(By.cssSelector("input.login_input")).sendKeys("kani1234");

//		Thread.sleep(5000);
		// using Attribute
//		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("kani1234");

		// multipleAttribute
//		driver.findElement(By.cssSelector("input[name='username'][id='username']")).sendKeys("kani1234");
		
		//contains*
//		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("kani1234");
		

		
		
	}

}
