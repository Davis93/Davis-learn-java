//The usage of Super
class animal1{
	public void move()
	{
		System.out.println("Animal can run.");
	}
	
}
class dog1 extends animal1{
	public void move()
	{
		super.move();//应用super类方法
		System.out.println("Dog can move.");
	}
}
public class superDemo {
	public static void main(String[] args)
	{
		animal1 a1= new animal1();
		animal1 a2=new dog1();
		a1.move();
		a2.move();
	}
}
