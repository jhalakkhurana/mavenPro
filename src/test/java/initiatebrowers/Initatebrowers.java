package initiatebrowers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Initatebrowers {
public ChromeDriver d;
public Properties pr ;
@BeforeClass
	
	public void loadchromebrowser()
	{
	System.setProperty("webdriver.chrome.driver", "../MavennId/chromedriver.exe");
	d = new ChromeDriver();
	
	File f = new File("../MavennId/src/test/java/Objects.properties");
	FileReader fr = null;
	try {
		fr = new FileReader(f);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	 pr = new Properties() ;
	try {
		pr.load(fr);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}