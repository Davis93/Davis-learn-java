//penguin2(子类) 利用extends 继承  animal类,
public class penguin2 extends animal1 {
	public penguin2(String myName,int myId)//继承构造器
	{
		super(myName,myId);
	}
	//子类可以继承父类所有方法，也可以对父类没有的方法进行拓展。比如下面,拓展方法
	public void run()//拓展的新方法
	{
		System.out.println("Running");
	}
	public static void main(String[] args)
	{
		penguin2 p1=new penguin2("penguin2",18);
		p1.eat();
		p1.sleep();
		p1.introduction();
		p1.run();
		
	}
}
