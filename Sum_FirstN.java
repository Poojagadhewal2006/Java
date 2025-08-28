import java.util.Scanner;

public class Sum_FirstN {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a = in.nextInt();
    int sum =0;
    int i=0;
    while(i<=a)
    {
        sum =  sum+i;
        i++;
    }
    System.out.println(sum);
  }  
}
