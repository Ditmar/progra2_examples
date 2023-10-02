package bank;

public class Account {
    private Double balance;
    public Account(Double initBalance) {
        this.balance = initBalance;
    }
    public void balanceOut(Double cashOut) {
        if (this.balance >= cashOut) {
            this.balance -= cashOut;
        }
    }
    public void balanceIn(Double cashIn) {
        this.balance += cashIn;
    }
    public void printBalance() {
        System.out.println("Your balance is " + this.balance);
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
}
