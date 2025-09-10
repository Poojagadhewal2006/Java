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
class CardPayment extends Payment
{
    void Pay(int b)
    {
        System.out.println("payment done via cardpayment : " + b);
    }
}
public class AbstractClass1 {
    public static void main(String[] args) {
        Payment obj = new UpiPayment();
        obj.Pay(500);
        obj.print(); 
        Payment obj1 = new CardPayment();
        obj1.Pay(300);
        obj1.print();
    }
}
