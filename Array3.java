public class Array3 {
   public static void main(String[] args) {
    int arr[] = {4,5,6,0,-1};
     int max = 0;
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]>max)
        {
            max=arr[i];
        }
     }
     System.out.println("Maximum Number :" + max);

   } 
}
