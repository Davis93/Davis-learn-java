//多态性demo

abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{
	public void eat()
	{
		System.out.println("eat fish");
	}
	public void work()
	{
		System.out.println("Catch mice");
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("eat bones");
	}
	public void work()
	{
		System.out.println("Watch out house");
	}
}
public class Test {
	public static void show(Animal a)
	{
		a.eat();
		if(a instanceof Cat)
		{
			Cat c=(Cat)a;//向下转型
			c.work();
		}else if(a instanceof Dog)
		{
			Dog c=(Dog)a;
			c.work();
		}
	}
	public static void main(String[] args)
	{
		show(new Cat());
		show(new Dog());
		
		Animal a=new Cat();//向上转型
		a.eat();
		Cat c=(Cat)a;//向下转型
		c.work();
	}
}
