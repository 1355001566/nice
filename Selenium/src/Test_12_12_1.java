import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_12_12_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///G:/selenium/dialogs.html";
		driver.get(url);
		
		driver.findElement(By.id("prompt")).click();
		//跳转至alert弹框页面
		Alert a=driver.switchTo().alert();
		//输值
		a.sendKeys("qwer");
		//等待时间
		Thread.sleep(5000);
		//点击确定按钮
		a.accept();

	}

}
