package com.genrics.MavenFlightRadar24;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Utility implements ITestListener
{
	public void onTestFailure(ITestResult arg)
	{
		TakesScreenshot shot=(TakesScreenshot)BaseTest.driver;
		File file=shot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFileToDirectoryIfModified(file, new File("./screenshot/image.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
