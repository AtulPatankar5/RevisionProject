package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import Generic_library.Baseclass;
import POM_pages.DemoLoginpage;
import POM_pages.SkillraryLoginpage;
import POM_pages.Testingpage;

public class Testcase2 extends Baseclass{
	
	@Test
	public void tc2() throws IOException {
	
		SkillraryLoginpage s= new SkillraryLoginpage(driver);
		s.gearbtn();
		s.demoapp();
		
		DemoLoginpage d= new DemoLoginpage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.Dropdown(d.getDropdown(), pdata.getPropertyFile("courseadd"));;
		
		
		Testingpage t= new Testingpage(driver);
		driverutilities.draganddrop(driver, t.getSeleniumtraining(), t.getCarttab());
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y= loc.getY();
		driverutilities.scrollbar(driver, x, y);
		t.facebookicon();
		
	}

	
	
}
