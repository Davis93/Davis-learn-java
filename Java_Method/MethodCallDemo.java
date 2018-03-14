//方法调用的两种形式，如下所示
public class MethodCallDemo {
	public static int max(int a,int b) //有返回值，运行完就是一个值
	{    int result;
		if(a>b)
		{
			result=a;
		}
		else
		{
			result=b;
		}
		return result;
	}
	public void run()//无返回值，只执行一遍，结束就退出
	{
		System.out.println("生命不息，健身不止！");
	}
	public static void main(String[] args)
	{
		int k=max(12,10);
		System.out.println("max(12,10)="+k);
		MethodCallDemo m= new MethodCallDemo();
		m.run();
	}
}
