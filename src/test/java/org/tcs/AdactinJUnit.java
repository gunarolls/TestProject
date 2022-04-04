package org.tcs;

import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class AdactinJUnit {

	static BaseClass b;

	@BeforeClass
	public static void browserLaunch() {
		b = new BaseClass();
		b.chromeBrowserLaunch();
		b.windowMaximize();
		b.loadUrl("https://adactinhotelapp.com/");
	}
	@AfterClass
	public static void closeBrowser() {
		b.closeBrowser();
	}
	@Before
	public void beforeMethod() {
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void afterMethod() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test
	public void testCase1() {
		LoginPage lp = new LoginPage();
		WebElement txtUsername = lp.getTxtUsername();
		b.textFill(txtUsername, "gunarolls");
		WebElement txtPassword = lp.getTxtPassword();
		b.textFill(txtPassword, "qwerty12345");
		WebElement btnLogin = lp.getBtnLogin();
		b.clik(btnLogin);

	}

	@Test
	public void testCase2() {
		SearchHotel s = new SearchHotel();
		String curentURL = b.getCurentURL();
		WebElement dpdnLocation = s.getDpdnLocation();
		b.seletById(dpdnLocation, 2);
		WebElement dpdnHotels = s.getDpdnHotels();
		b.seletById(dpdnHotels, 3);
		WebElement dpdnRoomType = s.getDpdnRoomType();
		b.seletById(dpdnRoomType, 2);
		WebElement dpdnNumberOfRooms = s.getDpdnNumberOfRooms();
		b.seletById(dpdnNumberOfRooms, 2);
		WebElement dpdnAdultsPerRoom = s.getDpdnAdultsPerRoom();
		b.seletById(dpdnAdultsPerRoom, 3);
		WebElement dpdnChildrenPerRoom = s.getDpdnChildrenPerRoom();
		b.seletById(dpdnChildrenPerRoom, 1);
		WebElement btnSubmit = s.getBtnSubmit();
		b.clik(btnSubmit);
	}

	@Test
	public void testCase3() {
		SelectHotel sh = new SelectHotel();
		WebElement btnRadioSelectHotel = sh.getBtnRadioSelectHotel();
		b.clik(btnRadioSelectHotel);
		WebElement btnContinue = sh.getBtnContinue();
		b.clik(btnContinue);
	}

	@Test
	public void testCase4() throws IOException, InterruptedException {
		BookHotel bh = new BookHotel();
		WebElement txtFirstname = bh.getTxtFirstname();
		b.textFill(txtFirstname, b.excelDataRead(1, 0));
		WebElement txtLastname = bh.getTxtLastname();
		b.textFill(txtLastname, b.excelDataRead(1, 1));
		WebElement address = bh.getAddress();
		b.textFill(address, b.excelDataRead(1, 2));
		WebElement creditCardNumber = bh.getCreditCardNumber();
		b.textFill(creditCardNumber, b.excelDataRead(1, 3));
		WebElement creditCardType = bh.getCreditCardType();
		b.seletById(creditCardType, 2);
		WebElement creditCardExpMonth = bh.getCreditCardExpMonth();
		b.seletById(creditCardExpMonth, 5);
		WebElement creditCardExpYear = bh.getCreditCardExpYear();
		b.seletById(creditCardExpYear, 6);
		WebElement creditCardCvvNumber = bh.getCreditCardCvvNumber();
		b.textFill(creditCardCvvNumber, b.excelDataRead(1, 4));
		WebElement btnBookNow = bh.getBtnBookNow();
		b.clik(btnBookNow);
		Thread.sleep(8000);
		
		b.closeBrowser();
		
	}

}
