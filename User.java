public class User {
    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount();
        c.deposit(10000);
        c.withdraw(20000);
        SavingsAccount s = new SavingsAccount();
        s.deposit(10000);
        s.withdraw(20000);

    }
}
