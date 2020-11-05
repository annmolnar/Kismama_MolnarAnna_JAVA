package trainingSolutions.bankAccount;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber,String owner, int balance ){
        this.accountNumber=accountNumber;
        this.owner=owner;
        this.balance=balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int depositedMoney){
        balance+=depositedMoney;
    }

    public void withdraw(int withdrawnMoney){
        balance-=withdrawnMoney;
    }

    public void transfer(BankAccount bankAccount, int amount){
        balance-=amount;
        bankAccount.balance+=amount;
    }

    public String getInfo(){
        return owner+" ("+accountNumber+") "+balance;
    }




}
