package Sort;

public class selectSort {

	public static void main(String[] args) {
		int[] arr={1,4,5,7,6,9,8,2,3};
		int minIndex;
		for(int i=0;i<arr.length-1;i++){ 
			minIndex=i;                    
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
}
