package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstname;
	@FindBy(id="last_name")
	private WebElement txtLastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditCardNumber;
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	@FindBy(id="cc_exp_month")
	private WebElement creditCardExpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement creditCardExpYear;
	@FindBy(id="cc_cvv")
	private WebElement creditCardCvvNumber;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	@FindBy (id="order_no")
	private WebElement orderNumber;
	
	public WebElement getTxtFirstname() {
		return txtFirstname;
	}
	public WebElement getTxtLastname() {
		return txtLastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getCreditCardExpMonth() {
		return creditCardExpMonth;
	}
	public WebElement getCreditCardExpYear() {
		return creditCardExpYear;
	}
	public WebElement getCreditCardCvvNumber() {
		return creditCardCvvNumber;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	public WebElement getOrderNumber() {
		return orderNumber;
	}
	
	
}
