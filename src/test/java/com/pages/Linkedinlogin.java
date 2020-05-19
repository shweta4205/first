package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Linkedinlogin {
	WebDriver driver;
	@FindBy(xpath = "/html/body/div[2]/a[1]")
	WebElement signin;
	

	@FindBy (id ="username")
	WebElement user;
	
	//WebElement element = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//String text = element.getText();
	//WebElement user;
	
	//WebDriver driver3;
	@FindBy (id ="password")
	WebElement pwd;
	
	//WebDriver driver4;
	@FindBy(xpath="//*[@id=\"app__container\"]/main/div[2]/form/div[3]/button")
	WebElement sub;
	
	public Linkedinlogin(WebDriver driver) {
		System.out.println("came here.............11111");
		this.driver = driver;
		System.out.println("came here.............x222222xx");
		PageFactory.initElements(driver,this);
	}

	
	public void Linkedinlogin1(String Email,String Password) {
		System.out.println("came here.............333333");
	user.sendKeys(Email);
	pwd.sendKeys(Password);
	System.out.println("came here.............444444");
	sub.click();

	}
	public void clickSigninbutton() {
		signin.click();
		
		
	}
}



