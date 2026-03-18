public class Main{
    public static void main(String[] args){

        //0. Creation failed
        BankAccount err1 = new BankAccount("", "12345", 100000);
        BankAccount err2 = new BankAccount("Mem 1", "123", 1000);

        //1. Test function
        BankAccount acc1 = new BankAccount("User 1", "12345678", 100000);
        BankAccount acc2 = new BankAccount("User 2", "87654321", 60000);

        //2. Test deposit
        System.out.println();
        System.out.println("--TEST DEPOSIT--");
        acc1.deposit(5000);
        acc1.deposit(-5000);

        //3. Test withdraw
        System.out.println();
        System.out.println("--TEST WITHDRAW--");
        acc2.withdraw(2000);
        acc2.withdraw(-2000);
        acc2.withdraw(20000);

        //4. Test transfer
        System.out.println();
        System.out.println("--TEST TRANSFER--");
        acc1.transfer(acc2, 5000);
        acc2.transfer(acc1, 20000);
        acc2.transfer(acc1, 5000);

        //5. Test pay bill
        System.out.println();
        System.out.println("--TEST PAY BILL--");
        acc1.payBill("Electric", 2000);

        //6. Display balance of each account
        System.out.println("The balance of " + acc1.getOwner() + " - id: " + acc1.getAccNum() + " is: " + acc1.getBalance());
        System.out.println("The balance of " + acc2.getOwner() + " - id: " + acc2.getAccNum() + " is: " + acc2.getBalance());


    }
}
