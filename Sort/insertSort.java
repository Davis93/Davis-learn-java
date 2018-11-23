package Sort;
/* 1)从第一个元素开始，该元素可以认为已经被排序；
   2)取出下一个元素，在已经排序的元素序列中从后向前扫描；
   3)如果该元素（已排序）大于新元素，将该元素移到下一位置；
   4)重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
   5)将新元素插入到该位置后；
   6)重复步骤2~5。*/
 
public class insertSort1 {

	public static void main(String[] args) {
		int[] arr={1,4,5,7,6,9,8,2,3};
		int preIndex,current;
		for(int i=1;i<arr.length;i++){
			preIndex=i-1;
			current=arr[i];
			while(preIndex>0&&arr[preIndex]>=current){
				arr[preIndex+1]=arr[preIndex];
				preIndex--;
			}
			arr[preIndex+1]=current;
		}
		for(int x:arr){
			System.out.print(x+" ");
		}

	}

}
