
import java.util.Scanner;



public class MutipleOfThreeCheck {
    public static void main(String[] args) {
      Scanner in = new  Scanner(System.in);
      System.out.println("Enter a number:");
      int number = in.nextInt();
      if(number % 3  ==  0)
      {
        System.out.println(number + "is a multiple of 3");
      }
      else{
        System.out.println(number + "is not a multiple of 3");
      }
    }
}
