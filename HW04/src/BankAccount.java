public class BankAccount{
    private String ownerName;
    private String accountNum;
    private double balance;
    private static double MINIMUM_BALANCE = 50000;
    private static double TRANSFER_RATE = 0.2;

    public BankAccount(String name, String accNum, double initialBalance){
        if(name == null || name.trim().isEmpty()){
            System.out.println("Error: You must enter the owner's name!");
            return;
        }

        if(initialBalance < MINIMUM_BALANCE){
            System.out.println("Error: Initial balance must be at least " + MINIMUM_BALANCE);
            return;
        }

        this.ownerName = name;
        this.accountNum = accNum;
        this.balance = initialBalance;
        System.out.println("Bank account created successfully!");
    }

    public String getOwner(){
        return this.ownerName;
    }

    public String getAccNum(){
        return this.accountNum;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double money){
        if(money > 0){
            this.balance += money;
            System.out.println("Depositing successfully!");
        } else{
            System.out.println("Invalid input: The amount must be greater than 0!");
        }
    }

    public void withdraw(double money){
        if(money > 0){
            if(this.balance - money >= MINIMUM_BALANCE){
                this.balance -= money;
                System.out.println("Withdrawing successfully!");
            } else{
                System.out.println("The remaining money must be greater than " + MINIMUM_BALANCE);
            } 
        } else {
            System.out.println("Invalid input: The amount must be greater than 0!");
        }
    }

    public void transfer(BankAccount receiver, double money){
        if(money <= 0){
            System.out.println("Invalid input: The amount must be greater than 0!");
            return;
        }

        double fee = money * TRANSFER_RATE;
        double totalTransfer = fee + money;

        if(this.balance - totalTransfer < MINIMUM_BALANCE){
            System.out.println("Insufficient funds to cover amount and 2% fee!");
        } else{
            this.balance -= totalTransfer;
            receiver.deposit(money);
            System.out.println("----TRANSACTION RECEIPT----");
            System.out.println("Sender: " + this.ownerName);
            System.out.println("Receiver: " + receiver.getOwner());
            System.out.println("Transfer amount: " + money);
            System.out.println("Transfer fee (2%): " + fee);
            System.out.println("Total deduction: " + totalTransfer);
            System.out.println("---------------------------");
        }
    }

    public void payBill(String billName, double money){
        if(money <= 0){
            System.out.println("Invalid input: The amount must be greater than 0!");
            return;
        }

        if(this.balance - money < MINIMUM_BALANCE){
            System.out.println("Insufficient funds to cover the bill!");
            return;
        }

        this.balance -= money;
        System.out.println(this.ownerName + " successfully paid " + billName + " bill: " + money);
    }

}