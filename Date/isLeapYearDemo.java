import java.util.*;

public class isLeapYearDemo {
	public static void main(String[] args){
		Calendar c1=Calendar.getInstance();
		int year=c1.get(Calendar.YEAR);
		if((year%4==0)&&(year%100!=0)&&(year%400==0))
		{
			System.out.println("今年是："+year+",是闰年！");
		}
		else
		{
			System.out.println("今年是："+year+",不是闰年！");
		}
			
		
	}

}

运行后结果： 今年是2017年，不是闰年
