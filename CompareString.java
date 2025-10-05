public class CompareString {
    public static void main(String[] args) {
        String str = "hello";
        String str1="hello";
       //  int count;
         if(str.length() != str.length())
         {
           System.out.println("Strings are not equal");
           return;
         }
         for(int i=0;i<str1.length();i++)
         {
            if(str.charAt(i) != str1.charAt(i))
                {
                    System.out.println("String are not equal");
                    return;
                }
         }
        System.out.println("Strings are equal");
      
    }
}
