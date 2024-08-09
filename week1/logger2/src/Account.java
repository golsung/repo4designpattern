public class Account {
    private String owner;
    private int balance;
    private Logger myLogger;

    public void setLogger(Logger myLogger) {
        this.myLogger = myLogger;
    }

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
//        this.myLogger = new Logger();
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        myLogger.log("owner" + " : " + this.getOwner() + " deposit " + money);
        balance += money;
    }

    public void withdraw(int money) {
        if (balance >= money) {
            myLogger.log("owner" + " : " + this.getOwner() + " withdraw " + money);
            balance -= money;
        }
    }
}
