package Generic_library;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	
	public void getPhoto(WebDriver driver,String name ) throws IOException
	{
		
		Date d= new Date();
		String currentDate = d.toString().replaceFirst(":", "-");
			
		TakesScreenshot ts= (TakesScreenshot)driver;
		File RAM = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File (Autoconstant.photoPath+currentDate+name+".png");
		FileUtils.copyFile(RAM, dest);

	}
	
}
