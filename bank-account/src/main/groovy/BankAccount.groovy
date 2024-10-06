class BankAccount {

    def closed = true
    def balance = 0

    // You cannot do any operations before you open the account.
    // An account opens with a balance of 0
    // You can reopen an account
    void open() {
        closed = false
    }

    // you cannot do any operations after you close the account
    void close() {
        closed = true
    }

    // this should increment the balance
    // you cannot deposit into a closed account
    // you cannot deposit a negative amount 
    synchronized void deposit(int amount) {
        if (closed || amount < 0) throw new Exception()

        balance += amount
    }

    // this should decrement the balance
    // you cannot withdraw into a closed account
    // you cannot withdraw a negative amount 
    synchronized void withdraw(int amount) {
        if (closed || amount < 0 || (balance - amount) < 0) throw new Exception()

        balance -= amount
    }

    // returns the current balance
    int getBalance() {
        if (closed) throw new Exception()

        return balance
    }

}