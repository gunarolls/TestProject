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

public class DemoClassDD {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass b = new BaseClass();
		
		b.chromeBrowserLaunch();
		
		b.loadUrl("https://adactinhotelapp.com/");
		b.windowMaximize();
		
		LoginPage lp = new LoginPage();
		WebElement txtUsername = lp.getTxtUsername();
		b.textFill(txtUsername, b.excelDataRead(0, 0));
		WebElement txtPassword = lp.getTxtPassword();
		b.textFill(txtPassword, b.excelDataRead(0, 1));
		WebElement btnLogin = lp.getBtnLogin();
		b.clik(btnLogin);
		
		SearchHotel s = new SearchHotel();
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
				
		WebElement orderNumber = bh.getOrderNumber();
		String atribute = b.getAtribute(orderNumber);
		b.excelDataWrite(3, 0, atribute);
		
		b.closeBrowser();
		
		
	}	
	
}