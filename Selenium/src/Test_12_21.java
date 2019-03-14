import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;


public class Test_12_21 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//复制记录文件夹下的所有文件到记录b
		//FileHandler.copy(new File("E:\\a"), new File("E:\\b"));
		
		//将源目录下的所有文件夹和文件(后缀为.txt)复制到目的目录下
		//FileHandler.copy(new File("E:\\a"), new File("E:\\b"), ".txt");
		
		//将a里面的a.txt复制到b里面的1.txt
		//FileHandler.copy(new File("E:\\\\a\\a.txt"), new File("E:\\\\b\\1.txt"));
		//文件中写入内容
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
