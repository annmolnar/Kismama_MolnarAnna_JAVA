package trainingSolutions.bankAccount;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount("abcd", "Anna", 10000);
        BankAccount account2= new BankAccount("efgh", "Józsi", 20000);
        account1.deposit(5000);
        System.out.println(account1.getBalance());
        account2.withdraw(5000);
        System.out.println(account2.getBalance());

        account1.transfer(account2, 5000);
        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

    }
}
