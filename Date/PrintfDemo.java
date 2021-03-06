//printf 方法可以很轻松地格式化时间和日期。使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。

import java.util.Date;
public class PrintfDemo {

	public static void main(String[] args){
		Date date =new Date();
		System.out.printf(" %tc%n",date);//all the information ,date ;NOT:+date
		System.out.printf(" %tF%n",date);// yyyy-MM-dd
		System.out.printf(" %tD%n",date);// yy/MM/dd
		System.out.printf(" %tr%n",date);//12时制 HH:MM:SS PM
		System.out.printf(" %tT%n",date);//HH:MM:SS
		System.out.printf(" %tR%n",date);//24时制HH:MM
	}
}
