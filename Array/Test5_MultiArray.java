//多维数组定义及初始化
/*
 * 1)int [][] arr=new int[3][4];
 * 2)int [][] arr=new int[3][];
 * arr[0]=new int[]{1,2};
 * arr[1]=new int[]{3,4,5,6};
 * arr[2]=new int[]{7,8,9};
 * 3)int[][] arr={{1,2},{3,4,5,6},{7,8,9}}; 
 */
public class Test5_MultiArray {
	public static void main(String[] args)
	{
		int[][] arr=new int[3][];
		arr[0]=new int[]{1,2};
		arr[1]=new int[]{3,4,5,6};
		arr[2]=new int[]{7,8,9};
		int sum=0;
		//使用foreach遍历二维数组
		System.out.println("使用Foreach遍历二维数组");
		for(int[] a:arr)
		{
			for(int i:a)
			{
				System.out.print(i+" ");
			}
			System.out.println();	
		}
		System.out.println();
		//数组遍历
		System.out.println("使用普通方法遍历数组");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
