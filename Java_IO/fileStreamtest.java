import java.io.*;
//可能会存在乱码问题，用fileStreamtest2来解决，（我感觉此例是对字符进行操作）
public class fileStreamTest {
		public static void main(String[] args) 
		{
			try 
			{
				byte bWrite[]={11,21,3,40,5};
				OutputStream os=new FileOutputStream("test.txt");
				for(int i=0;i<bWrite.length;i++)
				{
					os.write(bWrite[i]); //writes the bytes
				}
				os.close();
				
				InputStream is = new FileInputStream("test.txt");
				int size= is.available();//available 返回下一次对此输入流调用方法可以不受阻地从此输入流读取字节数，返回一个整数值
				
				for(int j=0;j<size;j++)
				{
					System.out.println((char)is.read()+" ");
				}
				is.close();
			}catch(IOException e){
				System.out.println("Exception happens!!!!");
				}
			}
			
		}
