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
		driver.findElement(By.linkText("娱乐")).click();
		Set<String> w=driver.getWindowHandles();//得到所有窗口的句柄
		for(String a:w)//随机取一个句柄
		{
			String title=driver.getTitle();//获取标题
			if(a.equals(currentWindow))
			{
				
				driver.switchTo().window(a);//转到该句柄去
				driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/form/div[1]")).click();
				driver.findElement(By.xpath("/html/body/div[7]/div/div[1]/form/div[1]/div[2]/ul/li[4]")).click();
				
				break;
			}
		
			
		}

		
		
		

	}

}
