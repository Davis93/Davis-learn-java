package Sort;

public class shellSort {

	public static void main(String[] args) {
		int[] arr={1,4,5,7,6,9,8,2,3};
		int inc=1;
		while(inc<=(arr.length/3)){
			inc=inc*3+1;
		}
		while(inc>0){
			for(int i=inc;i<arr.length;i+=inc){
				if(arr[i]<arr[i-inc]){
					int temp=arr[i];
					int j=i-inc;
					while(j>=0&&arr[j]>temp){
						arr[j+inc]=arr[j];
						j-=inc;
					}
					arr[j+inc]=temp;
				}
			}
			inc=(inc-1)/3;
		}
		for(int x:arr){
			System.out.print(x+" ");
		}

	}

}
