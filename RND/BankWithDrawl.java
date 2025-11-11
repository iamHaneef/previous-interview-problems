package RND;

class Base{

    int wholeAmount=2000;


    public void deposit(int amount)
    {


        wholeAmount=wholeAmount+amount;
        System.out.println("My Current Balance is : "+wholeAmount);
        System.out.println(" ");
        //System.out.println(wholeAmount-200);
    }

    public void withdrawl(int amount)
    {
       // wholeAmount=wholeAmount-amount;
    }

public int getWholeAmount()
{

    return wholeAmount;
}

}
class SavingAccount extends Base{

    @Override
    public void withdrawl(int amount)
    {
        System.out.println("Case 1 : If user withdraw in Saving Account ");
        wholeAmount=wholeAmount-amount;
        System.out.println("WithDraw Amount in Saving Account : "+amount);
        System.out.println("Current Balance : " +wholeAmount);
    }

}

class CheckingAccount extends Base{
    @Override
    public void withdrawl(int amount)
    {
        //wholeAmount=wholeAmount-amount;
        System.out.println(" ");
        System.out.println("Case 2 : If user withdraw in Checking Account ");
        System.out.println("WithDraw Amount in Checking Account : "+amount);
        System.out.println("Current Balance : " + (wholeAmount-amount));
    }
}

public class BankWithDrawl {

    public static void main(String[] args)
    {
        Base base=new Base();
        base.deposit(0);

        SavingAccount Save = new SavingAccount();
        Save.withdrawl(500);

        CheckingAccount check=new CheckingAccount();
        check.withdrawl(600);


    }

}
