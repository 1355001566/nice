import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;



public class Test_12_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.baidu.com/";
		driver.get(url);
		
		/*
		List<WebElement> e=driver.findElements(By.className("mnav"));  //数组方法
		e.get(1).click();
		if(driver.getCurrentUrl().equals("https://www.hao123.com/"))  //字符串比较
		{
			System.out.println("当前页面是hao123的网站");
			WebElement e1=driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
			e1.sendKeys("selenium");
			WebElement e2=driver.findElement(By.xpath("//*[@id=\"search-form\"]/div[2]/input"));
			e2.click();
		}
		else
		{
			System.out.println("当前页面不是hao123的网站");
			driver.navigate().refresh();
		}
		*/
		
		/*   截图
		File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,new File("E:/a.jpg"));
			
		}
		catch(IOException e){
			
			e.printStackTrace();
		}
		
		*/
		
		
		
		
	}

}
