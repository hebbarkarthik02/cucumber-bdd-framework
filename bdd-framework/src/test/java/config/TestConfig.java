package config;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobjects.PageobjectManager;

public class TestConfig {
	
	public WebDriver driver;
	public PageobjectManager pageobjectManager;
	public WebdriverConfig webdriverConfig;
	
	public TestConfig() throws IOException {
		webdriverConfig=new WebdriverConfig();
		pageobjectManager=new PageobjectManager(webdriverConfig.getWebdriver());
	}

}
