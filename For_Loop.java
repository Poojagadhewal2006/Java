
import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
       Scanner in = new  Scanner(System.in);
       System.out.println("Enter value of n:");
       int n = in.nextInt();
        for(int i=1;i<n;i++)
        {
            System.out.println(i);
        }
    }
}
