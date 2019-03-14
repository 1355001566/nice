package daer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class fenlei extends fenceng{
	public static WebElement a;
	public static WebElement b;
	public static void find()
	{
		a=driver.findElement(By.id("kw"));
		b=driver.findElement(By.id("su"));	
	}
}
