abstract class Payment
{
    abstract void Pay(int b);
    void print()
    {
        System.out.println("payment done  " );
    }
}
class UpiPayment extends Payment
{
    void Pay(int b)
    {
        System.out.println("payment done via upipayment : " + b);
    }
}

public class AbstractClass {
    public static void main(String[] args) {
       Payment obj = new UpiPayment();
       obj.Pay(500);
       obj.print(); 
    }
}
