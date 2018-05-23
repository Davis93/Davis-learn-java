import java.io.*;

public class FileStringOut {
	public static void main(String[] args) throws IOException
	{
		File f1=new File("E:/Test/zf1.txt");
		PrintWriter pw=new PrintWriter(f1);
		pw.println("a");
		pw.println("b");
		pw.println("c");
		pw.close();
	}

}
