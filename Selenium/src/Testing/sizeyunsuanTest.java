package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;

public class sizeyunsuanTest {
	sizeyunsuan s=new sizeyunsuan();
  @BeforeGroups(groups = "a")
  public void beforeClass() {
  }

  @AfterGroups(groups = "a")
  public void afterClass() {
  }


  @Test(groups = "a") //�����Բ���
  public void cheng() {
	  int result=s.cheng(4,5);
	  Assert.assertEquals(result, 20);
	  System.out.println("��һ");
   
  }

  @Test(groups = "a")
  public void chu() {
	  int result=s.chu(20,5);
	  Assert.assertEquals(result, 4);
	  System.out.println("��һ");
  }

  @Test(groups = "b")
  public void jia() {
   
	  int result=s.jia(4,5);
	  Assert.assertEquals(result, 9);
	  System.out.println("���");
  }

  @Test(groups = "b")
  public void jian() {
    
	  int result=s.jian(9,5);
	  Assert.assertEquals(result, 4);
	  System.out.println("���");
  }
}
