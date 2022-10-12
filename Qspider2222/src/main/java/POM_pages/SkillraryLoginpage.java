package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginpage {

	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement gobtn;
	
	@FindBy(xpath="//span[text()='GEARS']")
	private WebElement Gearsbutton;
	
	@FindBy(xpath="(//a[@href='https://demoapp.skillrary.com'])[1]")
	private WebElement Demoskill;
	
	public SkillraryLoginpage(WebDriver driver)
	{
PageFactory.initElements(driver, this);
	}
	
	public void gearbtn()
	{
		Gearsbutton.click();
	}
	public void demoapp()
	{
		Demoskill.click();
	}
	
	public void searchtb(String name ) {
		searchtb.sendKeys(name );
	}
	
	public void Searchbutton()
	{
		gobtn.click();
	}
}
