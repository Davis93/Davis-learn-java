import java.util.regex.*;

class RegexDemo{
  public static void main(String[] args){
  String content ="I am noob"+"from runoob.com";
  String pattern=".*runoob.com.*";
  boolean isMatch=Pattern.match(pattern,content);
  System.out.println("字符串是否包含了runoob.com子字符串？"+isMatch);
  }
}
