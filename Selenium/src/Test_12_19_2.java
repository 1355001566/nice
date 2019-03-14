import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test_12_19_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///G:/selenium/selenium_html/demo1.html";
		driver.get(url);
		
		//Iframe:Input
		WebElement a=driver.findElement(By.xpath("//*[@id=\"user\"]"));
		a.sendKeys("自动化测试");
		
		//Iframe:Link
		WebElement b=driver.findElement(By.xpath("//*[@id=\"link\"]/a"));
		b.click();
		driver.navigate().back();
		
		//Iframe:Select
		WebElement e=driver.findElement(By.xpath("//*[@id=\"select\"]/select"));
		Select s =new Select(e);
		s.selectByIndex(2);
		
		//Iframe:RadioBox
		WebElement c=driver.findElement(By.className("Volvo"));
		c.click();
		
		//Iframe:CheckBox
		driver.findElement(By.name("checkbox1")).click();
		driver.findElement(By.name("checkbox2")).click();
		
		//Iframe:Button
		if(driver.findElement(By.xpath("//*[@id=\"button\"]/input")).isEnabled()) 
		{	
		}else 
		{
			System.out.println("此按钮不可用!");
		}
				
		//Iframe:Button
		driver.findElement(By.xpath("//*[@id=\"alert\"]/input")).click();
		Alert d=driver.switchTo().alert();
		d.accept();
		
		
		//Iframe:Upload
		driver.findElement(By.xpath("//*[@id=\"load\"]")).sendKeys("E:\\未来教育");
		
		
		//Iframe:Open New Window
		String currentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"open\"]/a")).click();
		driver.switchTo().window(currentWindow);	
		
		//Iframe:Wait
		driver.findElement(By.xpath("//*[@id=\"wait\"]/input")).click();
		Thread.sleep(5000);
		
		//Iframe:Action
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"action\"]/input"))).perform(); 
		
		
				
	}

}
