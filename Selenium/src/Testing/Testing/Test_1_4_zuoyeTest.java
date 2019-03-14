package Testing.Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Test_1_4_zuoyeTest {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() 
  {
	  
	  System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		String url="http://localhost:8080/Banksys_ssh/";
		driver.get(url);
		
		WebElement input1 = driver.findElement(By.xpath("//*[@id=\"loginValidate_userNO\"]"));
		input1.sendKeys("1546588162571");
		
		WebElement input2 = driver.findElement(By.xpath("//*[@id=\"loginValidate_password\"]"));
		input2.sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]")).click();
		
  }
  
  

  @AfterClass
  public void afterClass() {
	  driver.switchTo().frame("mainFrame");
	  String a=driver.findElement(By.xpath("/html/body/center")).getText();
	  System.out.println(a);
	  driver.switchTo().defaultContent();
	  
  }


  @Test
  public void amain1() {
	  
	  driver.switchTo().frame("leftFrame");
	  driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame("mainFrame");
	  driver.findElement(By.xpath("//*[@id=\"smoneyValidate_money\"]")).sendKeys("500");
	  driver.switchTo().defaultContent();
  }
  @Test
  public void bmain2()
  {
	  driver.switchTo().frame("mainFrame");
	  driver.findElement(By.xpath("//*[@id=\"smoneyValidate\"]/table/tbody/tr[3]/td/div/input")).click();
	  driver.switchTo().defaultContent();

  }
  
  @Test
  public void cmain3()
  {
	  driver.switchTo().frame("mainFrame");
	  driver.findElement(By.xpath("//*[@id=\"smoneyValidate_money\"]")).sendKeys("500");
	
	  driver.switchTo().defaultContent();
  }
  @Test
  public void dmain4()
  {
	  driver.switchTo().frame("mainFrame");
	  driver.findElement(By.xpath("//*[@id=\"smoneyValidate_0\"]")).click();
	  driver.switchTo().defaultContent();
  }
}
