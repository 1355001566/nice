import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Test_12_14_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.sina.com.cn/";
		driver.get(url);
		
		String currentWindow=driver.getWindowHandle();
		driver.findElement(By.linkText("����")).click();
		Set<String> w=driver.getWindowHandles();//�õ����д��ڵľ��
		for(String a:w)//���ȡһ�����
		{
			String title=driver.getTitle();//��ȡ����
			if(a.equals(currentWindow))
			{
				
				driver.switchTo().window(a);//ת���þ��ȥ
				driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/form/div[1]")).click();
				driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/form/div[1]/div[2]/ul/li[4]")).click();
				
				break;
			}
		
			
		}

		
		
		

	}

}
