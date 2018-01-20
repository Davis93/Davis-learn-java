//fileStreamTest.java 程序修改by Davis Zhang,异常情况没有提示输出，程序简化
import java.io.*;

public class fileStreamtest {
	public static void main(String[] args) throws IOException
	{
		
		File f= new File("test.txt");
		FileOutputStream out= new FileOutputStream(f);
		byte bWrite[]={11,21,3,40,5};
		for(int i=0;i<bWrite.length;i++)//i 定义且要被初始化
		{
			out.write(bWrite[i]);
		}
		out.close();//打开记得关闭
		
		InputStream in=new FileInputStream(f);
		int size=in.available();
		for(int j=0;j<size;j++)
		{
			System.out.println((char)in.read()+" ");
		}
		in.close();//打开记得关闭	
	}

}
