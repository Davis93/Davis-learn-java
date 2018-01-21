//创建父类
public class Animal {
	private String name;
	private int id;
	public Animal(String myName,int myId)
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
		System.out.println("Sleeping!");
	}
	public void introduction()
	{
		System.out.println("大家好，我是："+name+",我的Id是："+id);
	}
	
}
