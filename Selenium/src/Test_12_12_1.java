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
		//��ת��alert����ҳ��
		Alert a=driver.switchTo().alert();
		//��ֵ
		a.sendKeys("qwer");
		//�ȴ�ʱ��
		Thread.sleep(5000);
		//���ȷ����ť
		a.accept();

	}

}
