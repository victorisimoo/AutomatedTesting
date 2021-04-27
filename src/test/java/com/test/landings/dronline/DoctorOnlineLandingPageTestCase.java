package com.test.landings.dronline;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DoctorOnlineLandingPageTestCase {
	
	private WebDriver driver;
	DoctorOnlineLandingPage landingPageDrOnline;

	@Before
	public void setUp() throws Exception {
		landingPageDrOnline = new DoctorOnlineLandingPage(driver);
		driver = landingPageDrOnline.chromeDriverConnection();
		landingPageDrOnline.visit("https://dronline-qa.doctor-online.co/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		assertTrue(landingPageDrOnline.youtubeVideo());
		landingPageDrOnline.contactUser();
		assertTrue(landingPageDrOnline.contactMessage());
	}

}
