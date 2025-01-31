public class Account {

    private String id;
    private String name;
    private int balance = 0;

public Account(String id, String name){
    this.id = id;
    this.name = name;
}
// Account data
public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
}
// String to get ID
public String getID() {
    return id;
}
//String to get Name
public String getName() {
    return name;
}
// String to get Balance
public int getBalance() {
    return balance;
}
// String to add to balance
public int credit(int amount) {
    balance += amount;
    return balance;
}
//Checks if purchase can work
public int debit(int amount) {
    if (amount <= balance) {
        balance -= amount;
    } else {
        System.out.println("Purchase Amount Exceeds Balance");
    }
    return balance;
}

// Checks if transfer can work
public int transferTo(Account another, int amount) {
    if (amount <= balance) {
        balance-= amount;
        another.credit(amount);
    } else {
        System.out.println("Transfer Amount Exceeds Balance");
    }
    return balance;
}

@Override

public String toString() {
    return "Account[ID=" + id + ", Name=" + name + ", Balance=" + balance + "]";
}
}