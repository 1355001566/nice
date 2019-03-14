import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_12_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///G:/selenium/selenium_html/dragAndDrop.html";
		driver.get(url);
		
		WebElement a =driver.findElement(By.xpath("//*[@id=\"drag\"]"));
		
		WebElement b =driver.findElement(By.xpath("/html/body/h1"));
		//ÍÏ×§ÔªËØ
		//(new Actions(driver)).dragAndDrop(a,b).perform();
		
		//ÍÏ×§×ø±ê	½«aÍÏ×§µ½
		(new Actions(driver)).dragAndDropBy(a,-180,-30).perform();
		
		
	}

}
