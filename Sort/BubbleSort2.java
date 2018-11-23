package Sort;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[] arr={1,4,5,7,6,9,8,2,3};
		for(int i=arr.length-1;i>0;i--){       //outer cycle 外循环		
			for(int j=0;j<i;j++){   //inner cycle 内循环			
				if(arr[j]>arr[j+1]){//升序排序				
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int x:arr){             //foreach遍历方法		
			System.out.print(x+" ");
		}
	}
}
