package daer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fenceng {
	
	 public static WebDriver driver;
	 
	 public void beforeClass() 
	  {

		  System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		  driver=new ChromeDriver();
			String url="http://www.baidu.com/";
			driver.get(url);
			
			
	  }
}
