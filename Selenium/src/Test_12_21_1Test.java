import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_12_21_1Test {

	@Before
	public void setUp() throws Exception {
		System.out.println(1);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(2);
	}

	@Test
	public void testDiv() {
		
		//��һ����Ԥ�ڽ�����ڶ���Ϊʵ�ʽ��
		assertEquals(2,(Test_12_21_1.div1(6,3)));
		System.out.println(3);
	}

}
