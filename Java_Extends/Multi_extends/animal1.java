//父类，用于extends和implements继承
public class animal1 {
	private String name;
	private int id;
	public animal1(String myName,int myId)//构造器
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
		System.out.println("Hello,everyone,my name is: "+name+",myid is: "+id);
	}
}
