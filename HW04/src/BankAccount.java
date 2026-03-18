public class BankAccount{
    private String ownerName;
    private String accountNum;
    private double balance;
    private static double MINIMUM_BALANCE = 50000;
    private static double TRANSFER_RATE = 0.2;

    public BankAccount(String name, String accNum, double initialBalance){
        if(name.equals("")){
            System.out.println("Error: Owner's name is invalid!");
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

    public void deposit(int money){
        if(money > 0){
            this.balance += money;
            System.out.println("Depositing successfully!");
        } else{
            System.out.println("Invalid input: The amount must be greater than 0!");
        }
    }

    public void withdraw(int money){
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


}