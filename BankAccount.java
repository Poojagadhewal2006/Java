

class account{
    String accountholder = "Pooja";
    int accountnumber = 242434;
    double balance = 1000;
    void bank1()
    {
        System.out.println("Accont Holder : " + accountholder);
        System.out.println("Account Number : " + accountnumber);
        System.out.println("Account Balance : " + balance);
    }
    void Deposit(double amount)
    {
      if(amount > 0)
      {
          balance += amount;
        System.out.println("Deposit : " + balance);
      }
      else
      {
        System.out.println("Invalid Deposit amount : ");
      }
    }
    void Withdrew(double amount)
    {
      if(amount > 0 && amount <= balance)
      {
        balance -= amount ;
        System.out.println("Withdrewn : " + balance);
      }
      else{
        System.out.println("Invalid Withdrewal amount or insufficient funds ");
      }
    }
}
public class BankAccount {
    public static void main(String[] args) {
        account obj6 = new account();
        obj6.bank1();
        obj6.Deposit(700);
        obj6.Withdrew(200);
    }
}
