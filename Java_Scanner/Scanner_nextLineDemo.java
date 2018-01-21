import java.util.Scanner;
//Scanner： nextLine()方法Demo
public class ScannerDemo2 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("nextLine()方法：");
		if(s.hasNextLine())
		{
			System.out.println(s.nextLine());
		}
		s.close();//打开记得关闭哦
	}
}
