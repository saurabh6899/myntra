package com.Base;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Stepdefinations.Testbase;

public class Wait {
     static FluentWait<WebDriver> wait;
     
     static {
    	 Testbase base = new Testbase();
    	 wait = new WebDriverWait(base.driver, Duration.ofSeconds(20), Duration.ofMillis(500));
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
