import java.util.*;
import java.text.*;
//解析字符串为时间

public class ParsesDemo {
	public static void main(String[] args){
		SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd");
		String input=args.length==0? "2017-12-26":args[0];//三目运算
		System.out.print(input+" Parses as ");
		Date t;//=new Date();
		try{
			t=ft.parse(input);//parse 用法
			System.out.println(t);
		} catch (ParseException e){
			System.out.println("Unparseable using"+ft);
		}
	}
}
