import java.util.Arrays;
public class AnagramUsingMap {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "llohe";
        if(areAnagrams(str1,str2))
        {
            System.out.println("Strings are  Anagrams....");
        }
        else 
        {
            System.out.println("Strings are Not Anagrams..");
        }
       
    }
    public static boolean areAnagrams(String s1,String s2)
    {
     
       if(s1.length() !=s2.length())
       {
        return false;
       }
       char[] arr1= s1.toCharArray();
       char[] arr2= s2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       return Arrays.equals(arr1, arr2);
    }
}
