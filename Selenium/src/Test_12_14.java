import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_12_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///G:/selenium/%E8%A1%A8%E5%8D%95.html";
		driver.get(url);
		
		WebElement e=driver.findElement(By.name("yue"));
		Select s =new Select(e);
		
		//�������ķ�ʽ
		//s.selectByIndex(6);
		
		//��Value�ķ�ʽ
		//s.selectByValue("6");
		
		//���ı��ķ�ʽ
		s.selectByVisibleText("����");
		
		
		
	}

}
