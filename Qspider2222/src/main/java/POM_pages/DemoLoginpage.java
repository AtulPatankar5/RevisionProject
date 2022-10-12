package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginpage {

	
	@FindBy(name="addresstype")
	private WebElement dropdown;
	
	@FindBy(id="course")
	private WebElement coursebutton;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	public DemoLoginpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCoursebutton() {
		return coursebutton;
	}
	
	public void seleniumtr() {
		seleniumtraining.click();
	}

	public WebElement getDropdown() {
		return dropdown;
	}
}
