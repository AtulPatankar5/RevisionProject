package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoCubes {

	
	@FindBy(xpath="//a[text()=' Cocubes Verbal Aptitude']")
	private WebElement cocubes;
	
	public CoCubes(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void Cocubescouse() {
		cocubes.click();
	}
}
