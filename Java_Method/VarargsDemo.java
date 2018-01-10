public class VarargsDemo{
    public static void main(String[] args){
      printMxa(34,3,3,2,56.5);
       printMxa(new double []{1,2,3});
    }
    public static void printMax(double...numbers)
    {
        if(numbers.length==0)
        {
            System.out.println("No agument passed");
        }
    }


}
