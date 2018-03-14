public class VarArgsDemo {
	
	public static void PrintMax(double...numbers)
	{
		if(numbers.length==0)
		{
			System.out.println("No argument passed!");
		}
		double result=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>result)
			{
				result=numbers[i];
			}
		}
		System.out.println("The max value is: "+result);
	}
	
	public static void main(String[] args)
	{
		PrintMax(34, 3, 3, 2, 56.5);
		PrintMax(new double[]{1,2,3});//比较巧妙，不太会喂
	}
}
