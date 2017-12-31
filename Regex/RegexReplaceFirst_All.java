import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexReplaceFirst_All {

	public static void main(String[] args){
		String pattern="dog";
		String input="The dog says meow"+"，all dogs say meow";
		String replace="cat";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(input);
		System.out.println("首次替换结果为： "+m.replaceFirst(replace));
		System.out.println("全部替换结果为： "+m.replaceAll(replace));
		
	}
}
