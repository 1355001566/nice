import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test_12_14_2 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.baidu.com/";
		driver.get(url);
		
		//点击登录
		driver.findElement(By.xpath("//*[@id=\"u1\"]/a[7]")).click();
		
		//等待
		Thread.sleep(5000);
		
		
		try {
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]")).sendKeys("15279560330");
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]")).sendKeys("13767552251");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();

		}catch(Exception e) {
			//点击用户名登录
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__footerULoginBtn\"]")).click();		
			//输入账号
			WebElement input = driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__userName\"]"));
			input.sendKeys("15279560330");	
			//输入密码
			WebElement input1 = driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__password\"]"));
			input1.sendKeys("13767552251");
			//点击不保存
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__memberPass\"]")).click();
			Thread.sleep(5000);	
			//登录	
			driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_10__submit\"]")).click();
		}
		//获得cookie
		Set<Cookie> cookies=driver.manage().getCookies();
		
		System.out.println("size："+cookies.size());
		Iterator<org.openqa.selenium.Cookie> itr=cookies.iterator();
		CookieStore cookieStore =new BasicCookieStore();
		while(itr.hasNext()) 
		{
			Cookie cookie=itr.next();
			BasicClientCookie bcco = new BasicClientCookie(cookie.getName(),cookie.getValue());
			bcco.setDomain(cookie.getDomain());
			bcco.setPath(cookie.getPath());
			cookieStore.addCookie(bcco);
			System.out.println(bcco.getName());
			System.out.println(bcco.getValue());
		}
		
		//输入输出流  类
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("E:/test.txt"));
		oos.writeObject(cookieStore);
		oos.close();
		
		driver.quit();
		}

	}


