import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMatcher {
	public static void main(String[] args){
		String line="This order was placed for QT3000! OK?";
		String pattern="(\\D*)(\\d+)(.*)";//先匹配非[0-9]数字，匹配[0-9数字]，再匹配任意字符
		 Pattern r= Pattern.compile(pattern);
		 Matcher m=r.matcher(line);
		 if(m.find())
		 {
			 System.out.println(m.group(0));
			 System.out.println(m.group(1));
			 System.out.println(m.group(2));
			 System.out.println(m.group(3));
		 }
		 else
		 {
			 System.out.println("No Match!");
		 }
	}
}

