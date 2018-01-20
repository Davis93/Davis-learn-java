import java.io.*;

public class fileStreamtest2 {
	public static void main(String[] args) throws IOException
	{
		File f= new File("Test.txt");
		
		FileOutputStream out=new FileOutputStream(f);//out  writer
		OutputStreamWriter writer=new OutputStreamWriter(out,"UTF-8");
		writer.append("中文输入");
		writer.append("\r\n");
		writer.append("English");
		writer.close();//关闭写入流
		out.close();//关闭输出流
		
		FileInputStream in=new FileInputStream(f);//in reader
		InputStreamReader reader=new InputStreamReader(in,"UTF-8");
		StringBuffer sb=new StringBuffer();
		while(reader.ready())//ready()
		{
			sb.append((char)reader.read());//转化成字符加载到StringBuffer对象上
		}
		System.out.println(sb.toString());
		reader.close();//关闭读取流
		in.close();//关闭输入流	
		
	}

}
