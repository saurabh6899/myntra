package com.Stepdefinations;

import com.Base.Wait;
import com.Keywords.Keyword;
import com.Pages.Homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Browse extends Homepage {
	Homepage hp;
	Keyword key;
	Wait wait;

	@Given("User searches the product in the searchBox")
	public void clickOnSearchBox() {
		hp = new Homepage();
		hp.clickOnSearchBox("Raodster Casual Shoes");

	}

	@And("User should be able to see the relative product and the product should be add in the cart")
	public void clickOnProduct() {
		hp = new Homepage();
		hp.clickOnProduct();

	}

	@Then("User should be able to perform the Billing Process")
	public void addToBag() {
		key = new Keyword();
		hp = new Homepage();
		key.switchWindow();
		key.scrollWindow(0, 300);
		hp.clickOnShoeSize();
		hp.enterPinCode();
		hp.clickOnAddToBag();
		wait.elementToBeClickable(cartLogo);
		hp.clickOnCart();

	}

	@Given("User searches the product in the searchBox of Myntra")
	public void searchProduct() {
		hp = new Homepage();
		hp.clickOnSearchBox("Nike Shoes");

	}

	@When("User clicks on the product the product should be displayed with full of details")
	public void clickProduct() {
		hp = new Homepage();
		key = new Keyword();
		wait = new Wait();
		wait.elementToBeClickable(nikeShoeProduct);
		hp.clickonNikeShoe();

	}

	@And("User should be able to read the reviews and ratings")
	public void productDetails() {
		key = new Keyword();
		hp = new Homepage();
		key.switchWindow();
		key.scrollWindow(0, 900);
		hp.clickOnViewReviews();
		key.getAllReviews();

	}

	@Given("User Clicks on Jeans Under 899")
	public void UserClickOnJeans() {
		new Homepage().clickUnder899();

	}

	@Then("Verify if all jeans prices are under 899")
	public void verifyJeansUnder899() {
		hp = new Homepage();
		hp.getProductTitleAndPrices();
		hp.verifyPricesAreUnderCertainAmount(899);

	}
	
	@Given("User Clicks on Shoes Under 1499")
	  public void clickOnShoes() {
		hp = new Homepage();
		hp.clickOnMen();
		hp.clickShoeUnder1499();
		
	}
	
	@Then("Verify if all shoes price are under 1499")
	  public void verifyShoesUnder1499() {
        hp = new Homepage();
        hp.getShoesTitleAndPrices();
        hp.verifyShoePricesAreUnder1499(1499);
	}
	
	@Given("User searches Voyage Sunglasses in SearchBox")
	public void searchVoyageGlasses() {
		hp = new Homepage();
		hp.clickOnSearchBox("men Voyage Sunglasses");
	}
   
	@Then("all Voyage Sunglasses are Available with price")
	public void verifyVoyageSunglasses() {
        hp = new Homepage();
        hp.getSunglassesTitleAndPrices();
	}
	
	@Given("User Searches casual shirts in Mens Section")
	public  void searchCasualShirts() {
		hp = new Homepage();
		hp.clickOnSearchBox("mens Casual Shirts");
	}
	
	@Then("all casual shirts with their respecective brand name should be displayed")
	 public void allShirtsBrandName() {
		hp = new Homepage();
		hp.getCasualShirtBrnadName();

	}
	
	@Given("User clicks on the kids section")
	public void clickOnKidsSection() {
		hp = new Homepage();
		hp.clickOnKids();

	}
	
	@When("user scroll down and selects brand the brand MINI KLUB")
	public void clickOnMINIKLUB() {
		key = new Keyword();
		hp = new Homepage();
		key.scrollWindow(0, 350);
		hp.clickOnMiniKlub();

	}
	
	@Then("all MINI KLUB cloths with their prices should be displayed")
	public void listOfAllMINIKLUBProductWithTheirPrices() {
		hp = new Homepage();
		hp.getAllTheMINIKLUBProductName();

	}
	@Given("user clicks on the Ethnic wear section on homepage")
	public void ethnicWear() {
		key = new Keyword();
		hp = new Homepage();
		key.scrollWindow(0, 400);
		hp.clickOnEthnicWear();
	}
	
	@Then("all Ethnic wear cloths should be displayed with prices")
	 public void listOfAllEthnicWear() {
		hp = new Homepage();
		hp.getAllTheEthnicWearProducts();

	}
  
	
}
