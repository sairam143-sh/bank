import java.util.Scanner;
public class bank_class {
    int total_amount=0;

    Scanner scan=new Scanner(System.in);
    public void deposit()
    {
        System.out.println("enter the amount: ");
        int deposit_amount=scan.nextInt();
        total_amount=total_amount+deposit_amount;
    }
    public void withdraw()
    {
        System.out.println("Enter the amount you want to withdraw:");
        int withdraw_amount=scan.nextInt();
        if(withdraw_amount>total_amount)
        {
            System.out.println("insufficient balance");
            withdraw_amount=scan.nextInt();
            total_amount=total_amount-withdraw_amount;
        }
        else {
            total_amount=total_amount-withdraw_amount;
        }
    }
    public void getamount()
    {
        System.out.println(total_amount);
    }
    public static void main(String[] args) {
        bank_class b=new bank_class();
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("please enter the number you want(1.deposit, 2.withdraw, 3.getamount)");
            int x=s.nextInt();
            if(x==1)
            {
                b.deposit();
            }
            else if(x==2)
            {
                b.withdraw();
            }
            else if(x==3)
            {
                b.getamount();
            }
            else {
                break;
            }
        }
    }
}
