package TestCases;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import initiatebrowers.Initatebrowers;

public class TestCase2 extends Initatebrowers{
	
	
	@Test
	public void clicksearchbutton()
	 
	{
String url = "https://www.facebook.com/" ;
		
		d.get(url);
		
d.findElement(By.linkText("Groups")).click();

	}
/*AfterClass 
public void closechromebrowser()
{
	d.close();
}*/
	
}