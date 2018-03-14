//构造器演示

public class ConstructorDemo {
	private int x;

	public ConstructorDemo(int x) //构造器(构造方法)
	{
		this.x=x;
	}
	public ConstructorDemo()
	{
		this(1);
	}
	public void ConstructorDemo(int x)// 虽然也能实现，不报错，但其非构造器
	{
		this.x=x;
	}

}
