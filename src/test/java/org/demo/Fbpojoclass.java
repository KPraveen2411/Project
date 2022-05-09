package org.demo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Fbpojoclass extends BaseClass {
	public Fbpojoclass() {
		PageFactory.initElements(driver, this);
		
	}
	@CacheLookup
	@FindBy(id="email")
	private WebElement txtuser;
	
	@CacheLookup
	@FindBys({
		
		@FindBy(id="pass"),
		@FindBy(xpath="//input[@name='pass']"),
		@FindBy(xpath="//input[@type='password']")
	})
	private WebElement txtpass;
	
	@CacheLookup
	@FindAll({
		
		@FindBy(xpath="//button[@value='1']"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement click;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getClick() {
		return click;
	}
}
