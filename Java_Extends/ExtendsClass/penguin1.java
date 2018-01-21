public class penguin1 extends Animal
{
  public class penguin1(String myName,int myId)
  {
    super(myName,myId);
  }
  public static void main(String[] args)
  {
    penguin1 p=new penguin1("penguin",21);
    p.eat();
    p.sleep();
    p.introduction();
  }
}
