



public class BinarySearch {
    public static int Binarysearch() {
        int target =18;
        int arr[] ={1,2,3,4,5,6,7,8};
        int start =0;
        int endPoint = arr.length-1;
        while(start <= endPoint)
        {
            int midPoint =(start + endPoint)/2;
            if(arr[midPoint] == target)
            {
                return midPoint;
            }
            else if(arr[midPoint]>target)
            {
              return  endPoint = midPoint -1;
            }
            else if(arr[midPoint]<target)
            {
               return endPoint = midPoint +1;
            }
            else
            {
                return -1;
            }
        } 
        return -1; 
        }

        
    

 
    
    
    public static void main(String[] args) {

        int k = Binarysearch();
        System.out.println(k);
    }
}
