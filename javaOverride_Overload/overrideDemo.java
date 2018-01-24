//override：重写，子类根据需要实现父类方法；子类中实现方法抛出异常，不能超过父类方法抛出异常范围

class animal{    //父类
	public void move()
	{
		System.out.println("Animal can run.");
	}
}
class dog extends animal{ //子类
	public void move()
	{
		System.out.println("Dog can run.");
	}
}
public class overrideDemo {
	public static void main(String[] args)
	{
		animal a1= new animal();//animal对象
		animal a2=new dog();//dog对象
		a1.move();//执行animal类方法
		a2.move();//执行dog类方法
	}
}
