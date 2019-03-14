import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class Test_zuoye_12_12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.cnblogs.com/";
		driver.get(url);
		
		//鼠标悬停
		WebElement e=driver.findElement(By.xpath("//*[@id=\"cate_item_2\"]/a"));
		 Actions actions = new Actions(driver);
		 actions.clickAndHold(e).perform();
		 
		 //文本选择Java
		WebElement  e1 =  driver.findElement(By. partialLinkText( "Java" ));
		 e1.click();
		 
		
		 //输入Java
		WebElement e2=driver.findElement(By.xpath("//*[@id=\"zzk_q\"]"));
		e2.sendKeys("Java");
		
		//点击找找看
		 WebElement e3=driver.findElement(By.xpath("//*[@id=\"search_block\"]/div[1]/input[2]"));
		 e3.click();
		
		//输出该页面的查询结果
		//*[@id="searchInfo"]/span[2]
		
		 
		 Thread.sleep(15000);
		 
		 
		 
		//正确搜索数量	/	失败截图
		 try {
		    	driver.findElement(By.xpath("//*[@id=\"searchResult\"]/div[2]/div[1]/h3"));
		    	System.out.println("搜索到："+driver.findElement(By.id("CountOfResults")).getText()+"结果");
		    	//获取标题
		    	System.out.println(driver.findElement(By.xpath("title标题是："+"//*[@id=\"searchResult\"]/div[2]/div[1]/h3/a")).getText());
		    	 //输入上一页面
				 driver.navigate().back();
				
				 
				 
		    }
		 catch(Exception a)
		 {
		    	File screenShotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				try 
				{
					FileUtils.copyFile(screenShotFile, new File("E:/test.png"));
				}
				catch(Exception f) 
				{
					a.printStackTrace();
				}
		 
	
		    }
		
		 
		 
			
	}
		

}
