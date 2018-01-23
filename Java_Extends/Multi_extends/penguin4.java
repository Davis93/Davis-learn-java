 //implements继承的另一种方式
interface A1{
	 public void eat();
	 public void sleep();
	}
 interface B1{
	 public void sing();
	 public void run();
 }
public class penguin4 implements A1,B1{
	public void eat()
	{
		System.out.println("Eating!");
	}
	public void sleep()
	{
		System.out.println("Sleeping!");
	}
	public void sing()
	{
		System.out.println("Singing!");
	}
	public void run()
	{
		System.out.println("Running!");
	}
	
	public static void main(String[] args)
	{
		C c1=new C();
		c1.eat();
		c1.sleep();
		c1.sing();
		c1.run();
	}	
}
