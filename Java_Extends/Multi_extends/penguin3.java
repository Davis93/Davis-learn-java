  //entends继承的另一种形式
  
  class animal4 { //父类
	private String name;
	private int id;
	public animal4(String myName,int myId)
	{
		name=myName;
		id=myId;
	}
	public void eat()
	{
		System.out.println("Eating!");
	}
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	public void introduction()
	{
		System.out.println("hello everyone,this is "+name+",myid is "+id);
	}
}
public class penguin3 extends animal4{ //子类
	private String name;
	private int id;
	public penguin3(String myName,int myId)
	{
		super(myName,myId);
	}
	
	public void run()//拓展父类方法
	{
		System.out.println("Running!");
	}
	//驱动函数
	public static void main(String[] args)
	{
		penguin3 p3=new penguin3("Dog",24);//实例化对象
		p3.eat();
		p3.sleep();
		p3.introduction();
		p3.run();
	}

	
 
}
