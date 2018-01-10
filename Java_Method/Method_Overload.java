public class Method_Overload{
  public static int max(int num1,int num2)
  {
    if(num1>num2)
    {
    retun num1;
    }
    else
    {
    return num2;
    }
    public static int max(double num1,double num2)
  {
    if(num1>num2)
    {
    retun num1;
    }
    else
    {
    return num2;
    }
  }
  public static void main(String[] args){
    int n1=2;
    int n2=3;
    double n3=4.1;
    double n4=5.2;
    System.out.println("max(n1,n2)="+max(n1,n2));//method overload
    System.out.println("max(n3,n4)="+max(n3,n4));// method overload
  }
}
