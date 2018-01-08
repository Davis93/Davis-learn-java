//why num1,num2 不变，m,n发生变化？？？？
public class TestPassByValue {
	public static void main(String[] args){
		int num1=1;
		int num2=2;
		System.out.println("交换前 num1="+num1+",num2="+num2);
		//调用swap方法
		swap(num1,num2);
		System.out.println("交换后 num1="+num1+",num2="+num2);
	}
	public static void swap(int m, int n)
	{
		System.out.println("交换前 m="+m+",n="+n);
		int temp;
		temp=m;
		m=n;
		n=temp;
		System.out.println("交换后 m="+m+",n="+n);
	}

}
