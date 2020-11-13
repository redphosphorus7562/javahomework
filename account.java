import java.util.Date;
public class account {

        private int id=0;
        private double balance=0;
        private double annuallnterestRate=0;
        private Date dateCreated;

    public account() {
    }

    public account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public double getMonthlyInterestRate(){
        return annuallnterestRate/12;
    }

    public double withdraw(double cash)
    {
        return balance-=cash;
    }

    public double deposit(double cash)
    {
        return balance+=cash;
    }
}
