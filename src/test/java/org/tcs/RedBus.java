package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gunaseelan V\\eclipse-workspace\\InterviewPreparation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Salem");
		WebElement destination = driver.findElement(By.id("dest"));
		destination.sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).sendKeys("25-Feb-2022");
		driver.findElement(By.id("search_btn")).click();

	}

}
