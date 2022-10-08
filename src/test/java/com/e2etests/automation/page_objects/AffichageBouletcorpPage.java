package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;

import com.e2etests.automation.utils.Setup;

public class AffichageBouletcorpPage {
	
	
	private ConfigFileReader configFileReader;
	
	
	@FindBy(how = How.LINK_TEXT, using = "Aléatoire") 
	public static WebElement btnFlight ;
	@FindBy(how = How.XPATH, using = "//img[@title ='Facebook']") 
	public static WebElement ImgFacebook ;
	@FindBy(how = How.XPATH, using = "//img[@title ='Twitter']") 
	public static WebElement ImgTwitter ;
	@FindBy(how = How.XPATH, using = "//a[@title ='Share on Tumblr']") 
	public static WebElement ImgTumblr ;
	
	public AffichageBouletcorpPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url.bouletcorp"));	
	}
	
	public void ClickOnFlightButton() {
		btnFlight.click();
	}
	
	public String HomeUrl() {
		return configFileReader.getProperties("home.url.bouletcorp");
	}
	public String GetNomBoulet() {
		return Setup.getDriver().getPageSource();
	}
	public boolean WidgetsExisting() throws InterruptedException {
		Thread.sleep(3000);
		boolean res = ((ImgFacebook.isDisplayed()) && (ImgTwitter.isDisplayed()) && (ImgTumblr.isDisplayed()));
		return res  ;
	}
	
	

}
