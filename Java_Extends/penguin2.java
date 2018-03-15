class Animal2{
	private String name;
	public Animal2( String name)
	{
		this.name=name;
		
	}
	public void eat(){}//父类方法中方法可以不实现，而在子类中，这些方法会具体实现
	public void sleep(){}
}

public class penguin2  extends Animal2{
	private String name;
	public penguin2(String name)
	{
		super(name);
		this.name=name;
	}
	public void eat()
	{
		System.out.println(name+ "is eating!");
	}
	
	public void sleep()
	{
		System.out.println(name+ " is sleeping");
	}
	
	public static void main(String[] args)
	{
		penguin2 p2=new penguin2("penguin2");
		p2.eat();
		p2.sleep();
	}

}
