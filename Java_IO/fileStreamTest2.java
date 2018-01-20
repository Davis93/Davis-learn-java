import java.io.*;
// to solve the error code write problem（感觉此例是对字节/字符串进行操作）
public class fileStreamTest2 {
	public static void main(String[] args) throws IOException
	{
		File f= new File("a.txt");
		FileOutputStream out= new FileOutputStream(f);
		OutputStreamWriter writer =new OutputStreamWriter(out,"UTF-8");
		
		writer.append("中文输入");//write to the buffered-zone
		writer.append("\r\n");// return换行
		writer.append("English");
		writer.close();
		out.close();
		
		FileInputStream in=new FileInputStream(f);
		InputStreamReader reader= new InputStreamReader(in,"UTF-8");
		
		StringBuffer sb=new StringBuffer();
		while (reader.ready())
		{
			sb.append((char)reader.read());//append用法
		}
		
		System.out.println(sb.toString());
		reader.close();
		in.close();
		
		
		
		
		
	}

}
