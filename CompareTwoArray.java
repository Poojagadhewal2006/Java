public class CompareTwoArray {
   public static void main(String[] args) {
    int arr1[] = { 1,2,3,4,5};
    int arr2[] = {1,2,3,4,5};
    boolean isEqual = java.util.Arrays.equals(arr1,arr2);
    if(isEqual)
    {
        System.out.println("Array are equal....... ");
    }
    else{
        System.out.println("Arrays are not equal........ ");
    }
   } 
}
