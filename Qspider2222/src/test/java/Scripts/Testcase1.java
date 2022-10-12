package Scripts;

import org.testng.annotations.Test;

import Generic_library.Baseclass;
import POM_pages.AddtoCart;
import POM_pages.DemoLoginpage;
import POM_pages.SkillraryLoginpage;

public class Testcase1 extends Baseclass {
	
	@Test
	public void tc1() {
		SkillraryLoginpage s= new SkillraryLoginpage(driver);
		s.gearbtn();
		s.demoapp();
		
		DemoLoginpage d= new DemoLoginpage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.mousehover(driver,d.getCoursebutton());
		d.seleniumtr();
		
		AddtoCart a= new AddtoCart(driver);
		driverutilities.doubleclick(driver,a.getPlusaddtocart());
		a.addtocartbtn();
		driverutilities.alertpopup(driver);
		
	}
	
		
	

}
