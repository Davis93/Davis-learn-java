import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMatches {
	
	public static void main(String[] args){
		String pattern="foo";
		String input1="fooooooooooooooooo";
		String input2="ooooofoooooooooooo";
		Pattern r=Pattern.compile(pattern);
		Matcher m1=r.matcher(input1);
		Matcher m2=r.matcher(input2);
		System.out.println("lookingAt(): "+m1.lookingAt());//true
		System.out.println("matches(): "+m1.matches());//false
		System.out.println("lookingAt(): "+m2.lookingAt());//false
		
	}

}
