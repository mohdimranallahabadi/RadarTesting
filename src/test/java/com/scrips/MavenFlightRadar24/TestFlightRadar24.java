package com.scrips.MavenFlightRadar24;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genrics.MavenFlightRadar24.BasePage;
import com.genrics.MavenFlightRadar24.BaseTest;
import com.pom.MavenFlightRadar24.POMFlightRadar;

@Listeners(com.genrics.MavenFlightRadar24.Utility.class)
public class TestFlightRadar24 extends BaseTest
{
	@Test
	public void SeatchArea() throws IOException 
	{
		POMFlightRadar radar=new POMFlightRadar(driver);
		radar.fullScreenMethod();
		//radar.search();
		BasePage.scrollWebPage(1000, 200, 10);
		radar.goToLatLonZoom(41.30, -76.82, 11.5);
		radar.goToLatLonZoom(-76.43, 41.34, 8);
	}
}
