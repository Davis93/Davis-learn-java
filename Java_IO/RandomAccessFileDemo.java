//RandomAccessFile，随机存取文件类
import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException
	{
		File f1=new File("E:/Test/zf.txt");
		RandomAccessFile file=new RandomAccessFile(f1,"rw");
		//遍历数据
		for(int i=0;i<file.length();i++)
			//read(),seek(),write()
		{
			byte b=(byte) file.read();//读取一个字节
			char c=(char)b; //转型，为char型
			if(c=='a')
			{
				file.seek(i);
				file.write('c');
			}
		}
		file.close();//使用完记得关闭
	}
}
