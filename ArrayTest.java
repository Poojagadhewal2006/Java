public class ArrayTest {
    public static void main(String[] args) {
        int arr[] = {7,10,4,3,20,15};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int min=arr[i];
                    System.out.println(min);
                }
                else
                {
                    int max=arr[j];
                    System.out.println(max);
                }
            }
        }
    }
}