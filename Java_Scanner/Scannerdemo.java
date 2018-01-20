import java.util.Scanner;
//next()与nextLine()方法区别，next()部分输出，nextLine()可以完整输出
public class ScannerDemo {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);//get input from the keyboard
		
		System.out.println("next方式接收：");
		//判断是否还有输入
		if(s.hasNext())
		{
			String str1=s.next();
			System.out.println("输入数据为："+str1);
		}
		s.close();
	}
}
