import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = in.nextInt();
        for(int i=1;i<=10;i++)
        {
            int mul;
           mul= n*i;
          System.out.println(mul);
        }
    }
}
