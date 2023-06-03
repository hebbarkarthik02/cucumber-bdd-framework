package pageobjects;

import org.openqa.selenium.WebDriver;

public class PageobjectManager {
	public WebDriver driver;
	 
	public PageobjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public Loginpage getLoginpageObject() {
		return new Loginpage(driver);
	}

}
