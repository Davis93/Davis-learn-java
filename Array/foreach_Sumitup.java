//foreach demo and sum it up of array; by Davis Zhang
public class Sumitup {
	public static void main(String[] args){
		double[] myList={5.6,4.5,3.3,13.2,4.0,34.33,34.0,45.45,99.993,11123};
		for(double x:myList)
		{
			System.out.println(x);//foreach 遍历方法
		}
		double total=0;
		for(int i=0;i<myList.length;i++)
		{
			total+=myList[i];
		}
		System.out.println(total);
	}
}
