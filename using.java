public class using {
    public static void main(String[] args)
    {
        account a=new account(123,0);
        System.out.println("id: "+ a.getId()+" balance: "+a.getBalance());
        a.deposit(100);
        System.out.println("id: "+ a.getId()+" balance: "+a.getBalance());
    }
}
