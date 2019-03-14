import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_12_28Test {

	@Before
	public void setUp() throws Exception {
		System.out.println(1);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(2);
	}

	@Test
	public void testMain() {
		System.out.println(3);
		
	}
	public void testMain1() {
		System.out.println(4);
		
	}
	@BeforeClass
	public static void setUp1() throws Exception {
		System.out.println(5);
	}

	@AfterClass
	public static void tearDown1() throws Exception {
		System.out.println(6);
	}

}
