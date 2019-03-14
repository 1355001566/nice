import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_12_19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///G:/selenium/selenium_html/index.html";
		driver.get(url);
		
		
		//上传文件
		driver.findElement(By.xpath("//*[@id=\"load\"]")).sendKeys("E:\\未来教育");
		
		
		//多选框
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
		List<WebElement>op=e.findElements(By.tagName("option"));
		Actions a1=a.keyDown(Keys.SHIFT).click(op.get(0)).click(op.get(1));
		a1.perform();
		
		//输入内容
	}

}
