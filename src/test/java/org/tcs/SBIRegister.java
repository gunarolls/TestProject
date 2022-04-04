package org.tcs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIRegister {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gunaseelan V\\eclipse-workspace\\InterviewPreparation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.onlinesbi.com/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.xpath("//span[text()='LOGIN']")).click();
		driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
		driver.findElement(By.xpath("//a[@onclick='fnNewUserClick();'] ")).click();		
		
	}

}
