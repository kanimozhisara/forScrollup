package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForScrollup {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement down = driver.findElement(By.xpath("//*[contains(text(),' Back to top')]"));
		WebElement up = driver.findElement(By.xpath("//*[contains(text(),'Sign in for your best experience')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		
		Thread.sleep(5000);
		System.out.println("done");
		js.executeScript("arguments[0].scrollIntoView(false)",up);
		System.out.println("completed");
	}

}
