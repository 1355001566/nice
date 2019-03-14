import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_12_12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///G:/selenium/frame.html";
		driver.get(url);
		
		
		driver.switchTo().frame("frame");
		String a=driver.findElement(By.id("div1")).getText();
		//driver.findElement(By.id("")).getText();
		
		driver.findElement(By.id("input1")).sendKeys(a);
		
		
		
		//打印当前网站的位置
		driver.switchTo().defaultContent();
		
		
		
		
	}

}
