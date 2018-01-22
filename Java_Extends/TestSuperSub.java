class SuperClass{
	private int n;
	SuperClass()  //无参构造器
	{
		System.out.println("SuperClass()");
	}
	SuperClass(int n)//有参构造器
	{
		System.out.println("SuperClass(int n)");
		this.n=n;
	}
}
class SubClass extends SuperClass{
	private int n;
	SubClass()
	{
		super(300); //父类为有参构造器
		System.out.println("SubClass");
	}
	public SubClass(int n){
		System.out.println("SubClass(int n): "+n);
		this.n=n;
	}
}
//驱动函数
public class TestSuperSub {
	public static void main(String[] args)
	{
		SubClass sc= new SubClass();//实例化无参构造器
		SubClass sc1=new SubClass(200);//实例化有参构造器
	}
}
