package com.genrics.MavenFlightRadar24;

import org.openqa.selenium.JavascriptExecutor;

public class BasePage 
{
	public static void scrollWebPage(int x,int y,int times)
	{
		JavascriptExecutor jse=(JavascriptExecutor) BaseTest.driver;
		for (int i = 0; i < times; i++) 
		{
			jse.executeScript("window.scrollBy("+x+","+y+")");
		}
	}
}