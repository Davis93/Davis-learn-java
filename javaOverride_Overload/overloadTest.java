//有return 产生返回值，一般要用System.out.println();打印
public class overloadTest {
	public int test()
	{
		System.out.println("test1");
		return 1;
	}
	public void test(int a)
	{
		System.out.println("test2");
	}
	public String test(String s,int a)
	{
		System.out.println("test3");
		return "This is test3Demo";
	}
	public String test(int a,String s)
	{
		System.out.println("test4");
		return "This is test4Demo";
	}
	public static void main(String[] args)
	{
		overloadTest o1=new overloadTest();
		o1.test();
		o1.test(2);
		System.out.println(o1.test("HelloWorld",1));
		System.out.println(o1.test(2,"hellodavis"));
		}
}
