//企鹅类
public class penguin {
	private String name;
	private int id;
	//构造器
	public penguin(String myName,int myId)
	{
		name=myName;
		id=myId;
	}
	public void eat()//方法
	{
		System.out.println("Eating!");
	}
	public void sleep()//方法
	{
		System.out.println("Sleeping!");
	}
	public void introduction()
	{
		System.out.println("大家好，我是"+name+",我的id是："+id);
	}
	
	public static void main(String[] args)
	{
		penguin n1=new penguin("dog",20);
	    n1.sleep();
	    n1.eat();
	    n1.introduction();
		
	}
	
	

}
