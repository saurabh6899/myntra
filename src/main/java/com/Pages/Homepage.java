package com.Pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Keywords.Keyword;
import com.Stepdefinations.Testbase;

public class Homepage {
	Keyword keyword = null;

	public Homepage() {
		Testbase base = new Testbase();
		PageFactory.initElements(Keyword.driver, this);
		keyword = new Keyword();
	}

	/** =========================WebElements========================== **/

	@FindBy(xpath = "//input[@placeholder=\"Search for products, brands and more\"]")
	public WebElement searchBox;

	@FindBy(xpath = "(//div[@class=\"product-imageSliderContainer\"])[2]")
	public WebElement product;

	@FindBy(xpath = "(//button[@class=\"size-buttons-size-button size-buttons-size-button-default\"])[2]")
	public WebElement shoeSize;

	@FindBy(xpath = "//span[@class=\"myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center\"]")
	public WebElement addToBag;

	@FindBy(xpath = "//input[@placeholder=\"Enter pincode\"]")
	public WebElement pinCode;

	@FindBy(xpath = "//span[@class=\"myntraweb-sprite desktop-iconBag sprites-headerBag\"]")
	public WebElement cartLogo;

	@FindBy(xpath = "//a[@href=\"/reviews/19935214\"]")
	public WebElement reviews;

	@FindBy(xpath = "(//div[@class=\"product-productMetaInfo\"])[3]")
	public WebElement nikeShoeProduct;

	@FindBy(xpath = "(//img[@class=\"image-image undefined image-hand\"])[15]")
	private WebElement under899;

	@FindBy(xpath = "//h3[@class=\"product-brand\"]")
	private List<WebElement> TitleList;

	@FindBy(xpath = "//span[@class=\"product-discountedPrice\"]")
	private List<WebElement> PriceList;
	
	@FindBy(xpath = "//a[@data-group=\"men\"]")
	private WebElement men;
	
	@FindBy(xpath = "(//img[@class=\"image-image undefined image-hand\"])[16]")
	private WebElement shoeUnder1499;
	
	@FindBy(xpath = "//h3[@class=\"product-brand\"]")
	private List<WebElement> shoeTitleList;
	
	@FindBy(xpath = "//div[@class=\"product-price\"]")
	private List<WebElement> shoePriceList;
	
	@FindBy(xpath = "//h4[@class=\"product-product\"]")
	private List<WebElement> titleOfSunglasses;
	
	@FindBy(xpath= "//div[@class=\"product-price\"]")
	private List<WebElement> pricesOfSunglasses;
	
	@FindBy(xpath = "//h3[@class=\"product-brand\"]")
	private List<WebElement> casualShirts; 
	
	@FindBy(xpath= "//a[@data-group=\"kids\"]")
	private WebElement kids;
	
	@FindBy(xpath= "(//img[@class=\"image-image undefined image-hand\"])[5]")
	private WebElement miniKlub;
	
	@FindBy(xpath = "//h3[@class=\"product-brand\"]")
	private List<WebElement> miniKlubProductName;
	
	@FindBy(xpath = "//div[@class=\"product-price\"]")
	private List<WebElement> pricesOfMINIKLUB;
	
	@FindBy(xpath = "(//img[@draggable=\"false\"])[21]")
	private WebElement ethnicWear;
	
	@FindBy(xpath = "//h3[@class=\"product-brand\"]")
	private List<WebElement> ethnicWearProductName;
	
	@FindBy(xpath = "//div[@class=\"product-price\"]")
	private List<WebElement> pricesEthnicWear;
	
	@FindBy(xpath = "//h3[@class=\"product-brand\"]")
	private List<WebElement> mensBeautyProduct;
	
	@FindBy(xpath ="//div[@class=\"product-price\"]")
	private List<WebElement> pricesOfMensBeautyProducts;
	

	

	/** ================================Methods============================== **/

	public void clickOnSearchBox(String string) {
		searchBox.click();
		searchBox.sendKeys(string);
		searchBox.sendKeys(Keys.ENTER);

	}

	public void clickOnProduct() {
		product.click();

	}

	public void clickOnShoeSize() {
		shoeSize.click();

	}

	public void clickOnAddToBag() {
		addToBag.click();

	}

