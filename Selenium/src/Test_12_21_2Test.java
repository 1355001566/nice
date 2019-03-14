import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_12_21_2Test {
	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		 driver=new ChromeDriver();
		String url="http://localhost:8080/mobile_mysql/index.jsp";
		driver.get(url);
		
		WebElement input = driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[1]/td[2]/input"));
		input.sendKeys("王巍");
		
		WebElement input1 = driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[2]/td[2]/input"));
		input1.sendKeys("123456");
		
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input")).click();
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[4]/td/a")).click();
		driver.close();
	
	}

	@Test
	public void testTest1() {
		
		String input1 =driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[1]/td/font/b")).getText();
		assertEquals("王巍",input1);
	}
	
	@Test
	public void testTest2() {
		
		DateFormat dateformat= new SimpleDateFormat("yyyy年MM月dd日 EEEE");
		Date date = new Date();
		String date1 = dateformat.format(date);
		String input2 =driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/table[2]/tbody/tr[2]/td")).getText();
		assertEquals(date1,input2);
		
		

		
		
	}
	

	

}
