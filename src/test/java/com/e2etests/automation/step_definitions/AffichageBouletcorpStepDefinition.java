package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AffichageBouletcorpPage;

import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AffichageBouletcorpStepDefinition {
	
	public AffichageBouletcorpPage affichageBouletcorpPage;
	private String m ;
	public AffichageBouletcorpStepDefinition() {
		affichageBouletcorpPage = new AffichageBouletcorpPage();
	}
	
	@Given("Je me connecte sur le site BouletCorp")
	public void jeMeConnecteSurLeSiteBouletCorp() {
		affichageBouletcorpPage.goToUrl();
		m = affichageBouletcorpPage.GetNomBoulet();
	}
	@When("Je clique sur le boutton aleatoire")
	public void cliquerSurLeBouttonAleatoire() {
		affichageBouletcorpPage.ClickOnFlightButton();
	}
	@Then("Je verifie que le contenu de la page a change")
	public void verifierQueLeContenuDeLaPageAChange() {
		
		Assert.assertNotEquals(m, Setup.getDriver().getPageSource());
		//Assert.assertTrue(affichageBouletcorpPage.HomeUrl().contains(Setup.getDriver().getCurrentUrl()));
	}
	@Then("les widgets facebook , twitter et tumblr sont affichees")
	public void lesWiadgetsFacebookTwitterEtTumblrSontAffichees() throws InterruptedException {
		Assert.assertTrue(affichageBouletcorpPage.WidgetsExisting());
	}



}
