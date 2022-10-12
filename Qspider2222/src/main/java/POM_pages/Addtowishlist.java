package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Addtowishlist {

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement Addtowishlist;
	
	@FindBy(xpath="//div[@class='fullscreen-icon']")
	private WebElement fullscreen;
	
	@FindBy(xpath="//div[@class='unfullscreen-icon']")
	private WebElement unfullscreen;
	
	public Addtowishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fullscreenbutton() {
		fullscreen.click();
	}
	public void unfullscreenbutton()
	{
		unfullscreen.click();
	}
	public void playbutton() {
		playbtn.click();
	}
	public void pausebutton() {
		pausebtn.click();
	}
	public void addtowishistbutton() {
	Addtowishlist.click();
		
	}
	
	
}
