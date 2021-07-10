package com.pom.MavenFlightRadar24;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genrics.MavenFlightRadar24.BaseTest;
import com.genrics.MavenFlightRadar24.ExcellLiberary;

public class POMFlightRadar 
{
	public WebDriver driver;
	
	@FindBy(id="searchBox")
	private WebElement searchBox;
	
	@FindBy(xpath = "//span[@class='base-icon arrow']")
	private WebElement mapTypeButton;
	
	@FindBy(xpath = "//button[@title='Full screen options']")
	private WebElement optionsButton;
	
	@FindBy(xpath = "(//span[@class='base-icon'])[8]")
	private WebElement fullScreenButton;
	
	public POMFlightRadar(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goToLatLonZoom(double latitude,double longitude,double zoom_level)
	{
		driver.get(BaseTest.url+longitude+","+latitude+"/"+zoom_level);
	}
	
	public void search() throws IOException
	{
		searchBox.sendKeys(ExcellLiberary.fetchExcelCellData(1, 1));
	}
	
	public void fullScreenMethod()
	{
		optionsButton.click();
		fullScreenButton.click();
	}
}
