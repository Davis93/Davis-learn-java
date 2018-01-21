//老鼠类
public class Rabbit {
	private String name;
	private int id;
	public Rabbit(String myName,int myId)
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
		System.out.println("大家好，我是："+name+",我的Id是:"+id);
	}
	
	public static void main(String[] args)
	{
		Rabbit r=new Rabbit("rabbit",21);//实例化对象，r为实例化引用
		r.eat();
		r.sleep();
		r.introduction();
	}
	

}
