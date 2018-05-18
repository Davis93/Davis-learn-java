//冒泡排序降序
public class BubbleReverseSort {
	public static void main(String[] args)
	{
		int[] arr={2,3,1,4,6,5};
		System.out.println("未排序前数组为：");
		for(int i:arr)//foreach 遍历
		{
			System.out.print(i);
			System.out.print(' ');
		}
		//冒泡排序降序
		System.out.println();
		System.out.println("冒泡排序降序排序后数组为：");
		for(int i=arr.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				int temp=0;
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int x:arr)
		{
			System.out.print(x);
			System.out.print(' ');
		}
	}

}
