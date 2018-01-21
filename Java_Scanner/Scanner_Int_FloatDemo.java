import java.util.Scanner;
//int 与float判断,by davis Zhang in NBU，Library

public class ScannerDemo3 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入：");
		if(s.hasNextInt())
		{
			System.out.println("该输入为整数，该整数为："+s.nextInt());
		}
		else if(s.hasNextFloat())
		{
			System.out.println("该输入为小数，该小数为："+s.nextFloat());
		}
		else
		{
			System.out.println("输入有误，请检查再输！");
		}
		s.close();
	}
}
