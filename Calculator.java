
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
      Scanner in = new  Scanner(System.in);
      System.out.println("Enter your first number:");
      int a = in.nextInt();
      System.out.println("Enter your second number:");
      int b = in.nextInt();
      System.out.println("Enter you Cammand:");
      int c = in.next().charAt(0);   //char
      switch(c)
      {
        case '+' : 
        System.out.println(a+b);
        break;
        case '-':
        System.out.println(a-b);
        break;
        case '*' :
        System.out.println(a*b);
        break;
        case '/' :
        System.out.println(a/b);
        break;
        default :
         System.out.println("kuch nhi hoga");
      }
    }
}
