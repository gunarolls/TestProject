package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoClassPOM {

	public static void main(String[] args) throws IOException {
		BaseClass b = new BaseClass();
		b.chromeBrowserLaunch();
		b.loadUrl("https://adactinhotelapp.com/");
		b.windowMaximize();
		
		LoginPage lp = new LoginPage();
		WebElement txtUsername = lp.getTxtUsername();
		b.textFill(txtUsername, "johnwick7248");
		WebElement txtPassword = lp.getTxtPassword();
		b.textFill(txtPassword, "qwerty12345");
		WebElement btnLogin = lp.getBtnLogin();
		b.clik(btnLogin);
		SearchHotel s= new SearchHotel();
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
		
		SelectHotel sh = new SelectHotel();
		WebElement btnRadioSelectHotel = sh.getBtnRadioSelectHotel();
		b.clik(btnRadioSelectHotel);
		WebElement btnContinue = sh.getBtnContinue();
		b.clik(btnContinue);
		
		BookHotel bh = new BookHotel();
		WebElement txtFirstname = bh.getTxtFirstname();
		b.textFill(txtFirstname, "java");
		WebElement txtLastname = bh.getTxtLastname();
		b.textFill(txtLastname, "Selenium");
		WebElement address = bh.getAddress();
		b.textFill(address, "Chennai, Tamilnadu, India");
		WebElement creditCardNumber = bh.getCreditCardNumber();
		b.textFill(creditCardNumber, "1234567891234567");
		WebElement creditCardType = bh.getCreditCardType();
		b.seletById(creditCardType, 1);
		WebElement creditCardExpMonth = bh.getCreditCardExpMonth();
		b.seletById(creditCardExpMonth, 3);
		WebElement creditCardExpYear = bh.getCreditCardExpYear();
		b.seletById(creditCardExpYear, 5);
		WebElement creditCardCvvNumber = bh.getCreditCardCvvNumber();
		b.textFill(creditCardCvvNumber, "123");
		WebElement btnBookNow = bh.getBtnBookNow();
		b.clik(btnBookNow);
		
		b.closeBrowser();
		
		
	}
}