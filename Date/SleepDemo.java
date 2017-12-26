import java.util.*;
//Sleep demo
public class SleepDemo {
	public static void main(String[] args){
		//异常捕获机制
		Date date=new Date();
		try {
			System.out.println(date+"\n");
			Thread.sleep(3000);//线程休眠 3s
			System.out.println(date+"\n");
		}catch(Exception e){
			System.out.println("Got a exception");
		}
		
	}
}