	public void enterPinCode() {
		pinCode.click();
		pinCode.sendKeys("443101");
		pinCode.sendKeys(Keys.ENTER);
	}

	public void clickOnCart() {
		cartLogo.click();

	}

	public void clickOnViewReviews() {
		reviews.click();

	}

	public void clickonNikeShoe() {
		nikeShoeProduct.click();

	}

	public void clickUnder899() {
		under899.click();

	}

	public void getProductTitleAndPrices() {
		keyword = new Keyword();
		List<String> title = keyword.getListOfElements(TitleList);
		List<String> prices = keyword.getListOfElements(PriceList);
		keyword.iterateAndPrint(title,prices);
	}

	public void verifyPricesAreUnderCertainAmount(int expPrice) {
		keyword = new Keyword();
		List<String> prices = keyword.getListOfElements(PriceList);
		Iterator<String> itr1 = prices.iterator();
		boolean b = true;
		while (itr1.hasNext()) {
			String price = itr1.next();
			int numPrice = Integer.parseInt(price.split(" ")[1]);
			if (numPrice <= expPrice) {
			} else {
				System.out.println(numPrice + " is incorrect");
				b = false;
			}

		}
		Assert.assertTrue(b);

	}
	
	public void clickOnMen() {
		men.click();

	}
	
	public void clickShoeUnder1499() {
		shoeUnder1499.click();

	}
	
	public void getShoesTitleAndPrices() {
      keyword = new Keyword();
      List<String> title = keyword.getListOfShoe(shoeTitleList);
      List<String> price = keyword.getListOfShoe(shoePriceList);
      keyword.iterateAndPrint(title, price);
	}
	
	 public void verifyShoePricesAreUnder1499(int expPrice){
		 keyword = new Keyword();
		 List<String> prices = keyword.getListOfShoe(shoePriceList);
		 Iterator<String> itr = prices.iterator();
		 boolean a = true;
		 while(itr.hasNext()) {
			 String price = itr.next();
			 int actualPrice = Integer.parseInt(price.split(" ")[1]);
			 if (actualPrice<= expPrice) {				
			} else {
				System.out.println(actualPrice + "isIncorrect");
				a = false;
			}
			 
		 }
		 Assert.assertTrue(a);
		
	}
	 
	 public void getSunglassesTitleAndPrices() {
      keyword = new Keyword();
      List<String> title = keyword.getListOfSunglasses(titleOfSunglasses);
      List<String> price = keyword.getListOfSunglasses(pricesOfSunglasses);
      keyword.iterateAndPrintSunglasses(title, price);
	}
	 
	public void getCasualShirtBrnadName() {
		keyword = new Keyword();
		List<String> brand = keyword.getListOfMensCasualShirts(casualShirts);
		keyword.iterarteAndPrintCasualShirt(brand);
	} 
	 
	public  void clickOnKids() {
		kids.click();

	}
	
	public void clickOnMiniKlub() {
		miniKlub.click();

	}
	
	public void getAllTheMINIKLUBProductName() {
	 keyword = new Keyword();
	 List<String> productName = keyword.getListOfElements(miniKlubProductName);
	 List<String> prices = keyword.getListOfElements(pricesOfMINIKLUB);
	 keyword.iterateAndPrint(productName, prices);

	}
	
	public void clickOnEthnicWear() {
		searchBox.click();
		searchBox.sendKeys(" Mens Ethnic Wear");
		searchBox.sendKeys(Keys.ENTER);

	}
	
	public void getAllTheEthnicWearProducts() {
		keyword = new Keyword();
		List <String> productName = keyword.getListOfElements(ethnicWearProductName);
		List<String> prices = keyword.getListOfElements(pricesEthnicWear);
		keyword.iterateAndPrint(productName, prices);

	}
	
	public void searchMenBeautyProduct(String string) {
      searchBox.click();
      searchBox.sendKeys(string);
      searchBox.sendKeys(Keys.ENTER);
      
	}
	
	public void getListOfAllMensBeautyProducts() {
     keyword = new Keyword();
     List<String> productName = keyword.getListOfElements(mensBeautyProduct);
     List<String> prices = keyword.getListOfElements(pricesOfMensBeautyProducts);
     keyword.iterateAndPrint(productName, prices);
	}
	
	
	
}
