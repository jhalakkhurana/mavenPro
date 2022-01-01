package TestCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LoginandLogouts.LoginandLogouts;
import initiatebrowers.Initatebrowers;

public class TestCase1 extends Initatebrowers {
	
	@Test 
	
	public void login() throws InterruptedException
	{
String url = "https://www.facebook.com/" ;
		
		d.get(url);
		LoginandLogouts l = new LoginandLogouts(d, pr);
		l.signup("Jhalakkhurana1991@gmail.com", "Attra@555");
		
	
	
		Thread.sleep(3000);
	String PageTitle = d.getTitle();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	System.out.println("Page Title is --"+PageTitle);
}

}
