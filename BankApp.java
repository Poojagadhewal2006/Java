import java.util.ArrayList;
import java.util.Scanner;
class Transaction
{
    private String type;
    private double ammount;

    public Transaction(String type,double ammount)
    {
        this.type=type;
        this.ammount=ammount;
    }
    
    
}
class Account
{
    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name,int accountNumber, double balance) 
    {
       this.name=name;
       this.accountNumber=accountNumber;
       this.balance=balance;
    }
    
    ArrayList<Transaction> transaction = new ArrayList<>();
   
    public void Deposit(double ammount)
    {
        if(ammount>0)
        {
           balance+=ammount; 
           transaction.add(new Transaction("Deposit",ammount));
           System.out.println("Deposit successfully");
        }
    }
  
    public void Withdrew(double ammount)
    {
        if(ammount>0 && ammount<=balance)
        {
            balance-=ammount;
            transaction.add(new  Transaction("Withdrew",ammount));
            System.out.println("Withdrew successfully");
        }
        else 
        {
            System.out.println("Insufficient balance....");
        }
    }
    
    public void viewTransactions()
    {
        if (transaction.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transaction t : transaction) {
                System.out.println(t);
            }
        }
    }
    public void checkBalance()
    {
      System.out.println("Current Balance:"+balance);
    }
    
}
public class BankApp
{
    // static Scanner sc = new Scanner(System.in);
    //    static Account account;
        public static void main(String[] args) 
        {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter account holder name: ");
          String name = sc.nextLine();
          Account  account=new Account(name, 67471, 0);
          System.out.println("Account created successfully. Account Number: " );
    
            int choice;
            do {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. View Transactions\n5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.Deposit(dep);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double with = sc.nextDouble();
                        account.Withdrew(with);
                        break;
                    case 3:
                        account.checkBalance();
                    break;
                case 4:
                    account.viewTransactions();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        
    }
}
   



