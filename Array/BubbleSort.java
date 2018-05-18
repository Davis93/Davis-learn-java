//冒泡排序法升序
public class BubbleSort {
	public static void main(String[] args)
	{
		int[] arr={2,3,1,4,6,5};
		System.out.println("未排序的数组为：");
		for(int i:arr) //foreach遍历
		{
			System.out.print(i);
			System.out.print(' ');
		}
		//冒泡排序法升序
		System.out.println();
		System.out.println("冒泡排序法升序排序后数组为：");
		for(int i=0;i<arr.length-1;i++) //外循环都遍历一遍
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				int temp=0;
				if(arr[j]>arr[j+1])//升序判断
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
