import java.util.Arrays;
//sort()实现降序排列
public class sortDemo1 {
	public static void main(String[] args)
	{
		int[] arr={2,1,5,4,7,6};
		System.out.println("排序前数组为：");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print(" ");
		}
                System.out.println();
		Arrays.sort(arr);
		//降序排列
		System.out.println("降序排列数组为：");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]);
			System.out.print(" ");
		}
	}
}


结果为：
排序前数组为：
2 1 5 4 7 6 
降序排列数组为：
7 6 5 4 2 1 
