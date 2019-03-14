package Testing.Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException; 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Test_ceshiTest {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
			driver=new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  
  }

  
  @DataProvider(name="user")
  public Object[][] Users(){
  return new Object[][]{
  {"152795603","ww13767552251"},
  {"15279560330","ww13767552251"}
 
  };
  }


  @Test(dataProvider="user")
  public void testCase(String username,String password) throws Exception {
	  driver.get("https://www.baidu.com/");
	  driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
	  
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();
	 
	  
	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).sendKeys( username);
	  
	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).sendKeys(password);

	  
	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__memberPass\"]")).click();
	  
	  Thread.sleep(6000);
	  
	  driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
	  

	  try {
		  driver.findElement(By.xpath("//*[@id=\"s_username_top\"]/span"));
	    	System.out.println("µÇÂ¼³É¹¦");
			 
	    }
	 catch(Exception a)
	 {
		 System.out.println("µÇÂ¼Ê§°Ü");
		 Thread.sleep(2000);
	    	File screenShotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try 
			{
			 	
			 	System.out.println(driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__error\"]")).getText());
			 	
			 	System.out.println(driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__error\"]/a")).getText());
				FileUtils.copyFile(screenShotFile, new File("E:/test.png"));
			}
			catch(Exception f) 
			{
				a.printStackTrace();
			}
	 

	    }
	 
  }
}
