//对文件和目录进行操作
import java.io.IOException;
import java.io.File;
//目录和文件操作
public class FileDirDemo {
	public static void main(String[] args) throws IOException
	{
		File f=new File("E:/Test/zf.txt");
		//先进行判断，若不存在这个路径，创建文件
		if(!f.exists())
		{
			try
			{
				f.createNewFile();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		//创建d目录对象
		File d=new File("E:/Test/zf.txt");
		//判断是否为目录
		if(d.isDirectory())
		{
			//调用list()获取其所有文件
			String[] f1=d.list();
			//遍历文件
			for(String fileName:f1)
			{
				//用目录和文件名生成File对象
				File f2=new File(d.getPath()+File.separator+fileName);
				//分类打印
				if(f2.isFile())
				{
					System.out.println("file: "+f2.getName());
				}
				if(f2.isDirectory())
				{
					System.out.println("d: "+f2.getName());
				}
			}				
		}
		
	}

}
