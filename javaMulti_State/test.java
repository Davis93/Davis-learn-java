//Java多态性
public class Test {
	//主函数入口
	public static void main(String[] args)
	{
		show(new cat());//show方法，cat对象调用
		show(new dog());//show方法，dog对象调用
		
		animal a= new cat();//向上转型
		a.eat();
		
		cat c=(cat)a;//向下转型
		c.work();
	}
	public static void show(animal a){
		a.eat();
		if(a instanceof cat){
			cat c=(cat)a;
			c.work();
		}else if(a instanceof dog){
			dog c=(dog)a;
			c.work();
		}
	}
}

abstract class animal{//抽象类
	abstract void eat();
}

class cat extends animal{//继承，并拓展
	public void eat(){
		System.out.println("吃鱼");
	}
	public void work(){
		System.out.println("抓老鼠");
	}
}

class dog extends animal{//继承，并拓展
	public void eat(){
		System.out.println("吃骨头");
	}
	public void work(){
		System.out.println("看家");
	}
}


