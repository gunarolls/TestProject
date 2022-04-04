package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://adactinhotelapp.com/");
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("gunarolls");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("qwerty12345");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		WebElement dpdnLocation = driver.findElement(By.id("location"));
		Select s = new Select(dpdnLocation);
		s.selectByValue("New York");
		WebElement dpdnHotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(dpdnHotels);
		s1.selectByValue("Hotel Sunshine");
		WebElement dpdnRoomType = driver.findElement(By.id("room_type"));
		Select s2 = new Select(dpdnRoomType);
		s2.selectByValue("Deluxe");
		WebElement dpdnNoOfRooms = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(dpdnNoOfRooms);
		s3.selectByIndex(2);
		WebElement dateIn = driver.findElement(By.id("datepick_in"));
		dateIn.clear();
		dateIn.sendKeys("30/01/2021");
		WebElement dateOut = driver.findElement(By.id("datepick_out"));
		dateOut.clear();
		dateOut.sendKeys("31/01/2021");
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adultRoom);
		s4.selectByIndex(1);
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select s5 = new Select(childRoom);
		s5.selectByIndex(2);
		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		btnSubmit.click();
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
		WebElement txtFirstname = driver.findElement(By.id("first_name"));
		txtFirstname.sendKeys("John");
		WebElement txtLastname = driver.findElement(By.id("last_name"));
		txtLastname.sendKeys("wick");
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys("Chennai, tamilnadu. India");
		WebElement txtCreditCardNum = driver.findElement(By.id("cc_num"));
		txtCreditCardNum.sendKeys("2584879254789654");
		WebElement dpdnCreditcardType = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(dpdnCreditcardType);
		s6.selectByIndex(2);
		WebElement dpdnExpMonth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(dpdnExpMonth);
		s7.selectByIndex(2);
		WebElement dpdnExpYear = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(dpdnExpYear);
		s8.selectByIndex(7);
		WebElement txtCvvNumber = driver.findElement(By.id("cc_cvv"));
		txtCvvNumber.sendKeys("123");
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();

		Thread.sleep(8000);
		WebElement orderId = driver.findElement(By.id("order_no"));
		String attribute = orderId.getAttribute("value");
		System.out.println(attribute);
		
		driver.quit();
		
		
	}

}
