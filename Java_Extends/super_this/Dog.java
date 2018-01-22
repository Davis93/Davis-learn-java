//子类，继承父类aniaml2
public class Dog extends animal2{
	void eat()
	{
		System.out.println("Dog: eat");
	}
	void eatTest()
	{
		this.eat();//调用本身方法,指向自己的引用
		super.eat();//调用父类方法，引用当前对象父类
	}
	public static void main(String[] args)
	{
		animal2 a= new animal2();
		a.eat();
		Dog d=new Dog();
		d.eatTest();
	}

}
