package Testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class aTest {
	
	@DataProvider(name="test")
	public Object[][] data(){
		
		return new Object[][]
			{
				{"hello","world"}, //ѭ������
				{"ni","hao"}
			};
	}
	
	@Test(dataProvider="test")
	
	//@Parameters({"data1","data2"}) ��������һ�ַ���
	public void testMain(String data1,String data2) {
	
		
		
		System.out.println(data1);
		System.out.println(data2);
	}

}
