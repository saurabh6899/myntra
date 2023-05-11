package com.Base;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Keywords.Keyword;
import com.Stepdefinations.Testbase;

public class Wait extends Keyword {
     static FluentWait<WebDriver> wait;
     
     static {
    	 Testbase base = new Testbase();
    	 wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60));
    	 wait.pollingEvery(Duration.ofSeconds(1));
    	 wait.ignoring(NoSuchElementException.class);
     }
     
     public static void statlenessOfElement(WebElement element) {
		wait.until(ExpectedConditions.stalenessOf(element));
	}
     
     public static void elementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
}
