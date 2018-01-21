import java.util.Scanner;
//next() 方法Demo
public class ScannerDemo1 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);//实例化对象
		System.out.println("请输入：");
		if(s.hasNext())
		{
			System.out.println(s.next());
		}
		s.close();
	}

}
