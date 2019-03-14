import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_12_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入网址：");
		String wangzhi=input.nextLine();
		String url=wangzhi;
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		String a=driver.getTitle();
		String b=driver.getCurrentUrl();
		try {
			driver.get(url);
		}
		catch(Exception e) 
		{
			System.out.println("网址输入错误，请重新输入：");
			String wangzhi2=input.nextLine();
			String ur2=wangzhi2;
			driver.navigate().refresh();
			driver.get(ur2);
		}
		if(driver.getCurrentUrl().equals("url")||driver.getCurrentUrl().equals("ur2"))
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
//		System.out.println("输入你要搜索的内容：");
//		String neirong=input.nextLine();
//		WebElement e=driver.findElement(By.id("kw"));
//		e.sendKeys(neirong);
//		WebElement e1=driver.findElement(By.id("su"));
//		e1.click();
//		driver.findElement(By.xpath("//*[@id=\"kw\"]"));
		
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"u1\"]/a[1]"));
		e1.click();
	}

}
