package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.FlightsPreferencePage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FlightsPreferenceStepDefinition {
	
	private FlightsPreferencePage flightsPreferencePage ;
	public FlightsPreferenceStepDefinition() {
		flightsPreferencePage = new FlightsPreferencePage();
	}
	@Given("Je me connecte sur le site web  Mercury")
	public void jeMeConnecteSurLeSiteMercury() {
		flightsPreferencePage.gotToUrl();
	}
	@When("Je clique sur le lien Flights")
	public void jeCliqueSurLeLienFlights() {
		flightsPreferencePage.ClickOnFlightsLink();
	}
	@When("Je coche l option  {string}")
	public void jeCocheLOption(String string) throws InterruptedException {
		flightsPreferencePage.selectTripType();
	}
	@When("Je selectionne passengers {string}")
	public void jeSelectionnePassengers(String flight) {
		flightsPreferencePage.selectPassCount(flight);
	}
	@When("Je selectionne l aeroport  de deprt {string}")
	public void jeSelectionneLAeroportDeDeprt(String port) {
		flightsPreferencePage.selectFromPort(port);
	}
	@When("Je selectionne le mois de depart {string}")
	public void jeSelectionneLeMoisDeDepart(String month) {
		flightsPreferencePage.selectFromMonth(month);
	}
	@When("Je selectionne le jour de depart {string}")
	public void jeSelectionneLeJourDeDepart(String day) {
		flightsPreferencePage.selectFromDay(day);
	}
	@When("Je selectionne l aeroport  Arrivee {string}")
	public void jeSelectionneLAeroportArrivee(String port) {
		flightsPreferencePage.selectToPort(port);
	   
	}
	@When("Je selectionne mois de retour {string}")
	public void jeSelectionneMoisDeRetour(String month) {
		flightsPreferencePage.selectToMonth(month);
	}
	@When("Je selectionne jour de retour {string}")
	public void jeSelectionneJourDeRetour(String day) {
		flightsPreferencePage.selectToDay(day);
	}
	@When("Je selectionne class {string}")
	public void jeSelectionneClass(String classF) {
		flightsPreferencePage.selectClassFlihgt(classF);
	}
	@When("Je seelctionne airline {string}")
	public void jeSeelctionneAirline(String airline) {
		flightsPreferencePage.selectAirline(airline);
	}
	@When("Je clique sur le boutton continuer")
	public void jeCliqueSurLeBouttonContinuer() {
		flightsPreferencePage.ClickOnContinue();
	}
	@Then("je me dirige vers page  {string}")
	public void jeVerifieLeMessage(String message) {
		Assert.assertEquals(Setup.getDriver().getCurrentUrl(), message);
	}



}
