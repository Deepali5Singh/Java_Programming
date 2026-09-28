public class BankAccount {
    String bankName;
    String HolderName;
   
    public void balance(){
        int balance = 459;
        System.out.println("balance available is " + balance);
    }
    public void Accountdetail (){
        bankName = "Bank of India";
        HolderName = "Manisha kumari";
        System.out.println( "Bank Name is " +bankName);
        System.out.println("Account holders name is "+ HolderName);
    }
    public static void main (String [] args)
    {
        BankAccount detail = new BankAccount ();
        detail.balance();
        detail.Accountdetail();
    }
}