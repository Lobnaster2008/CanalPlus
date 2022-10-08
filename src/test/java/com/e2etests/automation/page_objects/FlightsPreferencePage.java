package com.e2etests.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;



public class FlightsPreferencePage {
	
	@FindBy(how = How.XPATH, using = "//input[@value = 'roundtrip']" )   
	public static WebElement tripRoad ;
	@FindBy(how = How.NAME, using = "passCount") 
	public static WebElement nombrePassengres ;
	@FindBy(how = How.NAME, using = "fromPort") 
	public static WebElement fromPort ;
	@FindBy(how = How.NAME, using = "fromMonth") 
	public static WebElement fromMonth ;
	@FindBy(how = How.NAME, using = "fromDay") 
	public static WebElement fromDay ;
	@FindBy(how = How.NAME, using = "toPort") 
	public static WebElement toPort ;
	@FindBy(how = How.NAME, using = "toMonth") 
	public static WebElement toMonth ;
	@FindBy(how = How.NAME, using = "toDay") 
	public static WebElement toDay ;
	@FindBy(how = How.NAME, using = "servClass") 
	public static WebElement classReservation ;
	@FindBy(how = How.NAME, using = "airline") 
	public static WebElement airline ;
	@FindBy(how = How.NAME, using = "findFlights") 
	public static WebElement btnContinue ;
	
	private ConfigFileReader configFileReader;
	public FlightsPreferencePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	public void gotToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url.mercury"));
	}
	
	public void ClickOnFlightsLink() {
		
	}
	public void selectTripType() throws InterruptedException {
		Thread.sleep(3000);
		tripRoad.click();
		
	}
	public void selectPassCount(String valeur) {
		Select  list = new Select(nombrePassengres);
		list.selectByValue(valeur);
	}
	public void selectFromPort(String port) {
		Select  list = new Select(fromPort);
		list.selectByValue(port);
		
	}
	public void selectFromDay(String day) {
		Select  list = new Select(fromDay);
		list.selectByValue(day);
	}
	public void selectFromMonth(String month) {
		Select  list = new Select(fromMonth);
		list.selectByValue(month);
	}
	public void selectToMonth(String month) {
		Select  list = new Select(toMonth);
		list.selectByValue(month);
	}
	public void selectToPort(String port) {
		Select  list = new Select(toPort);
		list.selectByValue(port);
	}
	public void selectToDay(String day) {
		Select  list = new Select(toDay);
		list.selectByValue(day);
	}
	public void selectClassFlihgt(String flight) {
		//classReservation.get
	}
	public void selectAirline(String airlineValue) {
		Select  list = new Select(airline);
		list.selectByVisibleText(airlineValue);
	}
	public void ClickOnContinue() {
		btnContinue.click();
	}
	
}
