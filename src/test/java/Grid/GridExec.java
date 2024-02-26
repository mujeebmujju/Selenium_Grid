package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExec 
{
	RemoteWebDriver driver;
	@Test
	public void sample() throws Throwable 
	{

		URL url = new URL("http://192.168.127.111:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		new RemoteWebDriver(url, cap);
	    driver.get("https://www.amazon.com");
		
		
	}
}
