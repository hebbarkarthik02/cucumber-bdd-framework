package stepdefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import config.TestConfig;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHooks {
	
	TestConfig testconfig;
	
	public CucumberHooks(TestConfig testconfig) {
		this.testconfig = testconfig;

	}

	@After
	public void teardown() throws Throwable {
		testconfig.webdriverConfig.getWebdriver().quit();
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws Throwable {
		WebDriver driver = testconfig.webdriverConfig.getWebdriver();
		if (scenario.isFailed()) {
			File sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}


}
