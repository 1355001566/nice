import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gair {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver;
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("C:\\Users\\ÍõÎ¡\\AppData\\Local\\Google\\Chrome\\User Data");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new RemoteWebDriver(new URL("http://192.168.17.1:4444/wd/hub"),capabilities);
		Thread.sleep(15000);
		driver.get("http://www.baidu.com");
	}
}
