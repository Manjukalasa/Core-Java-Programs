public class Account
 {
long accono=1236522l;
String name="manju";
String ifsc="IFCS00021";
String branch="btr";
double bal=0.0;
static String bank="ICICI";

public void showaccountdetails()
    {
        System.out.println(name);
        System.out.println(accono);
        System.out.println(ifsc);
        System.out.println(branch);
    }
    public static void showbankname()
    {
        System.out.println(bank);
    }
    public  void deposit(double amt)
    {
        bal=bal+amt;
        System.out.println(bal);
    }
    public  void withdraw(double amt)
    {
        bal=bal-amt;
        System.out.println(bal);
    }
    public static void main(String[] args) {
      new  Account().showaccountdetails();
      showbankname();
      new Account().deposit(1000.0);
      new Account().withdraw(400.0);
    }   
}
