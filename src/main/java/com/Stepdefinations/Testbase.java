package com.Stepdefinations;

import com.Keywords.Keyword;

import io.cucumber.java.Before;

public class Testbase extends Keyword {
     
	@Before
	public static void setUp() {
		launchBrowser("chrome");
		launchUrl("https://www.myntra.com");
		maximizeBrowser();

	}
	
	
	public static void tearDown() {
		quitBrowser();

	}
}
