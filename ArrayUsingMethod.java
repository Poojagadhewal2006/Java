public class ArrayUsingMethod {
    static void sum()
    {
    int arr[] = {1,3,4};
    int sum=0;
    for(int i=0;i<=4;i++)
    {
        sum=sum+i;
    }
    System.out.println(sum);
    int sum1=0;
    for(int i=0;i<arr.length;i++)
    {
    
       sum1 = sum1+arr[i];
    }
    
    System.out.println(sum1);
    int sum2;
    sum2=sum-sum1;
    System.out.println(sum2);
}
    public static void main(String[] args) {
       sum(); 
    
  /*  int arr[] = {1,3,4};
   int sum=0;
    for(int i=0;i<=4;i++)
    {
        sum=sum+i;
    }
    System.out.println(sum);
    int sum1=0;
    for(int i=0;i<arr.length;i++)
    {
    
       sum1 = sum1+arr[i];
    }
    
    System.out.println(sum1);
    int sum2;
    sum2=sum-sum1;
    System.out.println(sum2);
    */
}
}
