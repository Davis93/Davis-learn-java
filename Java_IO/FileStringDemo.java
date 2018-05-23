//字符流的读入和写出，本例子演示读入，readLine()

import java.io.*;
public class FileStringDemo {

		public static void main(String[] args) throws IOException
		{
			File f1=new File("E:/Test/zf.txt");
			InputStream in=new FileInputStream(f1);//获取输入流
			InputStreamReader isr=new InputStreamReader(in,"GBK");
			//创建BufferedReader来缓存数据
			BufferedReader br=new BufferedReader(isr);//创建Reader对象
			StringBuffer sb=new StringBuffer();
			String str=null;
			while((str=br.readLine())!=null)
			{
				sb.append(str);
			}
			System.out.println("zf.txt content is: "+sb);
			br.close();
		}

	}


