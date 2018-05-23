import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//完成复制文件操作
public class FileCopy {
	public static void main(String[] args) throws IOException
	{
		File f1=new File("E:/Test/zf.txt");
		File f2=new File("E:/Test/zf1.txt");
		FileInputStream fin=new FileInputStream(f1);
		FileOutputStream fout=new FileOutputStream(f2);
		
		byte[] buff=new byte[256];//利用数组buff缓存数据
		int len=0;//读取文件长度
		while((len=fin.read(buff))>0) 
		{
			fout.write(buff,0,len);
		}
		fin.close();
		fout.close();
	}

}
