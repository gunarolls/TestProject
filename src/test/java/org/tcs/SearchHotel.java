package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dpdnLocation;
	@FindBy(id="hotels")
	private WebElement dpdnHotels;
	@FindBy(id="room_type")
	private WebElement dpdnRoomType;
	@FindBy(id="room_nos")
	private WebElement dpdnNumberOfRooms;
	@FindBy(id="adult_room")
	private WebElement dpdnAdultsPerRoom;
	@FindBy(id="child_room")
	private WebElement dpdnChildrenPerRoom;
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	public WebElement getDpdnLocation() {
		return dpdnLocation;
	}
	public WebElement getDpdnHotels() {
		return dpdnHotels;
	}
	public WebElement getDpdnRoomType() {
		return dpdnRoomType;
	}
	public WebElement getDpdnNumberOfRooms() {
		return dpdnNumberOfRooms;
	}
	public WebElement getDpdnAdultsPerRoom() {
		return dpdnAdultsPerRoom;
	}
	public WebElement getDpdnChildrenPerRoom() {
		return dpdnChildrenPerRoom;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
}
