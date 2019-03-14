
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jichuceng {
	 public static WebDriver driver;
	 public void beforeClass() 
	  {

		  System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		  driver=new ChromeDriver();
			String url="https://www.baidu.com/";
			driver.get(url);

	  }
}
