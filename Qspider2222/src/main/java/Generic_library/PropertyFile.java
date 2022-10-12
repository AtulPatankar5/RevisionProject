package Generic_library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	
	
	public String getPropertyFile(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(Autoconstant.PropertyFilePath);
		p.load(fis);
		return p.getProperty(key);
		
	}
}
