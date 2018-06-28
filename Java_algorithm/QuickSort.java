//快速排序算法一般操作：
//1)设置i,j；i=low j=high
//2)index=a[0];一般以第一个数作为基准

//快速排序算法
public class QuickSort {
	public static void sort(int[] a,int low, int high)
	{
		if(low>high)
		{
			return;
		}
		int i=low;
		int j=high;
		int index;
		index=a[i];
		while(i<j)//从表的两端交替向中间扫描
		{
			while(i<j&&a[j]>=index)
			{
				j--;
			}
			if(i<j)  
			{
				a[i++]=a[j];//用比基准小的记录替换低位记录
			}
			while(i<j&&a[i]<index)
			{
				i++;
			}
			if(i<j)
			{
				a[j--]=a[i];//用比基准大的记录替换高位记录
			}		
		}
		a[i]=index;//将基准数值替换
		sort(a,low,i-1);//对低子表进行递归排序
		sort(a,i+1,high);//对高子表进行递归排序	
	}
	public static void quickSort(int[] a)
	{
		sort(a,0,a.length-1);
	}
	public static void main(String[] args)
	{
		int[] arr={49,38,65,97,76,13,27,49};
		System.out.println("------------");
		System.out.println("未排序前数组为：");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		quickSort(arr);
		System.out.println();
		System.out.println("------------");
		System.out.println("快速排序后数组为：");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
