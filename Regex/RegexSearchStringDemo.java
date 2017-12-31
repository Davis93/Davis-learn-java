import java.util.regex.*;

public class RegexSearchStringDemo {
	public static void main(String[] args){
		
		String content="I am noob"+"from the runoob.com. ";
		String pattern=".*runoob.*";
		boolean isMatch=Pattern.matches(pattern, content);//注意，Pattern.matches是(pattern,content),而非(content,pattern),不要想当然
		System.out.println("字符串中是否包含了 'runoob' 子字符串? "+isMatch);
	}
}


