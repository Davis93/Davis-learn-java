//数组定义，初始化，遍历，最值，排序
public class Test4_Array_Iterator {
	public static void main(String[] args)
	{
		int[] arr1=new int[4];//数组定义
		arr1[0]=6;//数组赋初值
		arr1[1]=1;//数组赋初值
		arr1[2]=2;//数组赋初值
		arr1[3]=4;//数组赋初值
		//传统遍历
		System.out.println("传统遍历方法为：");
		for(int i=0;i<arr1.length;i++)//数组遍历
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Foreach遍历方法为：");
		for(int x:arr1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//排序。冒泡排序法，升序
		System.out.println("采用冒泡排序升序进行排列结果为：");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length-1-i;j++)
			{
				if(arr1[j]>arr1[j+1])
				{
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		for(int m:arr1)
		{
			System.out.print(m+" ");
		}
		//降序显示为：
		System.out.println();
		System.out.println("数组降序显示结果为：");
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i]+" ");
		}	
	}
	//最大值最小值
	public static int getMax(int[] arr1)
	{
		int max=arr1[0];
		for(int i=1;i<arr1.length;i++)
		{
			if(arr1[i]>max)
			{
			max=arr1[i];
			}	
		}
		return max;
	}
}
