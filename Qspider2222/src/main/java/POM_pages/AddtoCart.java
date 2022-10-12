package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {

	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement plusaddtocart;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocart;
	
	public AddtoCart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getPlusaddtocart() {
		return plusaddtocart;
	}

	
	
	public void addtocartbtn()
	{
		addtocart.click();
	}
}
