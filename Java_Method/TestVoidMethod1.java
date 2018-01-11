//通过值传递参数
public class TestVoidMethod1 {
	public static void main(String[] args)
	{
	   nPrintln("I love u:3344",2);//方法调用
	}
	
	public  static void nPrintln(String message,int n){
		for(int i=0;i<n;i++)
		{
			System.out.println(message);
		}
	}
}


result :
I love u:3344
I love u:3344
