//C类利用A,B接口实现多继承
public class C implements A,B{

	public void sing() {
		System.out.println("Singing!");
	}
	public void run() {
		
		System.out.println("Running!");
	}
	public void eat() {
		System.out.println("Eating!");
	}
	public void sleep() {
		System.out.println("Sleeping!");
	}
	
	public static void main(String[] args)
	{
		C c=new C();
		c.eat();
		c.run();
		c.sing();
		c.sleep();
	}
}
