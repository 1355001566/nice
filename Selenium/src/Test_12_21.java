import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;


public class Test_12_21 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//���Ƽ�¼�ļ����µ������ļ�����¼b
		//FileHandler.copy(new File("E:\\a"), new File("E:\\b"));
		
		//��ԴĿ¼�µ������ļ��к��ļ�(��׺Ϊ.txt)���Ƶ�Ŀ��Ŀ¼��
		//FileHandler.copy(new File("E:\\a"), new File("E:\\b"), ".txt");
		
		//��a�����a.txt���Ƶ�b�����1.txt
		//FileHandler.copy(new File("E:\\\\a\\a.txt"), new File("E:\\\\b\\1.txt"));
		//�ļ���д������
		FileOutputStream out=new FileOutputStream("E:\\\\\\\\a\\\\a.txt");
		String str="aaa";
		byte[] b=str.getBytes();
		for(int i=0;i<str.length();i++)
		{
			
			out.write(b[i]);
		}
		
		out.close();
		String file = FileHandler.readAsString(new File("E:\\\\\\\\\\\\\\\\a\\\\\\\\a.txt"));
		System.out.println(file);
	}

}
