package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver chromeBrowserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Gunaseelan V\\eclipse-workspace\\InterviewPreparation\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static String getPageTitle(String title) {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void seletById(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
	}

	public static String textFill(WebElement element, String value) {
		element.sendKeys(value);
		return value;
	}

	public static String excelDataRead(int rowNo, int cellNo) throws IOException {

		File f = new File("C:\\Users\\Gunaseelan V\\eclipse-workspace\\InterviewPreparation\\Excel\\Test Data.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet st = wb.getSheet("Data");
		String value = "";
		for (int i = 0; i < st.getPhysicalNumberOfRows(); i++) {
			Row row = st.getRow(rowNo);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(cellNo);
				int ct = cell.getCellType();
				if (ct == 1) {
					value = cell.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(cell)) {
					Date dcv = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
					value = s.format(dcv);
				} else {
					double d = cell.getNumericCellValue();
					long l = (long) d;
					value = String.valueOf(l);
				}
			}
		}
		return value;
	}

	public static void clik(WebElement element) {
		element.click();
	}

	public static String getAtribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public static void excelDataWrite(int rowNo, int cellNo, String data) throws IOException {
		File f = new File("C:\\Users\\Gunaseelan V\\eclipse-workspace\\InterviewPreparation\\Excel\\Test Data.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook();
		Sheet cs = wb.getSheet("Data");
		Row cr = cs.getRow(rowNo);
		Cell cc = cr.getCell(cellNo);
		cc.setCellValue(data);
		FileOutputStream fout = new FileOutputStream(f);
		wb.write(fout);
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static String getCurentURL() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id("id"));
		return element;

	}
}
