public class ConsDemo {	
	public static void main(String[] args){
		class myClass{
			int x;
			myClass(int i){ //构造方法
				x=i;
			}
		}
		myClass t1=new myClass(10);
		myClass t2=new myClass(20);
		System.out.println(t1.x + " " + t2.x);
	}
}
	
