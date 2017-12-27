import java.regex.Matcher;
import java.regex.Pattern;

public class RegexMatches{
  public static void main(String[] args){
    //按指定模式在字符串查找
    String line="This order was placed for QT3000! OK?";
    String pattern="(\\D*)(\\d+)(.*)";
    //创建pattern 对象
    Pattern r=Pattern.compile(pattern);
    //创建matcher对象
    Matcher m=r.matcher(line);
    if(m.find())
    {
      System.out.println("Found value: "+m.group(0));
      System.out.println("Found value: "+m.group(1));
      System.out.println("Found value: "+m.group(2));
      System.out.println("Found value: "+m.group(3));
    }
  }

}
