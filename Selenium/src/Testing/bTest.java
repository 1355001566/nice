package Testing;

import org.testng.annotations.Test;

public class bTest {
	public static int a=5;
	public static int b1=9;
	public static int c;
	@Test(groups = {"b"})  //分组xml调用
	public void testMain() {
	
		c=a+b1;
		System.out.println(c);
		
	}

}
