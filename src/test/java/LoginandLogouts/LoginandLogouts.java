package LoginandLogouts;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginandLogouts {

	ChromeDriver d;
	Properties pr ; 
	
	public LoginandLogouts(ChromeDriver d , Properties pr )
	{
		
	this.d = d; 
	this.pr = pr ;	
	
	}
	
	public void signup(String username , String pass)
	{
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		d.findElement(By.name(pr.getProperty("name"))).sendKeys(username);

		d.findElement(By.name(pr.getProperty("pass"))).sendKeys(pass);
		
		d.findElement(By.name(pr.getProperty("Login"))).click();
		
	}
	
		
	}

