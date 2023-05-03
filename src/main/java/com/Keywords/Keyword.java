package com.Keywords;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	public static WebDriver driver;
	private static final Logger LOG = Logger.getLogger(Keyword.class);

	public static void launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			chromeOptions.addArguments("--disable-Notifications");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void quitBrowser() {
		driver.quit();

	}

	public static void maximizeBrowser() {
		driver.manage().window().maximize();

	}

	public static void scrollWindow(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

	}
	
	public static void switchWindow() {
		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!parent.equals(window)) {
				driver.switchTo().window(window);
			}
		}

	}
	
	public static void getAllReviews() {
		List<WebElement> review = driver.findElements(By.xpath("//div[@class=\"detailed-reviews-userReviewsContainer\"]/child::div"));
		Iterator <WebElement> itr = review.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
			
		}

	}
	
	public static List<String> getListOfElements(List<WebElement> element) {
		Iterator<WebElement> itr = element.iterator();
		List<String> list = new ArrayList<>();
		while (itr.hasNext()) {
		 list.add(itr.next().getText());
			
		}
		return list;
	}
	public static  List<String> getListOfShoe(List<WebElement> element) {
		Iterator<WebElement> itr = element.iterator();
		List<String> list = new ArrayList<>();
		while (itr.hasNext()) {
          list.add(itr.next().getText());	
		}
		return list;
	}
	
	public static void iterateAndPrint(List<String> list, List<String> list2) {
		Iterator<String> itr = list.iterator();
		Iterator<String> itr1 = list2.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr.next()+" "+itr1.next());
			
		}
	
	}
	
	public static List<String> getListOfSunglasses(List<WebElement> element) {
		Iterator<WebElement> itr = element.iterator();
		List<String> list = new ArrayList<>();
		while (itr.hasNext()) {
        list.add(itr.next().getText())	;		
		}
		return list;
	}
	
	
	public static void iterateAndPrintSunglasses(List<String> list, List<String> list2) {
		Iterator<String> itr = list.iterator();
		Iterator<String> itr1 = list2.iterator();
		while (itr1.hasNext()) {
         System.out.println(itr.next()+" "+itr1.next());			
		}
	}
	
	public static List<String> getListOfMensCasualShirts(List<WebElement> element) {
		Iterator<WebElement> itr = element.iterator();
		List<String> list = new ArrayList();
		while (itr.hasNext()) {
		 list.add(itr.next().getText());	
		}
          return list;
	}
	
	public static void iterarteAndPrintCasualShirt(List<String> list) {
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
