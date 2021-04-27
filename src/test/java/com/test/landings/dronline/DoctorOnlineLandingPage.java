package com.test.landings.dronline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.pom.BaseTest;

public class DoctorOnlineLandingPage extends BaseTest{
	
	private By nameLocator = By.id("name");
	private By emailLocator = By.id("email");
	private By phoneNumberLocator = By.id("phone");
	private By contactBtnLocator = By.xpath("//button[@onclick=\"gtag_report_conversion('https://www.doctor-online.co/web/')\"]");
	private By contactMessageLocator = By.xpath("//div[@class=\"alert alert-success mt-3\"]");
	private By youtubeVideoLocator = By.xpath("//a[@href=\"https://youtu.be/BSetGHKG4Ec\"]");
	
	
	public DoctorOnlineLandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void contactUser() throws InterruptedException {
		try {
			Thread.sleep(200);
			type("Victor Hernandez", nameLocator);
			type("vhernandez@doctor-online.co", emailLocator);
			type("3545 1624", phoneNumberLocator);
			click(contactBtnLocator);
			
		} catch(Exception e) {
			System.out.println("Contact page was not found");
		}
	}
	
	public boolean youtubeVideo() throws InterruptedException {
		Thread.sleep(400);
		return isDisplayed(youtubeVideoLocator);
	}
	
	public boolean contactMessage() throws InterruptedException {
		Thread.sleep(400);
		return isDisplayed(contactMessageLocator);
	}

}
