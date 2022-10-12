package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testingpage {

	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement Seleniumtraining;
	
	@FindBy(id="cartArea")
	private WebElement Carttab;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public Testingpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeleniumtraining() {
		return Seleniumtraining;
	}

	public WebElement getCarttab() {
		return Carttab;
	}

	public WebElement getFacebook() {
		return facebook;
	}
	
	public void facebookicon() {
		facebook.click();
	}
	
	
	
}
