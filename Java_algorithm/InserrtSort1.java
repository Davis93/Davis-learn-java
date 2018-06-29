
public class InsertSort1 {
	public static void main(String[] args)
	{
		int[] arr={4,3,1,5,7,6,8,2};
		System.out.println("----------");
		System.out.println("未排序前数组");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		doInsertSort(arr);	
	}
	public static void doInsertSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int j;
			int temp=a[i];//存储当前元素
			for(j=i;j>0;j--)//遍历i之前数字
			{
				//如果前面数组大于后面的，则把大的赋值到后面
				if(a[j-1]>temp)
				{
					a[j]=a[j-1];
				}
				else break;
			}
			a[j]=temp;
		}
		System.out.println("---------");
		System.out.println("插入排序后数组为：");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}

}
