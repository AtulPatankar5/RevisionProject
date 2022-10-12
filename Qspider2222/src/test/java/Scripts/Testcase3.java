package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic_library.Baseclass;
import POM_pages.Addtowishlist;
import POM_pages.CoCubes;
import POM_pages.SkillraryLoginpage;

public class Testcase3 extends Baseclass {

	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginpage s= new SkillraryLoginpage(driver);
		s.searchtb(pdata.getPropertyFile("coursename"));
		s.Searchbutton();
		
		CoCubes c= new CoCubes(driver);
		c.Cocubescouse();
		
		Addtowishlist a= new Addtowishlist(driver);
		driverutilities.switchtoframe(driver);
		a.fullscreenbutton();
		a.playbutton();
		Thread.sleep(8000);
		a.pausebutton();
		a.unfullscreenbutton();
		
		driverutilities.switchback(driver);
		a.addtowishistbutton();
		
	}
			
}
