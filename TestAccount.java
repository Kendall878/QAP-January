public class TestAccount {
    public static void main(String[] args) {
        // Creating account information
        Account acc1 = new Account("A101", "Trevor Creids", 5000);
        Account acc2 = new Account("A102", "Anna Pines", 4000);

        // Print account details
        System.out.println("Initial Account Details:");
        System.out.println(acc1);
        System.out.println(acc2);

        // Transfer test from Acc1 to Acc2
        System.out.println("\nTransfering $1000 from Acc1 to Acc2");
        acc1.transferTo(acc2, 1000);
  
        System.out.println("\nFinal Balance");
        System.out.println("Acc1 Balance: $" + acc1.getBalance());
        System.out.println("Acc2 Balance $" + acc2.getBalance());
    }
}
